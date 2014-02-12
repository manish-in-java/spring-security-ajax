package org.example

import org.slf4j.LoggerFactory

/**
 * Provides meta-information about a component that requires message logging functionality.  This enforces the <code>static-logger-per-class</code>
 * pattern of logging commonly found in Java based applications.
 */
trait LogMetadata[+Loggable] {
  self =>
  lazy val logger = LoggerFactory.getLogger(getClass)
}

/**
 * Provides message logging functionality.
 */
trait Loggable {
  protected def meta: LogMetadata[Loggable]

  private[this] val logger = meta.logger

  /**
   * Logs a message at the <tt>DEBUG</tt> level if <tt>DEBUG</tt> level logging is enabled.
   *
   * @param message The message to log.
   */
  def debug(message: String) = this.logger.debug(message)

  /**
   * <p>
   * Logs a message at the <tt>DEBUG</tt> level according to the specified format and argument
   * if <tt>DEBUG</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>DEBUG</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param value The argument to use for generating the formatted message.
   * def debug(format: String, value: Any) = this.logger.debug(format, value)
   *
   * <p>
   * Logs a message at the <tt>DEBUG</tt> level according to the specified format and arguments
   * if <tt>DEBUG</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>DEBUG</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param value1 The first argument to use for generating the formatted message.
   * @param value2 The second argument to use for generating the formatted message.
   * def debug(format: String, value1: Any, value2: Any) = this.logger.debug(format, value1, value2)
   */

  /**
   * <p>
   * Logs a message at the <tt>DEBUG</tt> level according to the specified format and arguments
   * if <tt>DEBUG</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>DEBUG</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param values The arguments to use for generating the formatted message.
   */
  def debug(format: String, values: Any*) = this.logger.debug(format, values)

  /**
   * Logs a message at the <tt>ERROR</tt> level if <tt>ERROR</tt> level logging is enabled.
   *
   * @param message The message to log.
   */
  def error(message: String) = this.logger.error(message)

  /**
   * <p>
   * Logs a message at the <tt>ERROR</tt> level according to the specified format and argument
   * if <tt>ERROR</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>ERROR</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param value The argument to use for generating the formatted message.
   * def error(format: String, value: Any) = this.logger.error(format, value)
   *
   * <p>
   * Logs a message at the <tt>ERROR</tt> level according to the specified format and arguments
   * if <tt>ERROR</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>ERROR</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param value1 The first argument to use for generating the formatted message.
   * @param value2 The second argument to use for generating the formatted message.
   * def error(format: String, value1: Any, value2: Any) = this.logger.error(format, value1, value2)
   */

  /**
   * <p>
   * Logs a message at the <tt>ERROR</tt> level according to the specified format and arguments
   * if <tt>ERROR</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>ERROR</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param values The arguments to use for generating the formatted message.
   */
  def error(format: String, values: Any*) = this.logger.error(format, values)

  /**
   * Logs an exception along with a message at the <tt>ERROR</tt> level if <tt>ERROR</tt> level logging is enabled.
   *
   * @param message The message to log.
   * @param throwable The exception to log.
   */
  def error(message: String, throwable: Throwable) = this.logger.error(message, throwable)

  /**
   * Logs a message at the <tt>INFO</tt> level if <tt>INFO</tt> level logging is enabled.
   *
   * @param message The message to log.
   */
  def info(message: String) = this.logger.info(message)

  /**
   * <p>
   * Logs a message at the <tt>INFO</tt> level according to the specified format and argument
   * if <tt>INFO</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>INFO</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param value The argument to use for generating the formatted message.
   * def info(format: String, value: Any) = this.logger.info(format, value)
   *
   * <p>
   * Logs a message at the <tt>INFO</tt> level according to the specified format and arguments
   * if <tt>INFO</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>INFO</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param value1 The first argument to use for generating the formatted message.
   * @param value2 The second argument to use for generating the formatted message.
   * def info(format: String, value1: Any, value2: Any) = this.logger.info(format, value1, value2)
   */

  /**
   * <p>
   * Logs a message at the <tt>INFO</tt> level according to the specified format and arguments
   * if <tt>INFO</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>INFO</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param values The arguments to use for generating the formatted message.
   */
  def info(format: String, values: Any*) = this.logger.info(format, values)

  /**
   * Logs a message at the <tt>WARN</tt> level if <tt>WARN</tt> level logging is enabled.
   *
   * @param message The message to log.
   */
  def warn(message: String) = this.logger.warn(message)

  /**
   * <p>
   * Logs a message at the <tt>WARN</tt> level according to the specified format and argument
   * if <tt>WARN</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>WARN</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param value The argument to use for generating the formatted message.
   * def warn(format: String, value: Any) = this.logger.warn(format, value)
   *
   * <p>
   * Logs a message at the <tt>WARN</tt> level according to the specified format and arguments
   * if <tt>WARN</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>WARN</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param value1 The first argument to use for generating the formatted message.
   * @param value2 The second argument to use for generating the formatted message.
   * def warn(format: String, value1: Any, value2: Any) = this.logger.warn(format, value1, value2)
   */

  /**
   * <p>
   * Logs a message at the <tt>WARN</tt> level according to the specified format and arguments
   * if <tt>WARN</tt> level logging is enabled..
   * </p>
   * <p>
   * This form avoids superfluous object creation when the logger is disabled for the <tt>WARN</tt> level.
   * </p>
   *
   * @param format The format string for the message to log.
   * @param values The arguments to use for generating the formatted message.
   */
  def warn(format: String, values: Any*) = this.logger.warn(format, values)

  /**
   * Logs an exception along with a message at the <tt>WARN</tt> level if <tt>WARN</tt> level logging is enabled.
   *
   * @param message The message to log.
   * @param throwable The exception to log.
   */
  def warn(message: String, throwable: Throwable) = this.logger.warn(message, throwable)
}
