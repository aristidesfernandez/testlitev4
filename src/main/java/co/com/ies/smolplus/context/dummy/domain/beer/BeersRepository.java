package co.com.ies.smolplus.context.dummy.domain.beer;

import java.util.Optional;

import co.com.ies.smolplus.context.dummy.domain.BeerId;

public interface BeersRepository {
  void save(Beer beer);

  Beers catalog();

  Optional<Beer> get(BeerId beer);
}
