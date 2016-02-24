package com.example.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PlantReservation {
	@Id
	@GeneratedValue
	Long Id;

	
//	@ManyToOne
//	PurchaseOrder rental;
	
	
@Embedded
BusinessPeriod rental_period;

}
