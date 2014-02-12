package org.example.service

import org.example.data.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Business logic operations on {@link Task}.
 */
@Component
class TaskService {
  @Autowired
  protected var repository: TaskRepository = _

  /**
   * Gets all available tasks.
   *
   * @return A {@link List} of {@link Task}s.
   */
  def getTasks = this.repository.findAll
}
