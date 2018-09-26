package com.imayidu.controller;
import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//ȫ�ֲ����쳣
@ControllerAdvice
public class GlobalExceptionHandle {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> resultError() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("code", "500");
		result.put("state", "ϵͳ����");
		return result;
	}
}
