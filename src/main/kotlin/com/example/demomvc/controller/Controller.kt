package com.example.demomvc.controller

import org.springframework.http.HttpRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@Controller
class WebController {
  @GetMapping("/","/index")
  fun getMainPage(): ModelAndView{
    val modelAndView = ModelAndView("index")
    return modelAndView
  }
}