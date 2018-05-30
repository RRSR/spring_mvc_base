package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Raj Rathore on 30-May-18
 */
@Controller
public class LoginController {

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String login(Model model) {
    System.out.println("Logging...");
    return "login";
  }

}