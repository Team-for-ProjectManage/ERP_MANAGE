package com.project.manage.common;

public enum ResultCode {

	// 成功
	SUCCESS(200,"success"),
	 
	// 失败
	FAIL(400,"fail"),
 
	// 未认证（签名错误）
	UNAUTHORIZED(401,"unauthorized"),
 
	// 接口不存在
	NOT_FOUND(404,"not found"),
 
	// 服务器内部错误
	INTERNAL_SERVER_ERROR(500,"internal server error");
	
	ResultCode(int code,String msg){
		this.code = code;
		this.msg = msg;
	}
	
	private int code;
	
	private String msg;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
