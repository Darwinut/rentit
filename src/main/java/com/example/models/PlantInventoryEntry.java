package com.example.models;

import java.math.BigDecimal;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class PlantInventoryEntry {
	@Id
	@GeneratedValue
	Long Id;
	
	@OneToOne
	PurchaseOrder purchase_order_plant;
	
	@OneToMany
	List<PlantInventoryItem> items;

	String name;
	String description;
	
	@Column(precision=8, scale=2)
	BigDecimal price;

}
