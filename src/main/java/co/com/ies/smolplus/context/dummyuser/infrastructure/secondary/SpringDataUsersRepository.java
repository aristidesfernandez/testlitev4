package co.com.ies.smolplus.context.dummyuser.infrastructure.secondary;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.dummyuser.domain.UserId;
import co.com.ies.smolplus.context.dummyuser.domain.user.User;
import co.com.ies.smolplus.context.dummyuser.domain.user.UsersRepository;
import co.com.ies.smolplus.error.domain.Assert;

@Repository
class SpringDataUsersRepository implements UsersRepository {

  private final JpaUsersRepository users;

  public SpringDataUsersRepository(JpaUsersRepository users) {
    this.users = users;
  }

  @Override
  public void save(User user) {
    Assert.notNull("user", user);

    users.save(UserEntity.from(user));
  }


  @Override
  public Optional<User> get(UserId user) {
    Assert.notNull("user", user);

    return users.findById(user.get()).map(UserEntity::toDomain);
  }
}
