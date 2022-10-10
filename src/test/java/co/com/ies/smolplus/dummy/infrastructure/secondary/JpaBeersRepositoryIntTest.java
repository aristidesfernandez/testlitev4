package co.com.ies.smolplus.dummy.infrastructure.secondary;

import static org.assertj.core.api.Assertions.*;
import static co.com.ies.smolplus.dummy.domain.BeersIdentityFixture.*;
import static co.com.ies.smolplus.dummy.domain.beer.BeersFixture.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.IntegrationTest;

@Transactional
@IntegrationTest
class JpaBeersRepositoryIntTest {

  @Autowired
  private JpaBeersRepository beers;

  @Test
  void shouldSaveAndGetBeer() {
    beers.saveAndFlush(BeerEntity.from(beer()));

    assertThat(beers.findById(cloackOfFeathersId().get()).get().toDomain()).usingRecursiveComparison().isEqualTo(beer());
  }
}
