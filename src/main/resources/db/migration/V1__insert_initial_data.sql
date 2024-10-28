-- V2__insert_initial_data.sql

-- Insert into CLIENT_TYPE table:
INSERT INTO CLIENT_TYPE(type) VALUES('Residential');
INSERT INTO CLIENT_TYPE(type) VALUES('Company');

-- Insert into CLIENTS table:
INSERT INTO CLIENTS(email, phone, client_type_id, first_name, last_name)
VALUES('Tania_Olson-Reichert@gmail.com', '+380(0542)62-43-22', 1, 'Tania', 'Olson-Reichert');

INSERT INTO CLIENTS(email, phone, client_type_id, first_name, last_name)
VALUES('Leif_Tremblay@gmail.com', '+380(0564)72-18-01', 1, 'Leif', 'Tremblay');

INSERT INTO CLIENTS(email, phone, client_type_id, first_name, last_name)
VALUES('Greyson.Altenwerth23@gmail.com', '+380(0642)52-79-93', 1, 'Greyson', 'Altenwerth');

INSERT INTO CLIENTS(email, phone, client_type_id, first_name, last_name)
VALUES('Christian_Brown@gmail.com', '+380(0692)53-38-97', 1, 'Christian', 'Brown');

INSERT INTO CLIENTS(email, phone, client_type_id, first_name, last_name)
VALUES('Pedro59@gmail.com', '+380(062)58-25-91', 1, 'Pedro', 'Dominguez');

INSERT INTO CLIENTS(email, phone, client_type_id, company_name)
VALUES('lifecell_ukraine@gmail.com', '+380(0635)44-31-11', 2, 'LIFECELL');

INSERT INTO CLIENTS(email, phone, client_type_id, company_name)
VALUES('kyivstar_ukraine@gmail.com', '+380(0674)66-04-66', 2, 'KYIVSTAR_LLC');

INSERT INTO CLIENTS(email, phone, client_type_id, company_name)
VALUES('vodafone_ukraine@gmail.com', '+380(0500)40-01-11', 2, 'VODAFONE_LLC');

-- Insert into CLASSIFICATION table:
INSERT INTO CLASSIFICATION(description) VALUES('Economy Class');
INSERT INTO CLASSIFICATION(description) VALUES('Middle Class');
INSERT INTO CLASSIFICATION(description) VALUES('Business Class');
INSERT INTO CLASSIFICATION(description) VALUES('Premium Class');
INSERT INTO CLASSIFICATION(description) VALUES('SUV Class');
INSERT INTO CLASSIFICATION(description) VALUES('Minivan Class');
INSERT INTO CLASSIFICATION(description) VALUES('Electric_Hybrid Class');

-- Insert into FUEL table:
INSERT INTO FUEL(fuel_type) VALUES('Gasoline');
INSERT INTO FUEL(fuel_type) VALUES('Gas');
INSERT INTO FUEL(fuel_type) VALUES('Hybrid (HEV)');
INSERT INTO FUEL(fuel_type) VALUES('Hybrid (PHEV)');
INSERT INTO FUEL(fuel_type) VALUES('Hybrid (MHEV)');
INSERT INTO FUEL(fuel_type) VALUES('Diesel');
INSERT INTO FUEL(fuel_type) VALUES('Electro');

-- Insert into COUNTRY table:
INSERT INTO COUNTRY(country_of_origin) VALUES('China');
INSERT INTO COUNTRY(country_of_origin) VALUES('United States');
INSERT INTO COUNTRY(country_of_origin) VALUES('Japan');
INSERT INTO COUNTRY(country_of_origin) VALUES('South Korea');
INSERT INTO COUNTRY(country_of_origin) VALUES('Germany');
INSERT INTO COUNTRY(country_of_origin) VALUES('Spain');
INSERT INTO COUNTRY(country_of_origin) VALUES('France');
INSERT INTO COUNTRY(country_of_origin) VALUES('Czech Republic');
INSERT INTO COUNTRY(country_of_origin) VALUES('Slovakia');
INSERT INTO COUNTRY(country_of_origin) VALUES('United Kingdom');
INSERT INTO COUNTRY(country_of_origin) VALUES('Italy');
INSERT INTO COUNTRY(country_of_origin) VALUES('Poland');
INSERT INTO COUNTRY(country_of_origin) VALUES('Hungary');
INSERT INTO COUNTRY(country_of_origin) VALUES('Belgium');
INSERT INTO COUNTRY(country_of_origin) VALUES('Sweden');
INSERT INTO COUNTRY(country_of_origin) VALUES('Netherlands');
INSERT INTO COUNTRY(country_of_origin) VALUES('Austria');
INSERT INTO COUNTRY(country_of_origin) VALUES('Slovenia');
INSERT INTO COUNTRY(country_of_origin) VALUES('Finland'	);

-- Insert into CARS table:
INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298000, 'Not Available', 4, 'Mercedes Benz E220d', TO_DATE('2016', 'YYYY'), 6, '2.01',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298000, 'Not Available', 5, 'Mercedes-Benz GLE', TO_DATE('2015', 'YYYY'), 1, '3.01',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298000, 'Not Available', 7, 'Honda Accord Hybrid', TO_DATE('2024', 'YYYY'), 3, '2.0 turbo',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 1, 'Ford Fiesta Sedan', TO_DATE('2018', 'YYYY'), 1, '1.61',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 1, 'Ford Fiesta Sedan', TO_DATE('2018', 'YYYY'), 1, '1.61',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 1, 'Ford Focus', TO_DATE('2016', 'YYYY'), 1, '2.01',  'Mechanic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 1, 'KIA Forte', TO_DATE('2013', 'YYYY'), 1, '2.0',  'Automatic', 4);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 1, 'Mitsubishi Outlander Sport (ASX)', TO_DATE('2010', 'YYYY'), 1, '2.0',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 2, 'VOLKSWAGEN JETTA 1.4 TSI', TO_DATE('2018', 'YYYY'), 1, '1.4',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 2, 'VOLKSWAGEN JETTA 1.8 TSI', TO_DATE('2018', 'YYYY'), 1, '1.8',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298004, 'Not Available', 2, 'Mazda 3', TO_DATE('2019', 'YYYY'), 1, '2.0',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 2, 'Hyundai Ioniq', TO_DATE('2022', 'YYYY'), 3, '1.6',  'Automatic', 4);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 2, 'Volkswagen Golf', TO_DATE('2020', 'YYYY'), 6, '2.0 turbo',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298004, 'Not Available', 2, 'Volkswagen Jetta', TO_DATE('2022', 'YYYY'), 1, '1.4',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 2, 'Honda Civic', TO_DATE('2022', 'YYYY'), 1, '2.0',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 2, 'VOLKSWAGEN JETTA 1.4 SE', TO_DATE('2022', 'YYYY'), 1, '1.4',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298004, 'Not Available', 2, 'Volkswagen Jetta SEL', TO_DATE('2022', 'YYYY'), 1, '1.4',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298004, 'Not Available', 2, 'Audi A3', TO_DATE('2022', 'YYYY'), 1, '1.8',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 3, 'Toyota Camry 70 Hybrid', TO_DATE('2023', 'YYYY'), 4, '2.5',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 3, 'Audi A4', TO_DATE('2023', 'YYYY'), 1, '2.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 3, 'Honda Accord Hybrid', TO_DATE('2024', 'YYYY'), 4, '2.0 turbo',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 3, 'BMW 525d G30', TO_DATE('2017', 'YYYY'), 6, '2.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 3, 'Audi A6 Quattro', TO_DATE('2022', 'YYYY'), 1, '3.0 turbo',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 3, 'Mercedes Benz E220d', TO_DATE('2022', 'YYYY'), 6, '2.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'BMW M8 Cabrio', TO_DATE('2021', 'YYYY'), 1, '4.4',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'FORD MUSTANG', TO_DATE('2020', 'YYYY'), 1, '2.3',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Volkswagen Touareg', TO_DATE('2021', 'YYYY'), 1, '3.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Land Rover Range Rover Sport', TO_DATE('2020', 'YYYY'), 6, '3.0',  'Automatic', 10);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298003, 'Not Available', 4, 'Audi Q7', TO_DATE('2022', 'YYYY'), 1, '3.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Ford Mustang GT', TO_DATE('2019', 'YYYY'), 1, '2.3',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Mercedes-Benz GLE', TO_DATE('2024', 'YYYY'), 6, '2.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Toyota Land Cruiser 200', TO_DATE('2022', 'YYYY'), 6, '4.5',  'Automatic', 3);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298003, 'Not Available', 4, 'RANGE ROVER SPORT SVR', TO_DATE('2017', 'YYYY'), 1, '3.0',  'Automatic', 10);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Mercedes Benz W222 S550', TO_DATE('2019', 'YYYY'), 1, '4.7',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Mercedes Benz G63 AMG', TO_DATE('2022', 'YYYY'), 1, '4.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Toyota Land Cruiser 300', TO_DATE('2021', 'YYYY'), 1, '3.3',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Range Rover Vogue Long', TO_DATE('2021', 'YYYY'), 1, '5.5',  'Automatic', 10);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'Mercedes-Benz G500', TO_DATE('2022', 'YYYY'), 1, '5.5',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298003, 'Not Available', 4, 'BMW M5', TO_DATE('2020', 'YYYY'), 1, '4.4',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 4, 'BMW M760 LI', TO_DATE('2024', 'YYYY'), 1, '6.6',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Nissan Rogue Sport', TO_DATE('2018', 'YYYY'), 1, '2.0',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'JEEP COMPASS', TO_DATE('2018', 'YYYY'), 1, '2.4',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Honda HRV', TO_DATE('2019', 'YYYY'), 1, '1.8',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Hyundai Santa Fe', TO_DATE('2019', 'YYYY'), 1, '2.2',  'Automatic', 4);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Mitsubishi Outlander', TO_DATE('2020', 'YYYY'), 1, '2.4',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'VOLKSWAGEN ATLAS R-LINE', TO_DATE('2022', 'YYYY'), 1, '3.6',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Audi Q5 Quattro', TO_DATE('2022', 'YYYY'), 1, '2.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Volkswagen ID.4 Pure+', TO_DATE('2023', 'YYYY'), 7, '84kW',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Volkswagen ID.4 Prime', TO_DATE('2023', 'YYYY'), 7, '84kW',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Mazda CX-9', TO_DATE('2020', 'YYYY'), 1, '2.5',  'Automatic', 4);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Mazda CX-9', TO_DATE('2020', 'YYYY'), 1, '2.5',  'Automatic', 4);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Volkswagen ID.4 PRO 2023', TO_DATE('2023', 'YYYY'), 7, '88kW',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Lexus RX350', TO_DATE('2021', 'YYYY'), 1, '3.5',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'BMW X5', TO_DATE('2022', 'YYYY'), 1, '3.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Toyota Highlander Hybrid', TO_DATE('2021', 'YYYY'), 1, '2.5',  'Automatic', 3);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'DODGE RAM', TO_DATE('2023', 'YYYY'), 1, '5.7',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'Ford F150', TO_DATE('2022', 'YYYY'), 1, '5.0',  'Automatic', 2);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 5, 'RANGE ROVER SPORT SVR', TO_DATE('2020', 'YYYY'), 1, '3.0',  'Automatic', 10);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298005, 'Not Available', 6, 'MERCEDES-BENZ METRIS', TO_DATE('2022', 'YYYY'), 1, '2.0',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298006, 'Not Available', 6, 'VOLKSWAGEN MULTIVAN', TO_DATE('2016', 'YYYY'), 1, '2.0',  'Automatic', 5);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298007, 'Not Available', 6, 'Mercedes-Benz V class', TO_DATE('2023', 'YYYY'), 1, '2.0',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 7, 'Toyota Highlander Hybrid', TO_DATE('2022', 'YYYY'), 5, '2.5',  'Automatic', 3);

INSERT INTO CARS(customer_id, status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES(1727298002, 'Not Available', 7, 'Mercedes-Benz EQC', TO_DATE('2024', 'YYYY'), 7, '85kW',  'Automatic', 5);

INSERT INTO CARS( status, class_id, model_name, release_date, fuel_id, engine_volume, gear_type, country_id)
VALUES('Available', 7, 'Mercedes-Benz GLS', TO_DATE('2024', 'YYYY'), 4, '3.0',  'Automatic', 5);

-- Insert into COUNTERS table:
INSERT INTO COUNTERS(client_id, economy_num, middle_num, business_num, premium_num, suv_num, minivans_num, electro_hybrid_num)
VALUES(1727298004, 0, 4, 0, 0, 0, 0, 0);

INSERT INTO COUNTERS(client_id, economy_num, middle_num, business_num, premium_num, suv_num, minivans_num, electro_hybrid_num)
VALUES(1727298003, 0, 0, 0, 3, 0, 0, 0);

INSERT INTO COUNTERS(client_id, economy_num, middle_num, business_num, premium_num, suv_num, minivans_num, electro_hybrid_num)
VALUES(1727298002, 0, 0, 0, 0, 0, 0, 1);

INSERT INTO COUNTERS(client_id, economy_num, middle_num, business_num, premium_num, suv_num, minivans_num, electro_hybrid_num)
VALUES(1727298006, 0, 0, 0, 0, 0, 1, 0);

INSERT INTO COUNTERS(client_id, economy_num, middle_num, business_num, premium_num, suv_num, minivans_num, electro_hybrid_num)
VALUES(1727298007, 0, 0, 0, 0, 0, 1, 0);

INSERT INTO COUNTERS(client_id, economy_num, middle_num, business_num, premium_num, suv_num, minivans_num, electro_hybrid_num)
VALUES(1727298000, 0, 0, 0, 1, 1, 0, 1);

INSERT INTO COUNTERS(client_id, economy_num, middle_num, business_num, premium_num, suv_num, minivans_num, electro_hybrid_num)
VALUES(1727298005, 0, 0, 0, 0, 0, 1, 0);

-- Insert into RATE table:
INSERT INTO RATE(class_id, name, price, percentage) VALUES(1, 'Daily', 25, 1500);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(1, 'Weekly', 20, 1750);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(1, 'Monthly', 18, 2000);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(2, 'Daily', 40, 1500);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(2, 'Weekly', 35, 1750);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(2, 'Monthly', 25, 2000);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(3, 'Daily', 75, 1500);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(3, 'Weekly', 65, 1750);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(3, 'Monthly', 45, 2000);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(4, 'Daily', 150, 1500);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(4, 'Weekly', 130, 1750);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(4, 'Monthly', 80, 2000);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(5, 'Daily', 90, 1500);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(5, 'Weekly', 80, 1750);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(5, 'Monthly', 60, 2000);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(6, 'Daily', 200, 1500);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(6, 'Weekly', 180, 1750);
INSERT INTO RATE(class_id, name, price, percentage) VALUES(6, 'Monthly', 150, 2000);