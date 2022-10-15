package co.com.ies.smolplus.context.dummyuser.domain.user;

import co.com.ies.smolplus.error.domain.Assert;

public class UsersCreator {

  private final UsersRepository users;

  public UsersCreator(UsersRepository users) {
    Assert.notNull("users", users);

    this.users = users;
  }

  public User create(UserToCreate userToCreate) {
    User createdUser = userToCreate.create();

    users.save(createdUser);

    return createdUser;
  }
}
