package co.com.ies.smolplus.context.animal.application;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.animal.domain.animal.Animal;
import co.com.ies.smolplus.context.animal.domain.animal.AnimalToCreate;
import co.com.ies.smolplus.context.animal.domain.animal.AnimalsRepository;

@Service
public class AnimalApplicationService {

    private final AnimalsRepository animalRespository;
  
    public AnimalApplicationService(AnimalsRepository animalRespository) {
      this.animalRespository = animalRespository;
    }
  
    @Transactional
    public Animal create(AnimalToCreate animalToCreate) {
      Animal createdAnimal = animalToCreate.create();
      animalRespository.save(createdAnimal);
      return createdAnimal;
    }    
 
}
