package com.user.Login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class loginController implements Controller {
	
	LoginModel lmodel;
	
	public void setLmodel(LoginModel lmodel) {
		this.lmodel = lmodel;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String login=req.getParameter("login");
		String paswd= req.getParameter("pswd");
		
		String type=lmodel.getType(login, paswd);
		return null;
	}

}
