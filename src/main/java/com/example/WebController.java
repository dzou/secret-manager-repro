package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  @Value("${sm://application-secret}")
  private String appSecret;

  @GetMapping("/")
  public String renderIndex() {
    return "Hello " + appSecret;
  }
}
