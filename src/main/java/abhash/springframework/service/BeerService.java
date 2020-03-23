package abhash.springframework.service;

import java.util.UUID;

import abhash.springframework.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerId(UUID beerId);

	BeerDto updateBeer(UUID beerId);

	BeerDto saveBeer(BeerDto beerDto);

	BeerDto getBeerByUpc(int upc);

}
