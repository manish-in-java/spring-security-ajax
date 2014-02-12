package org.example.domain

import scala.beans.BeanProperty

/**
 * Represents a task.
 */
case class Task(@BeanProperty val id: Long, @BeanProperty val title: String, @BeanProperty val complete: Boolean)
