package abhash.springframework.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import abhash.springframework.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerId(UUID beerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeerDto updateBeer(UUID beerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeerDto saveBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeerDto getBeerByUpc(int upc) {
		// TODO Auto-generated method stub
		return null;
	}

}
