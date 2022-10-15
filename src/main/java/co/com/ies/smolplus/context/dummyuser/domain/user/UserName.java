package co.com.ies.smolplus.context.dummyuser.domain.user;

import co.com.ies.smolplus.error.domain.Assert;

public record UserName(String name) {
  public UserName {
    Assert.field("name", name).notBlank().maxLength(255);
  }

  public String get() {
    return name();
  }
}
