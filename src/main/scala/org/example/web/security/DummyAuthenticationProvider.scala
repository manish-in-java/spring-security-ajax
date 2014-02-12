package org.example.web.security

import java.util.{ ArrayList, Arrays }

import org.springframework.security.authentication.{ AuthenticationProvider, UsernamePasswordAuthenticationToken }
import org.springframework.security.core.Authentication
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.context.SecurityContextHolder

/**
 * A dummy Spring Security {@link AuthenticationProvider} that treats all
 * username and password combinations to be valid.
 */
final class DummyAuthenticationProvider extends AuthenticationProvider {
  /**
   * {@inheritDoc}
   */
  override def authenticate(authentication: Authentication): Authentication = {
    SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(authentication.getPrincipal, authentication.getCredentials, DummyAuthenticationProvider.AUTHORITIES))

    SecurityContextHolder.getContext().getAuthentication()
  }

  /**
   * {@inheritDoc}
   */
  override def supports(authentication: Class[_]): Boolean = authentication != null && authentication.equals(classOf[UsernamePasswordAuthenticationToken])
}

private final object DummyAuthenticationProvider {
  val AUTHORITIES = new ArrayList(Arrays.asList(new SimpleGrantedAuthority("USER")))
}
