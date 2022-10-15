package co.com.ies.smolplus.context.animal.domain.animal;
import co.com.ies.smolplus.context.animal.domain.AnimalId;
import co.com.ies.smolplus.error.domain.Assert;

public record AnimalToCreate(String name, String raza) {
  public AnimalToCreate {
    Assert.notNull("name", name);
    Assert.notNull("raza", raza);
  }

  public Animal create() {
    return Animal.builder().id(AnimalId.newId()).name(name()).raza(raza).build();
  }
}
