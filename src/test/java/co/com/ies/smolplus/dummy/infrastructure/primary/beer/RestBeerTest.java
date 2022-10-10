package co.com.ies.smolplus.dummy.infrastructure.primary.beer;

import static co.com.ies.smolplus.dummy.domain.beer.BeersFixture.*;
import static org.assertj.core.api.Assertions.*;

import co.com.ies.smolplus.JsonHelper;
import co.com.ies.smolplus.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class RestBeerTest {

  @Test
  void shouldSerializeToJson() {
    assertThat(JsonHelper.writeAsString(RestBeer.from(beer()))).isEqualTo(json());
  }

  static String json() {
    return """
        {\
        "id":"5ea9bbb1-3a55-4701-9006-3bbd2878f241",\
        "name":"Cloak of feathers",\
        "unitPrice":8.53\
        }\
        """;
  }
}
