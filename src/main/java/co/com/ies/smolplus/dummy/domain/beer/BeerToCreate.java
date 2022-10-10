package co.com.ies.smolplus.dummy.domain.beer;

import co.com.ies.smolplus.dummy.domain.Amount;
import co.com.ies.smolplus.dummy.domain.BeerId;
import co.com.ies.smolplus.error.domain.Assert;

public record BeerToCreate(BeerName name, Amount unitPrice) {
  public BeerToCreate {
    Assert.notNull("name", name);
    Assert.notNull("unitPrice", unitPrice);
  }

  public Beer create() {
    return Beer.builder().id(BeerId.newId()).name(name()).unitPrice(unitPrice()).sellingState(BeerSellingState.SOLD).build();
  }
}
