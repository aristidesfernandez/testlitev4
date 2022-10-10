package co.com.ies.smolplus.dummy.domain.beer;

import co.com.ies.smolplus.dummy.domain.BeerId;
import co.com.ies.smolplus.error.domain.Assert;

public class BeersRemover {

  private final BeersRepository beers;

  public BeersRemover(BeersRepository beers) {
    Assert.notNull("beers", beers);

    this.beers = beers;
  }

  public void remove(BeerId id) {
    Assert.notNull("id", id);

    Beer beer = beers.get(id).orElseThrow(() -> new UnknownBeerException(id));

    beer.removeFromSell();
    beers.save(beer);
  }
}
