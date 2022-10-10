package co.com.ies.smolplus.dummy.domain.order;

import co.com.ies.smolplus.dummy.domain.Amount;
import co.com.ies.smolplus.error.domain.Assert;

public record BeerOrderLine(OrderedBeer beer, int quantity) {
  public BeerOrderLine {
    Assert.notNull("beer", beer);
    Assert.field("quantity", quantity).min(1);
  }

  Amount amount() {
    return beer().unitPrice().times(quantity());
  }
}
