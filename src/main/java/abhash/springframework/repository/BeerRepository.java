package abhash.springframework.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import abhash.springframework.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
