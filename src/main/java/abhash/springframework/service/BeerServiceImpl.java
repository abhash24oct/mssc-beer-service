package abhash.springframework.service;

import java.util.UUID;

import abhash.springframework.domain.Beer;
import abhash.springframework.repository.BeerRepository;
import abhash.springframework.web.controller.NotFoundException;
import abhash.springframework.web.mapper.BeerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import abhash.springframework.web.model.BeerDto;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

	private final BeerRepository beerRepository;
	private final BeerMapper mapper;

	@Override
	public BeerDto getBeerId(UUID beerId) {
		 Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);
		 return  mapper.beerToBeerDto(beer);
	}

	@Override
	public BeerDto  updateBeer(UUID beerId,BeerDto beerDto) {

		Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);
		 beer.setBeerName(beerDto.getBeerName());
		 beer.setBeerStyle(beerDto.getBeerStyle().name());
		 beer.setPrice(beerDto.getPrice());

		 return   mapper.beerToBeerDto(beerRepository.save(beer));
	}

	@Override
	public BeerDto saveBeer(BeerDto beerDto) {
		return mapper.beerToBeerDto(beerRepository.save(mapper.beerDtoToBeer(beerDto)));
	}

	@Override
	public BeerDto getBeerByUpc(int upc) {
		// TODO Auto-generated method stub
		return null;
	}

}
