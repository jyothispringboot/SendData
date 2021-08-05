
package com.posidex.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



import io.swagger.annotations.ApiModelProperty;

//import org.codehaus.jackson.annotate.JsonProperty;
//import org.codehaus.jackson.annotate.JsonPropertyOrder;
//import org.springframework.beans.factory.annotation.Autowired;

//import io.swagger.annotations.ApiModelProperty;




/**
 * <p>Java class for OutPutData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutPutData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOA_APP_ID_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_CUST_ID_N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_STATUS_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_CUST_TYPE_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_CUST_EXPOSURE_N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_DEDUPE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_BORROWER_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_MATCH_APPID_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_PRODUCT_CODE_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_SOURCE_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_FNAME_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_MNAME_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_LNAME_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_FILE_NAME_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_SAS_UPDATE_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_SAS_UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_READ_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOA_READ_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_38" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_39" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_41" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_42" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_43" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_44" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_45" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_46" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_47" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_48" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_49" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_50" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_51" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_52" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_53" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_54" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_55" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_56" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_57" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_58" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_59" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FILLER_60" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "OutPutData", propOrder = {
		//"custidPart2","custId","status","custTypeFlag","custExposure","dedupeDate","flag1","matchAppId","productCode","feedSysId","firstName","middleName","lastName","custidPart5","sasUpdateStatus","sasUpdateDate","readFlag","readDate","dob","resCity","exName1","delqString","filler5","filler6","exEq8","exEq4","filler9","mailingAddr","resAddress","resPinCode","filler13","filler14","loanAmtApplied","disbDate","filler17","filler18","filler19","filler20","totalExposure","resState","filler23","filler24","filler25","filler26","filler27","filler28","filler29","dpd","matchCriteriaNum","forceChangeUser","remarks","resPhoneNo","pan","voterid","passportNo","drivingLic","exEq3","mobilePhoneNo","location","offAddress","offCity","offPhoneNo","offPinCode","exEq7","tenure","loanStatus","noOfMonthsDefault","delqAmount","filler51","emi","filler53","daysOverlineCurrent","daysOverlineYtd","overDraftCollateralDtl","overDraftLimitNo","npaStageId","sasId","dedupeCategory"})

@JsonPropertyOrder({"custidPart2","custId","status","custTypeFlag","custExposure","dedupeDate",
	"flag1","matchAppId","productCode","feedSysId","firstName","middleName","lastName","custidPart5",
	"sasUpdateStatus","sasUpdateDate","readFlag","readDate","EMAILID","EMAILID1","EMAILID2","Constitution",
	"OtherBankAccount","OtherBankName","UserID","PosidexEnquiryDate","MatchParameter","dob","resCity","exName1","delqString","filler5",
	"filler6","exEq8","exEq4","filler9","mailingAddr","resAddress","resPinCode","filler13","filler14",
	"loanAmtApplied","disbDate","filler17","filler18","filler19","filler20","totalExposure","resState","filler23",
	"filler24","filler25","filler26","filler27","filler28","filler29","dpd","matchCriteriaNum","forceChangeUser","remarks",
	"resPhoneNo","pan","voterid","passportNo","drivingLic","exEq3","mobilePhoneNo","location","offAddress","offCity","offPhoneNo",
	"offPinCode","exEq7","tenure","loanStatus","noOfMonthsDefault","delqAmount","filler51","emi","filler53","daysOverlineCurrent",
	"daysOverlineYtd","overDraftCollateralDtl","overDraftLimitNo","npaStageId","sasId","dedupeCategory"})
public class OutPutData {

		
		@ApiModelProperty(value="SOA_APP_ID_C",position=0)
		@JsonProperty("SOA_APP_ID_C")
		protected String custidPart2;
	
		@ApiModelProperty(value="SOA_APP_ID_C",position = 1)
		@JsonProperty("SOA_CUST_ID_N")
		protected String custId;
	
		@ApiModelProperty(value="SOA_STATUS_C",position = 2)
	    @JsonProperty("SOA_STATUS_C")
	    protected String status;
		
		@ApiModelProperty(value="SOA_CUST_TYPE_C",position=3)
		@JsonProperty("SOA_CUST_TYPE_C")	    		
	    protected String custTypeFlag;
	    
		@ApiModelProperty(value="SOA_CUST_EXPOSURE_N",position=4)
		@JsonProperty("SOA_CUST_EXPOSURE_N")	    		
	    protected String custExposure;
	    
		@ApiModelProperty(value="SOA_DEDUPE_DATE",position=5)
		@JsonProperty("SOA_DEDUPE_DATE")	    		
	    protected String dedupeDate;
	    
		@ApiModelProperty(value="SOA_BORROWER_F",position=6,required=true)
		@JsonProperty("SOA_BORROWER_F")		    		
	    protected String flag1;
	    
		@ApiModelProperty(value="SOA_MATCH_APPID_C",position=7)
		@JsonProperty("SOA_MATCH_APPID_C")	    		
	    protected String matchAppId;
	    
		@ApiModelProperty(value="SOA_PRODUCT_CODE_C",position=8)
		@JsonProperty("SOA_PRODUCT_CODE_C")		    		
	    protected String productCode;
	    
	    
		@ApiModelProperty(value="SOA_SOURCE_C",position=9)
		@JsonProperty("SOA_SOURCE_C")	    		
	    protected String feedSysId;
	    

		@ApiModelProperty(value="SOA_FNAME_C",position=10,required=true)
		@JsonProperty("SOA_FNAME_C")	    		
	    protected String firstName;
	    
		@ApiModelProperty(value="SOA_MNAME_C",position=11)
		@JsonProperty("SOA_MNAME_C")	    		
	    protected String middleName;
	    
		@ApiModelProperty(value="SOA_LNAME_C",position=12)
		@JsonProperty("SOA_LNAME_C")	    		
	    protected String lastName;
	    
		@ApiModelProperty(value="SOA_FILE_NAME_C",position=13,required=true)
		@JsonProperty("SOA_FILE_NAME_C")	    	
	    protected String custidPart5;
	    
		@ApiModelProperty(value="SOA_SAS_UPDATE_STATUS",position=14)
		@JsonProperty("SOA_SAS_UPDATE_STATUS")	    		
	    protected String sasUpdateStatus;
	    
		@ApiModelProperty(value="SOA_SAS_UPDATE_DATE",position=15)
		@JsonProperty("SOA_SAS_UPDATE_DATE")	    		
	    protected String sasUpdateDate;
	    
		 
		@ApiModelProperty(value="SOA_READ_FLAG",position=16)
		@JsonProperty("SOA_READ_FLAG")	    		
	    protected String readFlag;	
		
		@ApiModelProperty(value="SOA_READ_DATE",position=17)
		@JsonProperty("SOA_READ_DATE")					
	    protected String readDate;
		
		//------------------------------- followed  9 cols are new cols--------------------------------
		@ApiModelProperty(value="EMAILID",position=18)
		@JsonProperty("EMAILID")					
	    protected String EMAILID;
		
		@ApiModelProperty(value="EMAILID1",position=19)
		@JsonProperty("EMAILID1")					
	    protected String EMAILID1;
		
		@ApiModelProperty(value="SOA_READ_DATE",position=20)
		@JsonProperty("EMAILID2")					
	    protected String EMAILID2;
		
		@ApiModelProperty(value="Constitution",position=21)
		@JsonProperty("Constitution")					
	    protected String Constitution;
		
		@ApiModelProperty(value="OtherBankAccount",position=22)
		@JsonProperty("OtherBankAccount")					
	    protected String OtherBankAccount;
		
		@ApiModelProperty(value="OtherBankName",position=23)
		@JsonProperty("OtherBankName")					
	    protected String OtherBankName;
		
		@ApiModelProperty(value="UserID",position=24)
		@JsonProperty("UserID")					
	    protected String UserID;
		
		@ApiModelProperty(value="PosidexEnquiryDate",position=25)
		@JsonProperty("PosidexEnquiryDate")					
	    protected String PosidexEnquiryDate;
		
		@ApiModelProperty(value="Match Parameter",position=26)
		@JsonProperty("Match Parameter")					
	    protected String MatchParameter;
		//------------------------------------------------------------------
				  		
		@ApiModelProperty(value="FILLER_1",position=27)
		@JsonProperty("FILLER_1")
	    protected String dob;
	    
		@ApiModelProperty(value="FILLER_2",position=28)
		@JsonProperty("FILLER_2")	    		
	    protected String resCity;
	    
		@ApiModelProperty(value="FILLER_3",position=29)
		@JsonProperty("FILLER_3")	    		
	    protected String exName1;
	    
		@ApiModelProperty(value="FILLER_4",position=30)
		@JsonProperty("FILLER_4")
	    protected String delqString;
	    
		@ApiModelProperty(value="FILLER_5",position=31)
		@JsonProperty("FILLER_5")
	    protected String filler5;
	    
		@ApiModelProperty(value="FILLER_6",position=32)
		@JsonProperty("FILLER_6")
	    protected String filler6;
	    
		@ApiModelProperty(value="FILLER_7",position=33)
		@JsonProperty("FILLER_7")
	    protected String exEq8;
	    
		@ApiModelProperty(value="FILLER_8",position=34)
		@JsonProperty("FILLER_8")
	    protected String exEq4;
	    
		@ApiModelProperty(value="FILLER_9",position=35)
		@JsonProperty("FILLER_9")
	    protected String filler9;
	    
		@ApiModelProperty(value="FILLER_10",position=36)
		@JsonProperty("FILLER_10")
	    protected String mailingAddr;
	    
		@ApiModelProperty(value="FILLER_11",position=37)
		@JsonProperty("FILLER_11")
	    protected String resAddress;
	    
		@ApiModelProperty(value="FILLER_12",position=38)
		@JsonProperty("FILLER_12")
	    protected String resPinCode;
		
		@ApiModelProperty(value="FILLER_13",position=39)
		@JsonProperty("FILLER_13")
	    protected String filler13;
		
		@ApiModelProperty(value="FILLER_14",position=40)
		@JsonProperty("FILLER_14")
	    protected String filler14;
	    
		@ApiModelProperty(value="FILLER_15",position=41)
		@JsonProperty("FILLER_15")
	    protected String loanAmtApplied;
	    
		@ApiModelProperty(value="FILLER_16",position=42)
		@JsonProperty("FILLER_16")
	    protected String disbDate;
	    
		@ApiModelProperty(value="FILLER_17",position=43)
		@JsonProperty("FILLER_17")
	    protected String filler17;
	    
		@ApiModelProperty(value="FILLER_18",position=44)
		@JsonProperty("FILLER_18")
	    protected String filler18;
	    
		@ApiModelProperty(value="FILLER_19",position=45)
		@JsonProperty("FILLER_19")
	    protected String filler19;
	    
		@ApiModelProperty(value="FILLER_20",position=46)
		@JsonProperty("FILLER_20")
	    protected String filler20;
	    
		@ApiModelProperty(value="FILLER_21",position=47)
		@JsonProperty("FILLER_21")
	    protected String totalExposure;
	    
		@ApiModelProperty(value="FILLER_22",position=48)
		@JsonProperty("FILLER_22")
	    protected String resState;
	    
		@ApiModelProperty(value="FILLER_23",position=49)
		@JsonProperty("FILLER_23")
	    protected String filler23;
	    
		@ApiModelProperty(value="FILLER_24",position=50)
		@JsonProperty("FILLER_24")
	    protected String filler24;
	    
		@ApiModelProperty(value="FILLER_25",position=51)
		@JsonProperty("FILLER_25")
	    protected String filler25;
	    
		@ApiModelProperty(value="FILLER_26",position=52)
		@JsonProperty("FILLER_26")
	    protected String filler26;
	    
		@ApiModelProperty(value="FILLER_27",position=53)
		@JsonProperty("FILLER_27")
	    protected String filler27;
	    
		@ApiModelProperty(value="FILLER_28",position=54)
		@JsonProperty("FILLER_28")
	    protected String filler28;
	    
		@ApiModelProperty(value="FILLER_29",position=55)
		@JsonProperty("FILLER_29")
	    protected String filler29;
	    
		@ApiModelProperty(value="FILLER_30",position=56)
		@JsonProperty("FILLER_30")
	    protected String dpd;
		
		@ApiModelProperty(value="FILLER_31",position=57)
		@JsonProperty("FILLER_31")
		protected String matchCriteriaNum;
		 
		@ApiModelProperty(value="FILLER_32",position=58)
		@JsonProperty("FILLER_32")
		protected String forceChangeUser;
		    
		@ApiModelProperty(value="FILLER_33",position=59)
		@JsonProperty("FILLER_33")
		protected String remarks;
		    
		@ApiModelProperty(value="FILLER_34",position=60)
		@JsonProperty("FILLER_34")
		protected String resPhoneNo;
		    
		@ApiModelProperty(value="FILLER_35",position=61)
		@JsonProperty("FILLER_35")
		protected String pan;
		    
		@ApiModelProperty(value="FILLER_36",position=62)
		@JsonProperty("FILLER_36")
		protected String voterid;
		    
		@ApiModelProperty(value="FILLER_37",position=63)
		@JsonProperty("FILLER_37")
		protected String passportNo;
		    
		@ApiModelProperty(value="FILLER_38",position=64)
		@JsonProperty("FILLER_38")
		protected String drivingLic;
		    
		@ApiModelProperty(value="FILLER_39",position=65)
		@JsonProperty("FILLER_39")
		protected String exEq3;
		    
		@ApiModelProperty(value="FILLER_40",position=66)
		@JsonProperty("FILLER_40")
		protected String mobilePhoneNo;
		    
		@ApiModelProperty(value="FILLER_41",position=67)
		@JsonProperty("FILLER_41")
		protected String location;
		    
		@ApiModelProperty(value="FILLER_42",position=68)
		@JsonProperty("FILLER_42")
		protected String offAddress;
		    
		@ApiModelProperty(value="FILLER_43",position=69)
		@JsonProperty("FILLER_43")
		protected String offCity;
		    
		@ApiModelProperty(value="FILLER_44",position=70)
		@JsonProperty("FILLER_44")
		protected String offPhoneNo;
		    
		@ApiModelProperty(value="FILLER_45",position=71)
		@JsonProperty("FILLER_45")
		protected String offPinCode;
		    
		@ApiModelProperty(value="FILLER_46",position=72)
		@JsonProperty("FILLER_46")
		protected String exEq7;
		    
		@ApiModelProperty(value="FILLER_47",position=73)
		@JsonProperty("FILLER_47")
		protected String tenure;
		    
		@ApiModelProperty(value="FILLER_48",position=74)
		@JsonProperty("FILLER_48")
		protected String loanStatus;
		    
		@ApiModelProperty(value="FILLER_49",position=75)
		@JsonProperty("FILLER_49")
		protected String noOfMonthsDefault;
		    
		@ApiModelProperty(value="FILLER_50",position=76)
		@JsonProperty("FILLER_50")
		protected String delqAmount;
		    
		@ApiModelProperty(value="FILLER_51",position=77)
		@JsonProperty("FILLER_51")
		protected String filler51;
		    
		@ApiModelProperty(value="FILLER_52",position=78)
		@JsonProperty("FILLER_52")
		protected String emi;
		    
		@ApiModelProperty(value="FILLER_53",position=79)
		@JsonProperty("FILLER_53")
		protected String filler53;
		    
		@ApiModelProperty(value="FILLER_54",position=80)
		@JsonProperty("FILLER_54")
		protected String daysOverlineCurrent;
		    
		@ApiModelProperty(value="FILLER_55",position=81)
		@JsonProperty("FILLER_55")
		protected String daysOverlineYtd;
		    
		@ApiModelProperty(value="FILLER_56",position=82)
		@JsonProperty("FILLER_56")
		 protected String overDraftCollateralDtl;
		    
		@ApiModelProperty(value="FILLER_57",position=83)
		@JsonProperty("FILLER_57")
		 protected String overDraftLimitNo;
		    
		@ApiModelProperty(value="FILLER_58",position=84)
		@JsonProperty("FILLER_58")
		 protected String npaStageId;
		    
		@ApiModelProperty(value="FILLER_59",position=85)
		@JsonProperty("FILLER_59")
		 protected String sasId;
		    
		@ApiModelProperty(value="FILLER_60",position=86)
		@JsonProperty("FILLER_60")
		 protected String dedupeCategory;
	
  /*  @XmlElement(name = "SOA_APP_ID_C", required=true)
    protected String custidPart2;
    @XmlElement(name = "SOA_CUST_ID_N", required=true)
    protected String custId;
    @XmlElement(name = "SOA_STATUS_C")
    protected String status;
    @XmlElement(name = "SOA_CUST_TYPE_C")
    protected String custTypeFlag;
    @XmlElement(name = "SOA_CUST_EXPOSURE_N")
    protected String custExposure;
    @XmlElement(name = "SOA_DEDUPE_DATE")
    protected String dedupeDate;
    @XmlElement(name = "SOA_BORROWER_F", required=true)
    protected String flag1;
    @XmlElement(name = "SOA_MATCH_APPID_C")
    protected String matchAppId;
    @XmlElement(name = "SOA_PRODUCT_CODE_C")
    protected String productCode;
    @XmlElement(name = "SOA_SOURCE_C")
    protected String feedSysId;
    @XmlElement(name = "SOA_FNAME_C", required=true)
    protected String firstName;
    @XmlElement(name = "SOA_MNAME_C")
    protected String middleName;
    @XmlElement(name = "SOA_LNAME_C")
    protected String lastName;
    @XmlElement(name = "SOA_FILE_NAME_C", required=true)
    protected String custidPart5;
    @XmlElement(name = "SOA_SAS_UPDATE_STATUS")
    protected String sasUpdateStatus;
    @XmlElement(name = "SOA_SAS_UPDATE_DATE")
    protected String sasUpdateDate;
    @XmlElement(name = "SOA_READ_FLAG")
    protected String readFlag;
    @XmlElement(name = "SOA_READ_DATE")
    protected String readDate;
    @XmlElement(name = "FILLER_1")
    protected String dob;
    @XmlElement(name = "FILLER_2")
    protected String resCity;
    @XmlElement(name = "FILLER_3")
    protected String exName1;
    @XmlElement(name = "FILLER_4")
    protected String delqString;
    @XmlElement(name = "FILLER_5")
    protected String filler5;
    @XmlElement(name = "FILLER_6")
    protected String filler6;
    @XmlElement(name = "FILLER_7")
    protected String exEq8;
    @XmlElement(name = "FILLER_8")
    protected String exEq4;
    @XmlElement(name = "FILLER_9")
    protected String filler9;
    @XmlElement(name = "FILLER_10")
    protected String mailingAddr;
    @XmlElement(name = "FILLER_11")
    protected String resAddress;
    @XmlElement(name = "FILLER_12")
    protected String resPinCode;
    @XmlElement(name = "FILLER_13")
    protected String filler13;
    @XmlElement(name = "FILLER_14")
    protected String filler14;
    @XmlElement(name = "FILLER_15")
    protected String loanAmtApplied;
    @XmlElement(name = "FILLER_16")
    protected String disbDate;
    @XmlElement(name = "FILLER_17")
    protected String filler17;
    @XmlElement(name = "FILLER_18")
    protected String filler18;
    @XmlElement(name = "FILLER_19")
    protected String filler19;
    @XmlElement(name = "FILLER_20")
    protected String filler20;
    @XmlElement(name = "FILLER_21")
    protected String totalExposure;
    @XmlElement(name = "FILLER_22")
    protected String resState;
    @XmlElement(name = "FILLER_23")
    protected String filler23;
    @XmlElement(name = "FILLER_24")
    protected String filler24;
    @XmlElement(name = "FILLER_25")
    protected String filler25;
    @XmlElement(name = "FILLER_26")
    protected String filler26;
    @XmlElement(name = "FILLER_27")
    protected String filler27;
    @XmlElement(name = "FILLER_28")
    protected String filler28;
    @XmlElement(name = "FILLER_29")
    protected String filler29;
    @XmlElement(name = "FILLER_30")
    protected String dpd;
    @XmlElement(name = "FILLER_31")
    protected String matchCriteriaNum;
    @XmlElement(name = "FILLER_32")
    protected String forceChangeUser;
    @XmlElement(name = "FILLER_33")
    protected String remarks;
    @XmlElement(name = "FILLER_34")
    protected String resPhoneNo;
    @XmlElement(name = "FILLER_35")
    protected String pan;
    @XmlElement(name = "FILLER_36")
    protected String voterid;
    @XmlElement(name = "FILLER_37")
    protected String passportNo;
    @XmlElement(name = "FILLER_38")
    protected String drivingLic;
    @XmlElement(name = "FILLER_39")
    protected String exEq3;
    @XmlElement(name = "FILLER_40")
    protected String mobilePhoneNo;
    @XmlElement(name = "FILLER_41")
    protected String location;
    @XmlElement(name = "FILLER_42")
    protected String offAddress;
    @XmlElement(name = "FILLER_43")
    protected String offCity;
    @XmlElement(name = "FILLER_44")
    protected String offPhoneNo;
    @XmlElement(name = "FILLER_45")
    protected String offPinCode;
    @XmlElement(name = "FILLER_46")
    protected String exEq7;
    @XmlElement(name = "FILLER_47")
    protected String tenure;
    @XmlElement(name = "FILLER_48")
    protected String loanStatus;
    @XmlElement(name = "FILLER_49")
    protected String noOfMonthsDefault;
    @XmlElement(name = "FILLER_50")
    protected String delqAmount;
    @XmlElement(name = "FILLER_51")
    protected String filler51;
    @XmlElement(name = "FILLER_52")
    protected String emi;
    @XmlElement(name = "FILLER_53")
    protected String filler53;
    @XmlElement(name = "FILLER_54")
    protected String daysOverlineCurrent;
    @XmlElement(name = "FILLER_55")
    protected String daysOverlineYtd;
    @XmlElement(name = "FILLER_56")
    protected String overDraftCollateralDtl;
    @XmlElement(name = "FILLER_57")
    protected String overDraftLimitNo;
    @XmlElement(name = "FILLER_58")
    protected String npaStageId;
    @XmlElement(name = "FILLER_59")
    protected String sasId;
    @XmlElement(name = "FILLER_60")
    protected String dedupeCategory;*/
    
    public String getCustidPart2() {
		return custidPart2;
	}
	public void setCustidPart2(String custidPart2) {
		this.custidPart2 = custidPart2;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustTypeFlag() {
		return custTypeFlag;
	}
	public void setCustTypeFlag(String custTypeFlag) {
		this.custTypeFlag = custTypeFlag;
	}
	public String getCustExposure() {
		return custExposure;
	}
	public void setCustExposure(String custExposure) {
		this.custExposure = custExposure;
	}
	public String getDedupeDate() {
		return dedupeDate;
	}
	public void setDedupeDate(String dedupeDate) {
		this.dedupeDate = dedupeDate;
	}
	public String getFlag1() {
		return flag1;
	}
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}
	public String getMatchAppId() {
		return matchAppId;
	}
	public void setMatchAppId(String matchAppId) {
		this.matchAppId = matchAppId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getFeedSysId() {
		return feedSysId;
	}
	public void setFeedSysId(String feedSysId) {
		this.feedSysId = feedSysId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCustidPart5() {
		return custidPart5;
	}
	public void setCustidPart5(String custidPart5) {
		this.custidPart5 = custidPart5;
	}
	public String getSasUpdateStatus() {
		return sasUpdateStatus;
	}
	public void setSasUpdateStatus(String sasUpdateStatus) {
		this.sasUpdateStatus = sasUpdateStatus;
	}
	public String getSasUpdateDate() {
		return sasUpdateDate;
	}
	public void setSasUpdateDate(String sasUpdateDate) {
		this.sasUpdateDate = sasUpdateDate;
	}
	public String getReadFlag() {
		return readFlag;
	}
	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}
	public String getReadDate() {
		return readDate;
	}
	public void setReadDate(String readDate) {
		this.readDate = readDate;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getResCity() {
		return resCity;
	}
	public void setResCity(String resCity) {
		this.resCity = resCity;
	}
	public String getExName1() {
		return exName1;
	}
	public void setExName1(String exName1) {
		this.exName1 = exName1;
	}
	public String getDelqString() {
		return delqString;
	}
	public void setDelqString(String delqString) {
		this.delqString = delqString;
	}
	public String getFiller5() {
		return filler5;
	}
	public void setFiller5(String filler5) {
		this.filler5 = filler5;
	}
	public String getFiller6() {
		return filler6;
	}
	public void setFiller6(String filler6) {
		this.filler6 = filler6;
	}
	public String getExEq8() {
		return exEq8;
	}
	public void setExEq8(String exEq8) {
		this.exEq8 = exEq8;
	}
	public String getExEq4() {
		return exEq4;
	}
	public void setExEq4(String exEq4) {
		this.exEq4 = exEq4;
	}
	public String getFiller9() {
		return filler9;
	}
	public void setFiller9(String filler9) {
		this.filler9 = filler9;
	}
	public String getResAddress() {
		return resAddress;
	}
	public void setResAddress(String resAddress) {
		this.resAddress = resAddress;
	}
	public String getOffAddress() {
		return offAddress;
	}
	public void setOffAddress(String offAddress) {
		this.offAddress = offAddress;
	}
	public String getResPinCode() {
		return resPinCode;
	}
	public void setResPinCode(String resPinCode) {
		this.resPinCode = resPinCode;
	}
	public String getFiller13() {
		return filler13;
	}
	public void setFiller13(String filler13) {
		this.filler13 = filler13;
	}
	public String getFiller14() {
		return filler14;
	}
	public void setFiller14(String filler14) {
		this.filler14 = filler14;
	}
	public String getLoanAmtApplied() {
		return loanAmtApplied;
	}
	public void setLoanAmtApplied(String loanAmtApplied) {
		this.loanAmtApplied = loanAmtApplied;
	}
	public String getDisbDate() {
		return disbDate;
	}
	public void setDisbDate(String disbDate) {
		this.disbDate = disbDate;
	}
	public String getFiller17() {
		return filler17;
	}
	public void setFiller17(String filler17) {
		this.filler17 = filler17;
	}
	public String getFiller18() {
		return filler18;
	}
	public void setFiller18(String filler18) {
		this.filler18 = filler18;
	}
	public String getFiller19() {
		return filler19;
	}
	public void setFiller19(String filler19) {
		this.filler19 = filler19;
	}
	public String getFiller20() {
		return filler20;
	}
	public void setFiller20(String filler20) {
		this.filler20 = filler20;
	}
	public String getTotalExposure() {
		return totalExposure;
	}
	public void setTotalExposure(String totalExposure) {
		this.totalExposure = totalExposure;
	}
	public String getResState() {
		return resState;
	}
	public void setResState(String resState) {
		this.resState = resState;
	}
	public String getFiller23() {
		return filler23;
	}
	public void setFiller23(String filler23) {
		this.filler23 = filler23;
	}
	public String getFiller24() {
		return filler24;
	}
	public void setFiller24(String filler24) {
		this.filler24 = filler24;
	}
	public String getFiller25() {
		return filler25;
	}
	public void setFiller25(String filler25) {
		this.filler25 = filler25;
	}
	public String getFiller26() {
		return filler26;
	}
	public void setFiller26(String filler26) {
		this.filler26 = filler26;
	}
	public String getFiller27() {
		return filler27;
	}
	public void setFiller27(String filler27) {
		this.filler27 = filler27;
	}
	public String getFiller28() {
		return filler28;
	}
	public void setFiller28(String filler28) {
		this.filler28 = filler28;
	}
	public String getFiller29() {
		return filler29;
	}
	public void setFiller29(String filler29) {
		this.filler29 = filler29;
	}
	public String getDpd() {
		return dpd;
	}
	public void setDpd(String dpd) {
		this.dpd = dpd;
	}
	public String getMatchCriteriaNum() {
		return matchCriteriaNum;
	}
	public void setMatchCriteriaNum(String matchCriteriaNum) {
		this.matchCriteriaNum = matchCriteriaNum;
	}
	public String getForceChangeUser() {
		return forceChangeUser;
	}
	public void setForceChangeUser(String forceChangeUser) {
		this.forceChangeUser = forceChangeUser;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getResPhoneNo() {
		return resPhoneNo;
	}
	public void setResPhoneNo(String resPhoneNo) {
		this.resPhoneNo = resPhoneNo;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getVoterid() {
		return voterid;
	}
	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getDrivingLic() {
		return drivingLic;
	}
	public void setDrivingLic(String drivingLic) {
		this.drivingLic = drivingLic;
	}
	public String getExEq3() {
		return exEq3;
	}
	public void setExEq3(String exEq3) {
		this.exEq3 = exEq3;
	}
	public String getOffPhoneNo() {
		return offPhoneNo;
	}
	public void setOffPhoneNo(String offPhoneNo) {
		this.offPhoneNo = offPhoneNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMailingAddr() {
		return mailingAddr;
	}
	public void setMailingAddr(String mailingAddr) {
		this.mailingAddr = mailingAddr;
	}
	public String getOffCity() {
		return offCity;
	}
	public void setOffCity(String offCity) {
		this.offCity = offCity;
	}
	public String getMobilePhoneNo() {
		return mobilePhoneNo;
	}
	public void setMobilePhoneNo(String mobilePhoneNo) {
		this.mobilePhoneNo = mobilePhoneNo;
	}
	public String getOffPinCode() {
		return offPinCode;
	}
	public void setOffPinCode(String offPinCode) {
		this.offPinCode = offPinCode;
	}
	public String getExEq7() {
		return exEq7;
	}
	public void setExEq7(String exEq7) {
		this.exEq7 = exEq7;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public String getNoOfMonthsDefault() {
		return noOfMonthsDefault;
	}
	public void setNoOfMonthsDefault(String noOfMonthsDefault) {
		this.noOfMonthsDefault = noOfMonthsDefault;
	}
	public String getDelqAmount() {
		return delqAmount;
	}
	public void setDelqAmount(String delqAmount) {
		this.delqAmount = delqAmount;
	}
	public String getFiller51() {
		return filler51;
	}
	public void setFiller51(String filler51) {
		this.filler51 = filler51;
	}
	public String getEmi() {
		return emi;
	}
	public void setEmi(String emi) {
		this.emi = emi;
	}
	public String getFiller53() {
		return filler53;
	}
	public void setFiller53(String filler53) {
		this.filler53 = filler53;
	}
	public String getDaysOverlineCurrent() {
		return daysOverlineCurrent;
	}
	public void setDaysOverlineCurrent(String daysOverlineCurrent) {
		this.daysOverlineCurrent = daysOverlineCurrent;
	}
	public String getDaysOverlineYtd() {
		return daysOverlineYtd;
	}
	public void setDaysOverlineYtd(String daysOverlineYtd) {
		this.daysOverlineYtd = daysOverlineYtd;
	}
	public String getOverDraftCollateralDtl() {
		return overDraftCollateralDtl;
	}
	public void setOverDraftCollateralDtl(String overDraftCollateralDtl) {
		this.overDraftCollateralDtl = overDraftCollateralDtl;
	}
	public String getOverDraftLimitNo() {
		return overDraftLimitNo;
	}
	public void setOverDraftLimitNo(String overDraftLimitNo) {
		this.overDraftLimitNo = overDraftLimitNo;
	}
	public String getNpaStageId() {
		return npaStageId;
	}
	public void setNpaStageId(String npaStageId) {
		this.npaStageId = npaStageId;
	}
	public String getSasId() {
		return sasId;
	}
	public void setSasId(String sasId) {
		this.sasId = sasId;
	}
	public String getDedupeCategory() {
		return dedupeCategory;
	}
	public void setDedupeCategory(String dedupeCategory) {
		this.dedupeCategory = dedupeCategory;
	}
    
}

   
