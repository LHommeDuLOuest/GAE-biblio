package com.dz.nan.tizi.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dz.nan.tizi.command.UserCommand;

/**
 * 
 * @author LYES KHERBICHE
 * 
 */
@Controller
public class Home {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String welcomeCovoiturage() {
		return "homePage";
	}

	@RequestMapping(value = "/createCount", method = RequestMethod.GET)
	public String createCount(Map<String,Object> model) {
		model.put("userCommand", new UserCommand());
		return "createCountPage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "loginPage";
	}

}
