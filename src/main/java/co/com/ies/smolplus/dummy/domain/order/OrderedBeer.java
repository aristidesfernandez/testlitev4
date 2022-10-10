package co.com.ies.smolplus.dummy.domain.order;

import co.com.ies.smolplus.dummy.domain.Amount;
import co.com.ies.smolplus.dummy.domain.BeerId;
import co.com.ies.smolplus.error.domain.Assert;

public record OrderedBeer(BeerId beer, Amount unitPrice) {
  public OrderedBeer {
    Assert.notNull("beer", beer);
    Assert.notNull("unitPrice", unitPrice);
  }
}
