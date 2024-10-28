-- V1__create_tables.sql

-- Create CUSTOMER_TYPES table, which represents available customer types:
CREATE TABLE IF NOT EXISTS CLIENT_TYPE(
  id NUMBER(20,0) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
  type VARCHAR2(4000) NOT NULL,
  CONSTRAINT client_type_pk PRIMARY KEY(id)
);

COMMENT ON COLUMN CLIENTS.client_id IS 'customer unique id';

-- Create CLIENTS table, which contains all customer related personal data:
CREATE TABLE IF NOT EXISTS CLIENTS(
  client_id NUMBER(20,0) GENERATED ALWAYS AS IDENTITY (START WITH 1727298000 INCREMENT BY 1),
  email VARCHAR2(4000) NOT NULL,
  phone VARCHAR2(4000) NOT NULL,
  client_type_id NUMBER(20,0) NOT NULL,
  first_name VARCHAR2(4000),
  last_name VARCHAR2(4000),
  company_name VARCHAR2 (4000),
  CONSTRAINT clients_pk PRIMARY KEY(client_id)
);

COMMENT ON COLUMN CLIENTS.client_id IS 'customer unique id';
ALTER TABLE CLIENTS ADD FOREIGN KEY(client_type_id) REFERENCES CLIENT_TYPE (id);

-- Create COUNTERS table, which contains all counted ranted cars by customer and car type:
CREATE TABLE IF NOT EXISTS COUNTERS(
  counter_id NUMBER(20,0) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
  client_id NUMBER(20,0) NOT NULL,
  economy_num INTEGER,
  middle_num INTEGER,
  business_num INTEGER,
  premium_num INTEGER,
  suv_num INTEGER,
  minivans_num INTEGER,
  electro_hybrid_num INTEGER,
  CONSTRAINT counters_pk PRIMARY KEY(counter_id)
);

ALTER TABLE COUNTERS ADD FOREIGN KEY(client_id) REFERENCES CLIENTS(client_id);

-- Create CLASSIFICATION table, which classify cars by a class:
CREATE TABLE IF NOT EXISTS CLASSIFICATION(
  class_id NUMBER(20,0) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
  description VARCHAR2(4000),
  CONSTRAINT classification_pk PRIMARY KEY(class_id)
);

-- Create FUEL table, which classify cars by a fuel type:
CREATE TABLE IF NOT EXISTS FUEL(
  fuel_id NUMBER(20,0) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
  fuel_type VARCHAR2(4000),
  CONSTRAINT fuel_pk PRIMARY KEY(id)
);

-- Create COUNTRY table, which classify cars' model name with appropriate country of origin:
CREATE TABLE IF NOT EXISTS COUNTRY(
  country_id NUMBER(20,0) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
  country_of_origin VARCHAR2(4000),
  CONSTRAINT country_pk PRIMARY KEY(id)
);

-- Create CARS table, which represents cars' related data:
CREATE TABLE IF NOT EXISTS CARS(
  car_id NUMBER(20,0) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
  customer_id NUMBER(20,0),
  status VARCHAR2(4000) NOT NULL,
  class_id NUMBER(20,0) NOT NULL,
  model_name VARCHAR2(4000) NOT NULL,
  release_date DATE NOT NULL,
  fuel_id NUMBER(20,0) NOT NULL,
  engine_volume VARCHAR2(4000) NOT NULL,
  gear_type VARCHAR2(4000) NOT NULL,
  country_id NUMBER(20,0) NOT NULL,
  CONSTRAINT cars_pk PRIMARY KEY(car_id)
);

COMMENT ON COLUMN CARS.car_id IS 'car unique id';
ALTER TABLE CARS ADD FOREIGN KEY(customer_id) REFERENCES CLIENTS(client_id);
ALTER TABLE CARS ADD FOREIGN KEY(class_id) REFERENCES CLASSIFICATION (class_id);
ALTER TABLE CARS ADD FOREIGN KEY(fuel_id) REFERENCES FUEL(fuel_id);
ALTER TABLE CARS ADD FOREIGN KEY(country_id) REFERENCES COUNTRY(country_id);

-- Create RATE table, which manages rate model and prices depending on car's class:
CREATE TABLE IF NOT EXISTS RATE(
  rate_id NUMBER(20,0) GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
  class_id NUMBER(20,0),
  name VARCHAR2(4000) NOT NULL,
  price NUMBER(20,0),
  percentage NUMBER(20,0),
  CONSTRAINT rate_pk PRIMARY KEY(rate_id)
);

ALTER TABLE RATE ADD FOREIGN KEY(class_id) REFERENCES CLASSIFICATION(class_id);