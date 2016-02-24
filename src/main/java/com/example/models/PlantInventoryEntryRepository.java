package com.example.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantInventoryEntryRepository extends JpaRepository<PlantInventoryEntry, Long> {

	// Normal query
	List<PlantInventoryEntry> findByNameContaining(String str);

	// Named / explicit query
	@Query("select p from PlantInventoryEntry p where LOWER(p.name) like ?1 ")
	List<PlantInventoryEntry> finderMethod(String name);
}
