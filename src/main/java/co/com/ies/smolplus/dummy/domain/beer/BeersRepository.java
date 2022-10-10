package co.com.ies.smolplus.dummy.domain.beer;

import co.com.ies.smolplus.dummy.domain.BeerId;
import java.util.Optional;

public interface BeersRepository {
  void save(Beer beer);

  Beers catalog();

  Optional<Beer> get(BeerId beer);
}
