package co.com.ies.smolplus.context.dummyuser.domain.user;


import co.com.ies.smolplus.context.dummyuser.domain.UserId;
import co.com.ies.smolplus.error.domain.Assert;

public class User {

  private final UserId id;
  private final UserName name;
  


  private User(UserBuilder builder) {
    assertMandatoryFields(builder);

    id = builder.id;
    name = builder.name;
  }

  private void assertMandatoryFields(UserBuilder builder) {
    Assert.notNull("id", builder.id);
    Assert.notNull("name", builder.name);
  }

  public static UserIdBuilder builder() {
    return new UserBuilder();
  }

  public UserId id() {
    return id;
  }

  public UserName name() {
    return name;
  }


  public static class UserBuilder
    implements UserIdBuilder, UserNameBuilder {

    private UserId id;
    private UserName name;


    @Override
    public UserNameBuilder id(UserId id) {
      this.id = id;

      return this;
    }

    @Override
    public User build() {
      return new User(this);
    }
  }

  public interface UserIdBuilder {
    UserNameBuilder id(UserId id);
  }

  public interface UserNameBuilder {
    User build();    
  }

}
