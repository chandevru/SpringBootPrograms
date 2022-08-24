package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FirstController {
  @RequestMapping("/first")
  public String first()
  {
	  return "Spring method without Parameters";
  }
  @GetMapping("/second/{fname}/{lname}")
  public String second(@PathVariable("fname")String fname,@PathVariable("lname")String lname)
  {
	  return "My name is "+fname+" "+lname;
  }
}
