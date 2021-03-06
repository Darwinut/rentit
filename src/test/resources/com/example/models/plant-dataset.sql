insert into plant_inventory_entry (id, name, description, price)
    values (1, 'Mini excavator', '1.5 Tonne Mini excavator', 150);
insert into plant_inventory_entry (id, name, description, price)
    values (2, 'Mini excavator', '3 Tonne Mini excavator', 200);
insert into plant_inventory_entry (id, name, description, price)
    values (3, 'Midi excavator', '5 Tonne Midi excavator', 250);
insert into plant_inventory_entry (id, name, description, price)
    values (4, 'Midi excavator', '8 Tonne Midi excavator', 300);
insert into plant_inventory_entry (id, name, description, price)
    values (5, 'Maxi excavator', '15 Tonne Large excavator', 400);
insert into plant_inventory_entry (id, name, description, price)
    values (6, 'Maxi excavator', '20 Tonne Large excavator', 450);
insert into plant_inventory_entry (id, name, description, price)
    values (7, 'HS dumper', '1.5 Tonne Hi-Swivel Dumper', 150);
insert into plant_inventory_entry (id, name, description, price)
    values (8, 'FT dumper', '2 Tonne Front Tip Dumper', 180);
insert into plant_inventory_entry (id, name, description, price)
    values (9, 'FT dumper', '2 Tonne Front Tip Dumper', 200);
insert into plant_inventory_entry (id, name, description, price)
    values (10, 'FT dumper', '2 Tonne Front Tip Dumper', 300);
insert into plant_inventory_entry (id, name, description, price)
    values (11, 'FT dumper', '3 Tonne Front Tip Dumper', 400);
insert into plant_inventory_entry (id, name, description, price)
    values (12, 'Loader', 'Hewden Backhoe Loader', 200);
insert into plant_inventory_entry (id, name, description, price)
    values (13, 'D-Truck', '15 Tonne Articulating Dump Truck', 250);
insert into plant_inventory_entry (id, name, description, price)
    values (14, 'D-Truck', '30 Tonne Articulating Dump Truck', 300);

insert into purchase_order (id, plant_id, start_date, end_date, total)
    values (1, 2, '2016-03-22', '2016-03-24', 600);
insert into purchase_order (id, plant_id, start_date, end_date, total)
    values (2, 1, '2016-03-25', '2016-03-28', 600);
insert into purchase_order (id, plant_id, start_date, end_date, total)
    values (3, 3, '2016-04-01', '2016-04-10', 1200);
insert into purchase_order (id, plant_id, start_date, end_date, total)
    values (4, 4, '2016-03-15', '2016-03-17', 600);
insert into purchase_order (id, plant_id, start_date, end_date, total)
    values (5, 5, '2016-03-18', '2016-03-23', 600);