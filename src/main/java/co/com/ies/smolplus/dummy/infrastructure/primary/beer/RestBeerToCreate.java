package co.com.ies.smolplus.dummy.infrastructure.primary.beer;

import com.fasterxml.jackson.annotation.JsonProperty;
import co.com.ies.smolplus.dummy.domain.Amount;
import co.com.ies.smolplus.dummy.domain.beer.BeerName;
import co.com.ies.smolplus.dummy.domain.beer.BeerToCreate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

@Schema(name = "beerToCreate", description = "A beer to create")
class RestBeerToCreate {

  private final String name;
  private final BigDecimal unitPrice;

  RestBeerToCreate(@JsonProperty("name") String name, @JsonProperty("unitPrice") BigDecimal unitPrice) {
    this.name = name;
    this.unitPrice = unitPrice;
  }

  public BeerToCreate toDomain() {
    return new BeerToCreate(new BeerName(getName()), new Amount(getUnitPrice()));
  }

  @NotNull
  @Schema(description = "Name of this beer", required = true)
  public String getName() {
    return name;
  }

  @NotNull
  @Schema(description = "Unit price (in euros) of this beer", required = true)
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }
}
