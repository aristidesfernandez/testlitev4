package co.com.ies.smolplus.context.dummyuser.domain.user;

import co.com.ies.smolplus.context.dummyuser.domain.UserId;

class UnknownUserException extends RuntimeException {

  public UnknownUserException(UserId id) {
    super("User " + id.get() + " is unknown");
  }
}
