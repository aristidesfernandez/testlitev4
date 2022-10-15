package co.com.ies.smolplus.context.animal.domain.animal;

import co.com.ies.smolplus.context.dummyuser.domain.UserId;

class UnknownAnimalException extends RuntimeException {

  public UnknownAnimalException(UserId id) {
    super("Animal " + id.get() + " is unknown");
  }
}
