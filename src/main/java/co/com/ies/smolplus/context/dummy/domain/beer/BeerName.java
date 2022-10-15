package co.com.ies.smolplus.context.dummy.domain.beer;

import co.com.ies.smolplus.error.domain.Assert;

public record BeerName(String name) {
  public BeerName {
    Assert.field("name", name).notBlank().maxLength(255);
  }

  public String get() {
    return name();
  }
}
