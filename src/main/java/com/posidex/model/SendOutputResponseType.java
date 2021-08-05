
package com.posidex.model;

import java.util.ArrayList;
import java.util.List;

public class SendOutputResponseType {

    private List<OutPutData> outputdata;
    

    public List<OutPutData> getOUTPUTDATA() {
        if (outputdata == null) {
            outputdata = new ArrayList<OutPutData>();
        }
        return this.outputdata;
    }
    
    public void setOUTPUTDATA(List<OutPutData> outputdata){
    	this.outputdata=outputdata;
    }

}
