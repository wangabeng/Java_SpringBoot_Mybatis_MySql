package com.ui.toto.toto.exception;

import com.ui.toto.toto.enums.MessageEnum;

public class UserException extends RuntimeException {
	private Integer code;
	
	public UserException (MessageEnum messageEnum) { // messageEnum为枚举对象  MessageEnum.NAME_EXCEEDED_CHARRACTER_LIMIT 或其他
		super(messageEnum.getMessage());
		this.code = messageEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
}
