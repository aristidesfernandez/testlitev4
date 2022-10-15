package co.com.ies.smolplus.context.animal.domain;

import co.com.ies.smolplus.error.domain.Assert;
import java.util.UUID;

public record AnimalId(UUID id) {
  public AnimalId {
    Assert.notNull("id", id);
  }

  public static AnimalId newId() {
    return new AnimalId(UUID.randomUUID());
  }

  public UUID get() {
    return id();
  }
}
