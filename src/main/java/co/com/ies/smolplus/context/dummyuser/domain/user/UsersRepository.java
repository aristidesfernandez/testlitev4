package co.com.ies.smolplus.context.dummyuser.domain.user;

import java.util.Optional;

import co.com.ies.smolplus.context.dummyuser.domain.UserId;

public interface UsersRepository {
  void save(User user);

  Optional<User> get(UserId userId);
}
