package com.dreamfield.dreamapi.constant;

import com.alibaba.fastjson.annotation.JSONField;
import com.dreamfield.dreamapi.enums.ReturnEnum;
import org.springframework.util.StringUtils;

/**
 * @author: shangwei
 * @date: 2019-03-26 15:22
 */
public class ReturnMsg {
	private boolean status;
	@JSONField(ordinal = 1)
	private Integer code;
	@JSONField(ordinal = 2)
	private String msg;
	@JSONField(ordinal = 3)
	private Object data;
	@JSONField(serialize = false)
	private ReturnEnum returnEnum;


	public ReturnMsg() {
		status = true;
		this.returnEnum = ReturnEnum.SUCCESS;
	}

	public ReturnMsg(ReturnEnum returnEnum) {
		this.returnEnum = returnEnum;
	}

	public ReturnMsg(ReturnEnum returnEnum, String msg) {
		this.msg = msg;
		this.returnEnum = returnEnum;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getCode() {
		if (returnEnum != null) {
			return returnEnum.getCode();
		}
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		if (!StringUtils.isEmpty(msg)) {
			return msg;
		} else if (returnEnum != null) {
			return returnEnum.getMessage();
		}
		return "";
	}

	public void setMsg(String message) {
		this.msg = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
