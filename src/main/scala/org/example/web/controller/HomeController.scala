package org.example.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Home page controller.
 */
@Controller
class HomeController {
  /**
   * Displays the home page.
   */
  @RequestMapping(Array("/"))
  def show = "ember"
}
