package org.example.data

import java.util.ArrayList
import java.util.Collections

import org.example.domain.Task
import org.springframework.stereotype.Component

/**
 * Provides data access operations on an in-memory task data store.
 */
@Component
class TaskMemoryRepository extends TaskRepository {
  /**
   * {@inheritDoc}
   */
  def findAll = Collections.unmodifiableList(TaskMemoryRepository.TASKS)
}

private object TaskMemoryRepository {
  private val TASKS = new ArrayList[Task]

  TASKS.add(Task(1, "Learn Ember.js", false))
  TASKS.add(Task(2, "Develop applications", false))
  TASKS.add(Task(3, "Profit!", false))
  TASKS.add(Task(4, "Teach others", false))
  TASKS.add(Task(5, "Get recognized", false))
}
