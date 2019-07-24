package com.ui.toto.toto.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ui.toto.toto.enums.MessageEnum;
import com.ui.toto.toto.exception.UserException;

@RestController
public class MainController {
	@RequestMapping(value = "/index")
	String home() {
		/*
		 * int a = 4 / 0; return "Hello World!";
		 */
		// 抛出UserException异常  把枚举对象作为参数传出去
		throw new UserException(MessageEnum.NAME_EXCEEDED_CHARRACTER_LIMIT);
		// return null;
	}
}
