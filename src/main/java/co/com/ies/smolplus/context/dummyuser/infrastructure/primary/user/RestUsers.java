package co.com.ies.smolplus.context.dummyuser.infrastructure.primary.user;

import java.util.Collection;

import co.com.ies.smolplus.context.dummyuser.domain.user.Users;
import co.com.ies.smolplus.error.domain.Assert;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "beers", description = "Some beers")
class RestUsers {

  private final Collection<RestUser> users;

  private RestUsers(Collection<RestUser> users) {
    this.users = users;
  }

  public static RestUsers from(Users users) {
    Assert.notNull("users", users);

    return new RestUsers(users.stream().map(RestUser::from).toList());
  }

  public Collection<RestUser> getUsers() {
    return users;
  }
}
