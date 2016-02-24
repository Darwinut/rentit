package com.example.models;

import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class PurchaseOrder {
	@Id
	@GeneratedValue
	Long Id;

//	@OneToMany
//	PlantInventoryEntry Plant;

	@Column(precision = 8, scale = 2)
	BigDecimal total;

	@Enumerated(EnumType.STRING)
	POStatus status;

	@Embedded
	BusinessPeriod rental_period;
}
