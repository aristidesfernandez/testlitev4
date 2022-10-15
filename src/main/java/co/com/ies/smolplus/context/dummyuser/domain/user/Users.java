package co.com.ies.smolplus.context.dummyuser.domain.user;

import co.com.ies.smolplus.error.domain.Assert;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

public record Users(Collection<User> users) {
  private static final Comparator<User> USER_NAME_COMPARATOR = Comparator.comparing(user -> user.name().get());

  public Users(Collection<User> users) {
    Assert.field("users", users).notNull().noNullElement();

    this.users = users.stream().sorted(USER_NAME_COMPARATOR).toList();
  }

  public Collection<User> get() {
    return users();
  }

  public Stream<User> stream() {
    return users().stream();
  }
}
