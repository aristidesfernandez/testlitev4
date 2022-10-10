package co.com.ies.smolplus.authentication.infrastructure.primary;

import java.util.Optional;
import org.springframework.security.core.Authentication;

@FunctionalInterface
public interface AuthenticationTokenReader {
  Optional<Authentication> read(String token);
}
