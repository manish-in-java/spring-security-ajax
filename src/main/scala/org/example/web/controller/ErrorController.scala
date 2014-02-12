package org.example.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Error controller.
 */
@Controller
class ErrorController {
  /**
   * Displays the access-denied page.
   */
  @RequestMapping(Array("/403"))
  def denied = "403"
}
