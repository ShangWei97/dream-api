package com.dreamfield.dreamapi.exception;


import com.dreamfield.dreamapi.constant.ReturnMsg;
import com.dreamfield.dreamapi.enums.ReturnEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.List;

/**
 * 定义全局异常捕获类
 *
 * @author: shangwei
 * @date: 2019-03-26 15:17
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 处理请求对象属性不满足校验规则的异常信息
	 *
	 * @param request
	 * @param exception
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ReturnMsg exception(HttpServletRequest request, MethodArgumentNotValidException exception) {
		BindingResult result = exception.getBindingResult();
		final List<FieldError> fieldErrors = result.getFieldErrors();
		StringBuilder builder = new StringBuilder();

		for (FieldError error : fieldErrors) {
			builder.append(error.getDefaultMessage() + "\n");
		}
		return new ReturnMsg(ReturnEnum.FAIL, builder.toString());
	}

	/**
	 * 处理请求单个参数不满足校验规则的异常信息
	 *
	 * @param request
	 * @param exception
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = ConstraintViolationException.class)
	public ReturnMsg constraintViolationExceptionHandler(HttpServletRequest request, ConstraintViolationException exception) {
		logger.info(exception.getMessage());
		return new ReturnMsg(ReturnEnum.FAIL, exception.getMessage());
	}


	/**
	 * 处理未定义的其他异常信息
	 *
	 * @param request
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	public ReturnMsg exceptionHandler(HttpServletRequest request, Exception exception) {
		logger.error(exception.getMessage());
		return new ReturnMsg(ReturnEnum.FAIL, exception.getMessage());
	}
}
