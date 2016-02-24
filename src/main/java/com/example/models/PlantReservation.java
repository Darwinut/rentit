package com.example.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class PlantReservation {
	@Id
	@GeneratedValue
	Long Id;

	
	@ManyToOne
	PurchaseOrder rental;
	
	@OneToOne
	MaintenanceTask maintainence_task;
	

	@OneToOne
	MaintenancePlan maint_plan;
	

	@OneToOne
	PlantInventoryItem plant;
	
@Embedded
BusinessPeriod schedule;

}
