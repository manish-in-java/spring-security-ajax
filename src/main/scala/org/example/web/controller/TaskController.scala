package org.example.web.controller

import java.util.List

import scala.beans.BeanProperty

import org.example.domain.Task
import org.example.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Tasks controller.
 */
@Controller
class TaskController {
  @Autowired
  protected var service: TaskService = _

  /**
   * Displays all available tasks.
   */
  @PreAuthorize("isAuthenticated()")
  @ResponseBody
  @RequestMapping(Array("tasks"))
  def list = Tasks(this.service.getTasks)
}

case class Tasks(@BeanProperty val tasks: List[Task])
