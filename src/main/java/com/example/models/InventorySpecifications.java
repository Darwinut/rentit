package com.example.models;

import com.mysema.query.jpa.JPASubQuery;
import com.mysema.query.types.expr.BooleanExpression;

public class InventorySpecifications {
	
	static QPlantInventoryEntry plant = QPlantInventoryEntry.plantInventoryEntry;
	static QPlantReservation reservation = QPlantReservation.plantReservation;
	
	public static BooleanExpression isAvailableFor(BusinessPeriod period) {
		return plant.eq(
				new JPASubQuery().from(reservation).where(reservation.schedule.start_date = period.start_date)
				.count());
	}
	
}
