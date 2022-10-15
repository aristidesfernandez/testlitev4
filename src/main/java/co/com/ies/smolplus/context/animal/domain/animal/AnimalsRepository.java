package co.com.ies.smolplus.context.animal.domain.animal;

import java.util.Optional;

import co.com.ies.smolplus.context.animal.domain.AnimalId;

public interface AnimalsRepository {
  void save(Animal animal);

  Optional<Animal> get(AnimalId animalId);
}
