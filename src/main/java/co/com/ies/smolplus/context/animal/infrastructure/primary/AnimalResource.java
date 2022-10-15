package co.com.ies.smolplus.context.animal.infrastructure.primary;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.animal.application.AnimalApplicationService;
import co.com.ies.smolplus.context.animal.domain.animal.Animal;
import co.com.ies.smolplus.context.animal.infrastructure.primary.dto.RestAnimalDTO;
import co.com.ies.smolplus.context.animal.infrastructure.primary.dto.RestAnimalToCreateDTO;

@RestController
@RequestMapping("/api/animals")
class AnimalResource {

  private final AnimalApplicationService aniamalService;

  public AnimalResource(AnimalApplicationService aniamalService) {
    this.aniamalService = aniamalService;
  }

  @PostMapping
  ResponseEntity<RestAnimalDTO> create(@Validated @RequestBody RestAnimalToCreateDTO animalToCreate) {

 
    Animal createdAnimal= aniamalService.create(animalToCreate.toDomain());

    System.out.println("----- createdAnimal " +  createdAnimal);

    return new ResponseEntity<>(RestAnimalDTO.from(createdAnimal), HttpStatus.CREATED);
  }

}
