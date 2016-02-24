package com.example.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class PurchaseOrder {
	@Id
	@GeneratedValue
	Long Id;

//	@OneToOne
//	PlantInventoryEntry plant;

//	@OneToMany
//	List<PlantReservation> reservations;
		
	 LocalDate issueDate;
	 LocalDate paymentSchedule;

	@Column(precision = 8, scale = 2)
	BigDecimal total;

	@Enumerated(EnumType.STRING)
	POStatus status;

	@Embedded
	BusinessPeriod rental_period;
}
