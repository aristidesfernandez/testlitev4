package co.com.ies.smolplus.dummy.infrastructure.primary.beer;

import co.com.ies.smolplus.dummy.domain.beer.Beers;
import co.com.ies.smolplus.error.domain.Assert;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Collection;

@Schema(name = "beers", description = "Some beers")
class RestBeers {

  private final Collection<RestBeer> beers;

  private RestBeers(Collection<RestBeer> beers) {
    this.beers = beers;
  }

  public static RestBeers from(Beers beers) {
    Assert.notNull("beers", beers);

    return new RestBeers(beers.stream().map(RestBeer::from).toList());
  }

  public Collection<RestBeer> getBeers() {
    return beers;
  }
}
