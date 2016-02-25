package com.example.models;

import java.math.BigDecimal;

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
	
	//
	// // queryDSL test
	// // Number of plants contains a substring 'Mini' and the result is 10
	// @Test
	// public void test3() {
	// QPlantInventoryEntry plant = QPlantInventoryEntry.plantInventoryEntry;
	// assertThat(repo.count(plant.name.contains("Mini")), is(10l));
	// }
	//
	// // Plants containing specified name
	// public BooleanExpression nameContains(String name) {
	// return plant.name.contains(name);
	// }
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
