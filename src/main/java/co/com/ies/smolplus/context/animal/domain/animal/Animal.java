package co.com.ies.smolplus.context.animal.domain.animal;

import co.com.ies.smolplus.context.animal.domain.AnimalId;
import co.com.ies.smolplus.error.domain.Assert;

public class Animal {

  private final AnimalId id;
  private final String name;
  private final String raza;
  

  private Animal(AnimalBuilder builder) {
    assertMandatoryFields(builder);

    id = builder.id;
    name = builder.name;
    raza = builder.raza;
  }

  private void assertMandatoryFields(AnimalBuilder builder) {
    Assert.notNull("id", builder.id);
    Assert.notNull("name", builder.name);
    Assert.notNull("raza", builder.raza);
  }

  public static AnimalIdBuilder builder() {
    return new AnimalBuilder();
  }

  public AnimalId id() {
    return id;
  }

  public String name() {
    return name;
  }

  public String raza() {
    return raza;
  }

  public static class AnimalBuilder implements AnimalIdBuilder, AnimalNameBuilder, AnimalRazaBuilder, AnimalOptionalBuilder {

    private AnimalId id;
    private String name;
    private String raza;

    
    @Override
    public AnimalNameBuilder id(AnimalId id) {
      this.id = id;
      return this;
    }

    @Override
    public AnimalRazaBuilder name(String name) {
      this.name = name;
      return this;
    }

    public AnimalBuilder raza(String raza) {
      this.raza = raza;
      return this;
    }

    @Override
    public Animal build() {
      return new Animal(this);
    }
    
  }

  public interface AnimalIdBuilder {
    AnimalNameBuilder id(AnimalId id);
  }

  public interface AnimalNameBuilder {
    AnimalRazaBuilder name(String name);
  }

  public interface AnimalRazaBuilder {
    AnimalOptionalBuilder raza(String raza);
  }


  public interface AnimalOptionalBuilder {
    Animal build();
  }

}
