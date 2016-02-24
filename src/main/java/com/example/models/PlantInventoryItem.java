package com.example.models;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class PlantInventoryItem {
	@Id
	@GeneratedValue
	Long Id;
	
	@ManyToOne
	PlantInventoryEntry plant_info;

	@OneToOne
	PlantReservation plant_reservation;

	
	@OneToOne
	MaintenancePlan maintenance_plan;

	String serial_number;
	
	@Enumerated(EnumType.STRING)
	EquipmentCondition condition;
	
}

