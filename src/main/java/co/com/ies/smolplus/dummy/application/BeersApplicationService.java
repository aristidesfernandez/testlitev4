package co.com.ies.smolplus.dummy.application;

import co.com.ies.smolplus.dummy.domain.BeerId;
import co.com.ies.smolplus.dummy.domain.beer.Beer;
import co.com.ies.smolplus.dummy.domain.beer.BeerToCreate;
import co.com.ies.smolplus.dummy.domain.beer.Beers;
import co.com.ies.smolplus.dummy.domain.beer.BeersCreator;
import co.com.ies.smolplus.dummy.domain.beer.BeersRemover;
import co.com.ies.smolplus.dummy.domain.beer.BeersRepository;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BeersApplicationService {

  private final BeersRepository beers;
  private final BeersCreator creator;
  private final BeersRemover remover;

  public BeersApplicationService(BeersRepository beers) {
    this.beers = beers;

    creator = new BeersCreator(beers);
    remover = new BeersRemover(beers);
  }

  @Transactional
  @PreAuthorize("hasRole('ADMIN')")
  public Beer create(BeerToCreate beerToCreate) {
    return creator.create(beerToCreate);
  }
  
  @Transactional
  @PreAuthorize("hasRole('ADMIN')")
  public void remove(BeerId beer) {
    remover.remove(beer);
  }

  @Transactional(readOnly = true)
  public Beers catalog() {
    return beers.catalog();
  }

}
