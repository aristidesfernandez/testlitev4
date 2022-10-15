package co.com.ies.smolplus.context.dummyuser.domain.user;

import co.com.ies.smolplus.context.dummyuser.domain.UserId;
import co.com.ies.smolplus.error.domain.Assert;

public record UserToCreate(UserName name) {
  public UserToCreate {
    Assert.notNull("name", name); 
  }

  public User create() {
    return User.builder().id(UserId.newId()).build();
  }
}


