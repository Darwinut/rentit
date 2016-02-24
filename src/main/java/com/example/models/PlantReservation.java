package com.example.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class PlantReservation {
	
@Embedded
BusinessPeriod rental_period;

}
