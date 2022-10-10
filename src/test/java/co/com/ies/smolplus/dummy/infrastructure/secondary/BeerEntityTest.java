package co.com.ies.smolplus.dummy.infrastructure.secondary;

import static org.assertj.core.api.Assertions.*;
import static co.com.ies.smolplus.dummy.domain.beer.BeersFixture.*;

import org.junit.jupiter.api.Test;
import co.com.ies.smolplus.UnitTest;

@UnitTest
class BeerEntityTest {

  @Test
  void shouldConvertFromAndToDomain() {
    assertThat(BeerEntity.from(beer()).toDomain()).usingRecursiveComparison().isEqualTo(beer());
  }
}