package co.com.ies.smolplus.context.dummy.domain.beer;

import co.com.ies.smolplus.context.dummy.domain.BeerId;

class UnknownBeerException extends RuntimeException {

  public UnknownBeerException(BeerId id) {
    super("Beer " + id.get() + " is unknown");
  }
}
