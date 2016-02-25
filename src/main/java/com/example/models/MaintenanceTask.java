package com.example.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
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
public class MaintenanceTask {
	
	@Id
	@GeneratedValue
	Long Id;
	
	@ManyToOne
	MaintenancePlan maint_plan;
	
	@OneToOne
	PlantReservation reservation;

	String description;
	
	@Enumerated(EnumType.STRING)
	TypeOfWork work;
	
	@Column(precision=8, scale=2)
	BigDecimal price;
	
	@Embedded
	BusinessPeriod schedule;
	
}
