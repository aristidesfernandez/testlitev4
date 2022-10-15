package co.com.ies.smolplus.context.dummy.domain;

import co.com.ies.smolplus.error.domain.Assert;
import java.util.UUID;

public record BeerId(UUID id) {
  public BeerId {
    Assert.notNull("id", id);
  }

  public static BeerId newId() {
    return new BeerId(UUID.randomUUID());
  }

  public UUID get() {
    return id();
  }
}
