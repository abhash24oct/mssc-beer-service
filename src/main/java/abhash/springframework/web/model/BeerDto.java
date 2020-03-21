package abhash.springframework.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	private String beerName;
	private BeerStyleEnum beerStyle;
	private String upc;
	private Integer quantityOnHand;
	private BigDecimal price;
	
	private UUID uuid;
	private Long version;
	
	private OffsetDateTime createdDate;
	private OffsetDateTime lastModifiedDate;

}
