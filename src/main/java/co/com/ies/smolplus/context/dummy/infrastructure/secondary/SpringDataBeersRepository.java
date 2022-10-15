package co.com.ies.smolplus.context.dummy.infrastructure.secondary;

import java.util.Optional;
import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.dummy.domain.BeerId;
import co.com.ies.smolplus.context.dummy.domain.beer.Beer;
import co.com.ies.smolplus.context.dummy.domain.beer.BeerSellingState;
import co.com.ies.smolplus.context.dummy.domain.beer.Beers;
import co.com.ies.smolplus.context.dummy.domain.beer.BeersRepository;
import co.com.ies.smolplus.error.domain.Assert;

@Repository
class SpringDataBeersRepository implements BeersRepository {

  private final JpaBeersRepository beers;

  public SpringDataBeersRepository(JpaBeersRepository beers) {
    this.beers = beers;
  }

  @Override
  public void save(Beer beer) {
    Assert.notNull("beer", beer);

    beers.save(BeerEntity.from(beer));
  }

  @Override
  public Beers catalog() {
    return new Beers(beers.findBySellingState(BeerSellingState.SOLD).stream().map(BeerEntity::toDomain).toList());
  }

  @Override
  public Optional<Beer> get(BeerId beer) {
    Assert.notNull("beer", beer);

    return beers.findById(beer.get()).map(BeerEntity::toDomain);
  }
}
