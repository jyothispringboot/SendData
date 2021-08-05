package com.posidex.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebServiceContext;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.posidex.biz.jdbc.business.RequestProcessManager;
import com.posidex.dto.OutPutData;
import com.posidex.dto.OutPutForSAS;
import com.posidex.dto.Response;
import com.posidex.dto.SendOutputResponseType;
import com.posidex.dto.ServiceResponseType;
import com.posidex.listeners.ApplicationContextListener;
import com.posidex.ws.entity.PostDedupeRequestOutputDTO;



@Path("/web")
@Controller
public class SearchWebservice  {
	
	/** The Logger Object */
	public static final Logger logger=LogManager.getLogger(SearchWebservice.class);

	/** The Service Object */
	Properties props = null;
	
	RequestProcessManager manager;
	@Resource
	public WebServiceContext	context;

	Map<String, String>			srcSystemsMap	= new HashMap<String, String>();

	
	public SearchWebservice() {
		logger.debug("Loading the Props in SearchWebservice constructor");
		props = ApplicationContextListener.getProperties();
	}
	
	@POST
	@Path("/input")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public synchronized ServiceResponseType postQuery(@RequestBody OutPutForSAS outPutForSAS) {
		logger.info("inside getCustomerData");
		Response res = null;
		manager =RequestProcessManager.getInstance();
		
		ServiceResponseType s =new ServiceResponseType();
		try {
			
			logger.error("Customer Data"+outPutForSAS);
			System.out.println("Customer Data"+outPutForSAS);
			
			s.setINSCNT("1");
		} catch (Exception e) {
			logger.error("Error in getCustomerData");
			logger.error(e, e);
			res = buildResponse("Internal server error", "FAILURE", new ServiceResponseType());
		}
		
		
		logger.info("leaving getCustomerData");
		//return new ResponseEntity<ServiceResponseType>(s, HttpStatus.OK);
		return s;
		
	}
	
	 @GET
	 @Path("/response")
	 @Produces(MediaType.APPLICATION_JSON)
	 public synchronized SendOutputResponseType sendResponse() {
		 SendOutputResponseType outputResponseType=new SendOutputResponseType();
		 OutPutData outputData=new OutPutData();
		 List<OutPutData> resData=new ArrayList<OutPutData>();
		 outputData.setCustidPart5("VP_31432145");	
		 outputData.setStatus("C");
		 outputData.setFlag1("I");
		 resData.add(outputData);
		 outputResponseType.setOUTPUTDATA(resData);		 
		 return outputResponseType;
		
		 
	 }
	 
	private synchronized Response buildResponse(String message, String status, Object obj) {
		Response res = new Response();
		res.setData(obj);
		res.setMsg(message);
		res.setStatus(status);
		return res;
	}

	
	
	 
	private ServiceResponseType populateOutPutForSASDTO( PostDedupeRequestOutputDTO responseInfoDTO )
	{
		ServiceResponseType responseInfo = new ServiceResponseType();
		if (responseInfoDTO.getERRORMSG().contains("unique constraint"))
		{
			responseInfo.setERRORMSG("Filename is already exists");
		}
		else if (responseInfoDTO.getERRORMSG().contains("SQLException"))
		{
			responseInfo.setERRORMSG("Internal Error Please try again");
		}
		else
		{
			responseInfo.setERRORMSG(responseInfoDTO.getERRORMSG());
		}
		responseInfo.setINSCNT(responseInfoDTO.getINSCNT());
		return responseInfo;
	}

	
	private OutPutForSAS populateInputOutPutForSASDTO( OutPutForSAS outPutForSAS )
	{
		OutPutForSAS outPutForSASDTO = new OutPutForSAS();
		outPutForSASDTO.setCustidPart2("?".equals(outPutForSAS.getCustidPart2()) ? null : outPutForSAS.getCustidPart2());
		outPutForSASDTO.setProductID("?".equals(outPutForSAS.getProductID()) ? null : outPutForSAS.getProductID());
		outPutForSASDTO.setFlag1("?".equals(outPutForSAS.getFlag1()) ? null : outPutForSAS.getFlag1());
		outPutForSASDTO.setCustId("?".equals(outPutForSAS.getCustId()) ? null : outPutForSAS.getCustId());
		outPutForSASDTO.setLoanAmount("?".equals(outPutForSAS.getLoanAmount()) ? null : outPutForSAS.getLoanAmount());
		outPutForSASDTO.setBranchId("?".equals(outPutForSAS.getBranchId()) ? null : outPutForSAS.getBranchId());
		outPutForSASDTO.setFirstName("?".equals(outPutForSAS.getFirstName()) ? null : outPutForSAS.getFirstName());
		outPutForSASDTO.setMiddleName("?".equals(outPutForSAS.getMiddleName()) ? null : outPutForSAS.getMiddleName());
		outPutForSASDTO.setLastName("?".equals(outPutForSAS.getLastName()) ? null : outPutForSAS.getLastName());
		outPutForSASDTO.setDob("?".equals(outPutForSAS.getDob()) ? null : outPutForSAS.getDob());
		outPutForSASDTO.setResAddress("?".equals(outPutForSAS.getResAddress()) ? null : outPutForSAS.getResAddress());
		outPutForSASDTO.setResCity("?".equals(outPutForSAS.getResCity()) ? null : outPutForSAS.getResCity());
		outPutForSASDTO.setResState("?".equals(outPutForSAS.getResState()) ? null : outPutForSAS.getResState());
		outPutForSASDTO.setResPinCode("?".equals(outPutForSAS.getResPinCode()) ? null : outPutForSAS.getResPinCode());
		outPutForSASDTO.setResPhoneNo("?".equals(outPutForSAS.getResPhoneNo()) ? null : outPutForSAS.getResPhoneNo());
		outPutForSASDTO.setExName1("?".equals(outPutForSAS.getExName1()) ? null : outPutForSAS.getExName1());
		outPutForSASDTO.setOffAddress("?".equals(outPutForSAS.getOffAddress()) ? null : outPutForSAS.getOffAddress());
		outPutForSASDTO.setOffCity("?".equals(outPutForSAS.getOffCity()) ? null : outPutForSAS.getOffCity());
		outPutForSASDTO.setOffState("?".equals(outPutForSAS.getOffState()) ? null : outPutForSAS.getOffState());
		outPutForSASDTO.setOffPinCode("?".equals(outPutForSAS.getOffPinCode()) ? null : outPutForSAS.getOffPinCode());
		outPutForSASDTO.setOffPhoneNo("?".equals(outPutForSAS.getOffPhoneNo()) ? null : outPutForSAS.getOffPhoneNo());
		outPutForSASDTO.setPromotion("?".equals(outPutForSAS.getPromotion()) ? null : outPutForSAS.getPromotion());
		outPutForSASDTO.setPan("?".equals(outPutForSAS.getPan()) ? null : outPutForSAS.getPan());
		outPutForSASDTO.setVoterid("?".equals(outPutForSAS.getVoterid()) ? null : outPutForSAS.getVoterid());
		outPutForSASDTO.setPassportNo("?".equals(outPutForSAS.getPassportNo()) ? null : outPutForSAS.getPassportNo());
		outPutForSASDTO.setDrivingLic("?".equals(outPutForSAS.getDrivingLic()) ? null : outPutForSAS.getDrivingLic());
		outPutForSASDTO.setExEq4("?".equals(outPutForSAS.getExEq4()) ? null : outPutForSAS.getExEq4());
		outPutForSASDTO.setMobilePhoneNo("?".equals(outPutForSAS.getMobilePhoneNo()) ? null : outPutForSAS.getMobilePhoneNo());
		outPutForSASDTO.setExEq8("?".equals(outPutForSAS.getExEq8()) ? null : outPutForSAS.getExEq8());
		outPutForSASDTO.setExEq7("?".equals(outPutForSAS.getExEq7()) ? null : outPutForSAS.getExEq7());
		outPutForSASDTO.setBlank("?".equals(outPutForSAS.getBlank()) ? null : outPutForSAS.getBlank());
		outPutForSASDTO.setSourceBrokerId("?".equals(outPutForSAS.getSourceBrokerId()) ? null : outPutForSAS.getSourceBrokerId());
		outPutForSASDTO.setExEq5("?".equals(outPutForSAS.getExEq5()) ? null : outPutForSAS.getExEq5());
		outPutForSASDTO.setSex("?".equals(outPutForSAS.getSex()) ? null : outPutForSAS.getSex());
		outPutForSASDTO.setInstaLoanflag("?".equals(outPutForSAS.getInstaLoanflag()) ? null : outPutForSAS.getInstaLoanflag());
		outPutForSASDTO.setCustidPart5("?".equals(outPutForSAS.getCustidPart5()) ? null : outPutForSAS.getCustidPart5());
		outPutForSASDTO.setSetTargetDB("?".equals(outPutForSAS.getSetTargetDB()) ? null : outPutForSAS.getSetTargetDB());
		outPutForSASDTO.setSetCreditBureaus("?".equals(outPutForSAS.getSetCreditBureaus()) ? null : outPutForSAS.getSetCreditBureaus());
		outPutForSASDTO.setMatchCodeSet("?".equals(outPutForSAS.getMatchCodeSet()) ? null : outPutForSAS.getMatchCodeSet());
		outPutForSASDTO.setFeedSysId("?".equals(outPutForSAS.getFeedSysId()) ? null : outPutForSAS.getFeedSysId());
		outPutForSASDTO.setInputDate("?".equals(outPutForSAS.getInputDate()) ? null : outPutForSAS.getInputDate());
		outPutForSASDTO.setConsumerID("?".equals(outPutForSAS.getConsumerID()) ? null : outPutForSAS.getConsumerID());
		outPutForSASDTO.setConsumerIP("?".equals(outPutForSAS.getConsumerIP()) ? null : outPutForSAS.getConsumerIP());
		outPutForSASDTO.setConsumerPW("?".equals(outPutForSAS.getConsumerPW()) ? null : outPutForSAS.getConsumerPW());
		outPutForSASDTO.setDecisioning("?".equals(outPutForSAS.getDecisioning()) ? null : outPutForSAS.getDecisioning());
		outPutForSASDTO.setFiller1("?".equals(outPutForSAS.getFiller1()) ? null : outPutForSAS.getFiller1());
		outPutForSASDTO.setFiller2("?".equals(outPutForSAS.getFiller2()) ? null : outPutForSAS.getFiller2());
		outPutForSASDTO.setFiller3("?".equals(outPutForSAS.getFiller3()) ? null : outPutForSAS.getFiller3());
		outPutForSASDTO.setFiller4("?".equals(outPutForSAS.getFiller4()) ? null : outPutForSAS.getFiller4());
		outPutForSASDTO.setFiller5("?".equals(outPutForSAS.getFiller5()) ? null : outPutForSAS.getFiller5());
		outPutForSASDTO.setFiller6("?".equals(outPutForSAS.getFiller6()) ? null : outPutForSAS.getFiller6());
		outPutForSASDTO.setFiller7("?".equals(outPutForSAS.getFiller7()) ? null : outPutForSAS.getFiller7());
		outPutForSASDTO.setFiller8("?".equals(outPutForSAS.getFiller8()) ? null : outPutForSAS.getFiller8());
		outPutForSASDTO.setFiller9("?".equals(outPutForSAS.getFiller9()) ? null : outPutForSAS.getFiller9());
		outPutForSASDTO.setFiller10("?".equals(outPutForSAS.getFiller10()) ? null : outPutForSAS.getFiller10());
		outPutForSASDTO.setFiller11("?".equals(outPutForSAS.getFiller11()) ? null : outPutForSAS.getFiller11());
		outPutForSASDTO.setFiller12("?".equals(outPutForSAS.getFiller12()) ? null : outPutForSAS.getFiller12());
		outPutForSASDTO.setFiller13("?".equals(outPutForSAS.getFiller13()) ? null : outPutForSAS.getFiller13());
		outPutForSASDTO.setFiller14("?".equals(outPutForSAS.getFiller14()) ? null : outPutForSAS.getFiller14());
		outPutForSASDTO.setFiller15("?".equals(outPutForSAS.getFiller15()) ? null : outPutForSAS.getFiller15());
		outPutForSASDTO.setFiller16("?".equals(outPutForSAS.getFiller16()) ? null : outPutForSAS.getFiller16());
		outPutForSASDTO.setFiller17("?".equals(outPutForSAS.getFiller17()) ? null : outPutForSAS.getFiller17());
		outPutForSASDTO.setFiller18("?".equals(outPutForSAS.getFiller18()) ? null : outPutForSAS.getFiller18());
		outPutForSASDTO.setFiller19("?".equals(outPutForSAS.getFiller19()) ? null : outPutForSAS.getFiller19());
		outPutForSASDTO.setFiller20("?".equals(outPutForSAS.getFiller20()) ? null : outPutForSAS.getFiller20());
		outPutForSASDTO.setFiller21("?".equals(outPutForSAS.getFiller21()) ? null : outPutForSAS.getFiller21());
		outPutForSASDTO.setFiller22("?".equals(outPutForSAS.getFiller22()) ? null : outPutForSAS.getFiller22());
		outPutForSASDTO.setFiller23("?".equals(outPutForSAS.getFiller23()) ? null : outPutForSAS.getFiller23());
		outPutForSASDTO.setFiller24("?".equals(outPutForSAS.getFiller24()) ? null : outPutForSAS.getFiller24());
		outPutForSASDTO.setFiller25("?".equals(outPutForSAS.getFiller25()) ? null : outPutForSAS.getFiller25());

		return outPutForSASDTO;
	}

}