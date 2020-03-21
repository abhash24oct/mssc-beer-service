package abhash.springframework.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abhash.springframework.web.model.BeerDto;
import abhash.springframework.web.service.BeerService;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
	
	private BeerService beerService;

	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}
	
	@GetMapping
	public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
		
		
		BeerDto beerDto = beerService.getBeerId(beerId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<BeerDto> saveBeer(@RequestBody BeerDto beerDto){
		BeerDto savedBeer = beerService.saveBeer(beerDto);
		return new ResponseEntity<BeerDto>(HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<BeerDto> updateBeer(@PathVariable("beerId") UUID beerId){
		
		BeerDto updatedBeer = beerService.updateBeer(beerId);
		return new ResponseEntity<BeerDto>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping
	public ResponseEntity<BeerDto> getBeerByUpcCode(@PathVariable("upc") int upc){
		BeerDto beerDto = beerService.getBeerByUpc(upc);
		return new ResponseEntity<BeerDto>(beerDto,HttpStatus.OK);
	}
	
}
