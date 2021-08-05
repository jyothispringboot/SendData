package com.posidex.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="response")
public class ReturnResponse {
	private String msg;
	private boolean flag;
	public ReturnResponse(String msg, boolean flag) {
		super();
		this.msg = msg;
		this.flag = flag;
	}
	public ReturnResponse() {
		super();
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "ReturnResponse [msg=" + msg + ", flag=" + flag + "]";
	}
	

}
