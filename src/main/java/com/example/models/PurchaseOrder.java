package com.example.models;

import java.math.BigDecimal;
import javax.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Data
public class PurchaseOrder {
	@Id
	@GeneratedValue
	Long Id;

	@OneToMany
	PlantInventoryEntry Plant;

	BusinessPeriod data = new BusinessPeriod();

	LocalDate issue_date;
	LocalDate payment_schedule;

	@Column(precision = 8, scale = 2)
	BigDecimal total;

	@Enumerated(EnumType.STRING)
	POStatus status;

	@Embedded
	BusinessPeriod rentalPeriod;
}
