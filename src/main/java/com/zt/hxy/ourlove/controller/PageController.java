package com.zt.hxy.ourlove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangtao
 * @date 2021/12/09 16:33
 */
@Controller
@RequestMapping("/love")
public class PageController {

  @RequestMapping("/index")
  public String configPage(Model model) {
    return "index";
  }
}
