package abhash.springframework.web.mapper;

import org.mapstruct.Mapper;

import abhash.springframework.domain.Beer;
import abhash.springframework.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

	Beer beerDtoToBeer(BeerDto beerDto);
	BeerDto beerToBeerDto(Beer beer);
}
