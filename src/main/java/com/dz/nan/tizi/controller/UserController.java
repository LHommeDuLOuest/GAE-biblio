package com.dz.nan.tizi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.dz.nan.tizi.command.UserCommand;
import com.dz.nan.tizi.users.model.User;
import com.dz.nan.tizi.users.services.IUserManager;
import com.dz.nan.tizi.validator.SaveUserValidator;

/**
 * 
 * @author LYES KHERBICHE
 * @UserController: is a spring Controller for add delete and update user's 
 *
 */
@Controller
public class UserController {
	@Autowired
	private SaveUserValidator userValidator;
	@Autowired
	private IUserManager userManager;

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("userCommand")UserCommand command, BindingResult result, SessionStatus status) {
		this.userValidator.validate(command, result);
		if(result.hasErrors()) {
			return "createCountPage";
		}
		else{
			this.userManager.addUser(new User(command.getEmail(), command.getPwd(), true));
			return "loginPage";
		}
	}

}
