package co.com.ies.smolplus.dummy.infrastructure.primary.beer;

import static org.assertj.core.api.Assertions.*;

import co.com.ies.smolplus.JsonHelper;
import co.com.ies.smolplus.UnitTest;
import co.com.ies.smolplus.dummy.domain.beer.Beers;
import co.com.ies.smolplus.dummy.domain.beer.BeersFixture;
import java.util.List;
import org.junit.jupiter.api.Test;

@UnitTest
class RestBeersTest {

  @Test
  void shouldSerializeToJson() {
    assertThat(JsonHelper.writeAsString(RestBeers.from(new Beers(List.of(BeersFixture.beer()))))).isEqualTo(json());
  }

  private String json() {
    return "{\"beers\":[" + RestBeerTest.json() + "]}";
  }
}
