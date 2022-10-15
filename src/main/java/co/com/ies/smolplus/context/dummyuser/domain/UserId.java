package co.com.ies.smolplus.context.dummyuser.domain;

import co.com.ies.smolplus.error.domain.Assert;
import java.util.UUID;

public record UserId(UUID id) {
  public UserId {
    Assert.notNull("id", id);
  }

  public static UserId newId() {
    return new UserId(UUID.randomUUID());
  }

  public UUID get() {
    return id();
  }
}
