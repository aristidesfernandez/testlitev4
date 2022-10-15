package co.com.ies.smolplus.context.animal.infrastructure.primary.dto;

import java.util.UUID;

import co.com.ies.smolplus.context.animal.domain.animal.Animal;
import co.com.ies.smolplus.error.domain.Assert;

public class RestAnimalDTO {

  private final UUID id;
  private final String name;
  private final String raza;

  private RestAnimalDTO(RestAnimalBuilder builder) {
    id = builder.id;
    name = builder.name;
    raza = builder.raza;
  }

  public static RestAnimalDTO from(Animal animal) {
    Assert.notNull("animal", animal);

    return new RestAnimalBuilder().id(animal.id().get()).name(animal.name()).raza(animal.raza()).build();
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getRaza() {
    return raza;
  }

  private static class RestAnimalBuilder {

    private UUID id;
    private String name;
    private String raza;

    public RestAnimalBuilder id(UUID id) {
      this.id = id;

      return this;
    }

    public RestAnimalBuilder name(String name) {
      this.name = name;

      return this;
    }

    public RestAnimalBuilder raza(String raza) {
      this.raza = raza;

      return this;
    }

    public RestAnimalDTO build() {
      return new RestAnimalDTO(this);
    }
  }
}
