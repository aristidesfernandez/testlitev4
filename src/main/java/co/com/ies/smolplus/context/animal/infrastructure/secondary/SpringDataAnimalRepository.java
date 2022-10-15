package co.com.ies.smolplus.context.animal.infrastructure.secondary;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.animal.domain.AnimalId;
import co.com.ies.smolplus.context.animal.domain.animal.Animal;
import co.com.ies.smolplus.context.animal.domain.animal.AnimalsRepository;
import co.com.ies.smolplus.error.domain.Assert;

@Repository
class SpringDataAnimalRepository implements AnimalsRepository {

  private final JpaAnimalRepository jpaAnimalRepository;

  public SpringDataAnimalRepository(JpaAnimalRepository jpaAnimalRepository) {
    this.jpaAnimalRepository = jpaAnimalRepository;
  }

  @Override
  public void save(Animal animal) {
    Assert.notNull("animal", animal);

    jpaAnimalRepository.save(AnimalEntity.from(animal));
  }


  @Override
  public Optional<Animal> get(AnimalId user) {
    Assert.notNull("user", user);

    return jpaAnimalRepository.findById(user.get()).map(AnimalEntity::toDomain);
  }

}
