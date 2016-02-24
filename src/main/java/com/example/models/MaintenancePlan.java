package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class MaintenancePlan {
	@Id
	@GeneratedValue
	Long Id;

//	@OneToOne
//	PlantInventoryItem plant;
	
//	@OneToOne
//	PlantReservation reservation;
	
//	@OneToMany
//	List<PlantInventoryItem> plant;
	
	Integer year_of_action;
	
}
