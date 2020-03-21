package abhash.springframework.web.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(BeerController.class)
class BeerControllerTest {
	
	@Autowired
	MockMvc mockMvc;

	@Test
	void testBeerController() throws Exception {
		
		mockMvc.perform(get("/api/v1/beer/"+UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON)).andExpect(status()
				.isOk());
	}

	@Test
	void testGetBeerById() {
		//fail("Not yet implemented");
	}

	@Test
	void testSaveBeer() {
		//fail("Not yet implemented");
	}

	@Test
	void testUpdateBeer() {
		//fail("Not yet implemented");
	}

	

}
