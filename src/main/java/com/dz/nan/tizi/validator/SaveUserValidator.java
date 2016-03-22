package com.dz.nan.tizi.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.dz.nan.tizi.command.UserCommand;

/**
 * 
 * @author LYES KHERBICHE
 *
 */
public class SaveUserValidator implements Validator {

	@SuppressWarnings("rawtypes")
	@Override
	public boolean supports(Class clazz) {
		return UserCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors error) {
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "email", "required.email", "Field email is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "pseudo", "required.pseudo", "Field pseudo is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "pwd", "required.pwd", "Field pwd is required");
	}
}
