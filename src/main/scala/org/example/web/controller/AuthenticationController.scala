package org.example.web.controller

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{ RequestMapping, ResponseBody, ResponseStatus }

/**
 * User authentication controller.
 */
@Controller
class AuthenticationController {
  /**
   * Displays an error message for a failed login.
   */
  @RequestMapping(Array("/login/failure"))
  @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
  def failed = this.show

  /**
   * Displays the login page.
   */
  @RequestMapping(Array("/login"))
  def show = "login"
}
