package abhash.springframework.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import abhash.springframework.domain.Beer;
import abhash.springframework.repository.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner{

	public static final String BEER_UPC_1="0231786738383";
	public static final String BEER_UPC_2="0231786738383";
	public static final String BEER_UPC_3 ="0231786738383";

	private final BeerRepository beerRepo;
	

	public BeerLoader(BeerRepository beerRepo) {
		this.beerRepo = beerRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		loadBeerObjects();
		
		
	}



	private void loadBeerObjects() {
	
		if(beerRepo.count()==0) {
			beerRepo.save(Beer.builder()
					.beerName("Leffe")
					.beerStyle("Blond")
					.quantityToBrew(12)
					.minOnHand(5)
					.price(new BigDecimal(4.95))
					.upc(BEER_UPC_1)
					.build());
			
			beerRepo.save(Beer.builder()
					.beerName("Affingen")
					.beerStyle("Blond")
					.quantityToBrew(20)
					.minOnHand(2)
					.price(new BigDecimal(6.95))
					.upc(BEER_UPC_2)
					.build());

			beerRepo.save(Beer.builder()
					.beerName("Duvel")
					.beerStyle("IPA")
					.quantityToBrew(20)
					.minOnHand(12)
					.price(new BigDecimal(8.95))
					.upc(BEER_UPC_3)
					.build());
		}
		
		
	}

}
