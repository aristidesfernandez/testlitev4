package co.com.ies.smolplus.context.dummy.domain.beer;

import co.com.ies.smolplus.error.domain.Assert;

public class BeersCreator {

  private final BeersRepository beers;

  public BeersCreator(BeersRepository beers) {
    Assert.notNull("beers", beers);

    this.beers = beers;
  }

  public Beer create(BeerToCreate beerToCreate) {
    
    Beer createdBeer = beerToCreate.create();

    beers.save(createdBeer);

    return createdBeer;
  }
}
