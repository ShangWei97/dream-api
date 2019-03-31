package com.dreamfield.dreamapi.enums;

/**
 * @author: shangwei
 * @date: 2019-03-26 15:20
 */
public enum ReturnEnum {
	/**
	 * 返回类型的枚举
	 */
	UN_LOGIN(-1, "未登录"),
	FAIL(0, "系统异常,请联系管理员"),
	SUCCESS(1, "操作成功"),
	NOT_NULL(-2,"必填参数不能为空");


	private Integer code;

	private String message;


	ReturnEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}


