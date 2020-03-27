package abhash.springframework.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	@Null
	private UUID id;
	@Null
	private Long version;
	
	@Null
	private OffsetDateTime createdDate;
	@Null
	private OffsetDateTime lastModifiedDate;
	
	@NotBlank
	private String beerName;
	@NotNull
	private BeerStyleEnum beerStyle;
	
	@NotNull
	@Positive
	private Long upc;
	private Integer quantityOnHand;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private BigDecimal price;
	
	

}
