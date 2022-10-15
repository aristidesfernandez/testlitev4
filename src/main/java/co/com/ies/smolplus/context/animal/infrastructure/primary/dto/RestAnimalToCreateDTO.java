package co.com.ies.smolplus.context.animal.infrastructure.primary.dto;

import javax.validation.constraints.NotNull;

import co.com.ies.smolplus.context.animal.domain.animal.AnimalToCreate;

public class RestAnimalToCreateDTO {

  private String name;
  private String raza;
  public RestAnimalToCreateDTO(){
  }

  RestAnimalToCreateDTO(String name, String raza) {
    this.name = name;
    this.raza = raza;
  }

  public AnimalToCreate toDomain() {
    return new AnimalToCreate(name, raza);
  } 

  @NotNull  
  public String getName() {
    return name;
  }

  @NotNull
  public String getRaza() {
    return raza;
  }

  @Override
	public String toString() {
		return "RestAnimalToCreateDTO [name=" + name + ", raza=" + raza + "]";
	}

}
