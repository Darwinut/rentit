package com.example.models;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class MaintenancePlan {
	@Id
	@GeneratedValue
	Long Id;

	@OneToMany
	List<MaintenanceTask> tasks;
	
	@OneToOne
	PlantReservation maintenance_plan_reservation;
	
	@OneToOne
	PlantInventoryItem plant;
	
	Integer year_of_action;
	
}
