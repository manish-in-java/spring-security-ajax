package org.example.data

import java.util.List

import org.example.domain.Task

/**
 * Contract for data access operations on {@link Task}.
 */
trait TaskRepository {
  /**
   * Finds all available tasks.
   *
   * @return A {@link List} of {@link Task}s.
   */
  def findAll: List[Task]
}
