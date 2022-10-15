package co.com.ies.smolplus.context.animal.infrastructure.secondary;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.com.ies.smolplus.context.animal.domain.AnimalId;
import co.com.ies.smolplus.context.animal.domain.animal.Animal;
import co.com.ies.smolplus.error.domain.Assert;

@Entity
@Table(name = "animals")
class AnimalEntity {

  @Id
  @Column(name = "id")
  private UUID id;

  @Column(name = "name")
  private String name;

  @Column(name = "raza")
  private String raza;

  public static AnimalEntity from(Animal animal) {
    Assert.notNull("animal", animal);

    return new AnimalEntity().id(animal.id().get()).name(animal.name()).raza(animal.raza());
  }

  private AnimalEntity id(UUID id) {
    this.id = id;

    return this;
  }

  private AnimalEntity name(String name) {
    this.name = name;

    return this;
  }

  private AnimalEntity raza(String raza) {
    this.raza = raza;

    return this;
  }

  public Animal toDomain() {
    return Animal.builder().id(new AnimalId(id)).name(name).raza(raza).build();
  }

}
