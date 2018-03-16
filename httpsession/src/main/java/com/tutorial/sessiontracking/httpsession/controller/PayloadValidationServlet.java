package com.tutorial.sessiontracking.httpsession.controller;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServlet;

public class PayloadValidationServlet extends HttpServlet{

	public boolean isUserNamevalid(String uname)
	{
		return Pattern.matches("[a-zA-Z0-9]*", uname);
	}
	
	public boolean isPasswordvalid(String pwd)
	{
	  return Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", pwd);
	}
}
