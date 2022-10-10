package co.com.ies.smolplus.dummy.infrastructure.secondary;

import java.util.Collection;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import co.com.ies.smolplus.dummy.domain.beer.BeerSellingState;

interface JpaBeersRepository extends JpaRepository<BeerEntity, UUID> {
  Collection<BeerEntity> findBySellingState(BeerSellingState sellingState);
}
