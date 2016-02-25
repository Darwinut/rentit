package com.example.models;

import java.math.BigDecimal;

import org.hibernate.annotations.Where;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.RentitApplication;
import com.example.models.PlantInventoryEntryRepository;
import com.mysema.query.types.expr.BooleanExpression;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RentitApplication.class)
@Sql("plant-dataset.sql")
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class RentitApplicationTests {

	@Autowired
	PlantInventoryEntryRepository repo;

	// Empty default test
	@Test
	public void contextLoads() {

	}

	// Normal test
	// There are 'n' entries in the repo
	@Test
	public void test1() {
		// means that if you count the repository, the result should 10.
		// Add an 'l' at the end as the result is in Long datatype
		assertThat(repo.count(), is(14l));
	}

	@Test
	public void test2() {
		assertThat(repo.findByNameContaining("Mini").size(), is(2));
	}
	
	
	// Get all the available plants in the query
	@Test
	public void getListOfAvailablePlants() {
		repo.findAll();
	}
	
	// Get the business periods with the exact names
	@Test
	public void getRentalAvailabilityForRental(String name, BusinessPeriod period) {
		repo.findAll(nameContains(name).and(isAvailableFor(period)));
	}
	
	//Query the list of plants that have not been hired during the last 6 months
	@Test
	public void plantsNotHiredDuringSixMonth(){
		
	}
	
	//Compute the number of corrective repairs per year for the last 5 years
	@Test
	public void numberOfRepairsPerYear(){
		
	}
	
	//Compute the cost due to corrective repairs per year for the last 5 years
	@Test
	public void costOfRepairsPerYear(){
		
	}
	
	
	// // queryDSL test
	// // Check that there are 4 purchase orders
	// @Test
	// public void test3() {
	// QPurchaseOrder plant = QPurchaseOrder.purchaseOrder;
	// assertThat(plant.count(), is(4));
	// }
	
	QPlantInventoryEntry plant = QPlantInventoryEntry.plantInventoryEntry;
	//
	// Plants containing specified name
	public BooleanExpression nameContains(String name) {
		return plant.name.contains(name);
	}
	// // Price less than threshold
	// public BooleanExpression priceBelow(BigDecimal threshold) {
	// return plant.price.lt(threshold);
	// }
	//
	// // queryDSL test
	// // Count the plants in the repo which have a price below 200
	// @Test
	// public void test4() {
	// QPlantInventoryEntry plant = QPlantInventoryEntry.plantInventoryEntry;
	// assertThat(repo.count(nameContains("Mini").and(priceBelow(BigDecimal.valueOf(200)))),
	// is(10l));
	// }

}
