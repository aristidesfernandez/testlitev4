package co.com.ies.smolplus.dummy.infrastructure.primary.beer;

import static co.com.ies.smolplus.BeanValidationAssertions.*;
import static org.assertj.core.api.Assertions.*;

import co.com.ies.smolplus.UnitTest;
import co.com.ies.smolplus.JsonHelper;
import co.com.ies.smolplus.dummy.domain.beer.BeersFixture;
import org.junit.jupiter.api.Test;

@UnitTest
class RestBeerToCreateTest {

  @Test
  void shouldDeserializeFromJson() {
    assertThat(JsonHelper.readFromJson(json(), RestBeerToCreate.class).toDomain())
      .usingRecursiveComparison()
      .isEqualTo(BeersFixture.beerToCreate());
  }

  private String json() {
    return """
        {
          "name": "Cloak of feathers",
          "unitPrice": 8.53
        }
        """;
  }

  @Test
  void shouldNotValidateEmptyBean() {
    assertThatBean(new RestBeerToCreate(null, null)).hasInvalidProperty("name").and().hasInvalidProperty("unitPrice");
  }
}