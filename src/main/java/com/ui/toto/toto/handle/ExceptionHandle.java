package com.ui.toto.toto.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ui.toto.toto.domain.Result;
import com.ui.toto.toto.exception.UserException;
import com.ui.toto.toto.util.MessageUtil;

@ControllerAdvice
public class ExceptionHandle {
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public Result handle(Exception e) {
		
		if (e instanceof UserException) { // 如果捕获到UserException 处理异常
			UserException userException = (UserException)e;
			// 处理异常
			return MessageUtil.error(userException.getCode(), userException.getMessage());
		} else {
			return MessageUtil.error(1000, "系统异常");
		}
		
	}
}
