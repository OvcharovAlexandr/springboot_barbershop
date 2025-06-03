-- Creating DB
CREATE
    DATABASE barbershop;

USE
    barbershop;

-- Users
CREATE TABLE barbershop.users
(
    id           int NOT NULL AUTO_INCREMENT,
    user_name    varchar(200) UNIQUE,
    password     varchar(200),
    name         varchar(200),
    phone_number varchar(25),
    email        varchar(150),
    role         varchar(50),
    PRIMARY KEY (id)
);

-- Services
CREATE TABLE barbershop.services
(
    id          int NOT NULL AUTO_INCREMENT,
    name        varchar(200),
    description varchar(1024),
    price       decimal(15, 2),
    PRIMARY KEY (id)
);

-- Services gallery
CREATE TABLE barbershop.services_gallery
(
    id         int NOT NULL AUTO_INCREMENT,
    service_id int,
    img_url    varchar(1024),
    PRIMARY KEY (id),
    FOREIGN KEY (service_id) REFERENCES barbershop.services (id)
);

-- Schedule
CREATE TABLE barbershop.schedule
(
    id         int NOT NULL AUTO_INCREMENT,
    user_id    int,
    service_id int,
    event_date timestamp,
    details    varchar(1024),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES barbershop.users (id),
    FOREIGN KEY (service_id) REFERENCES barbershop.services (id)
);

-- Customers feedbacks
CREATE TABLE barbershop.customers_feedback
(
    id         int NOT NULL AUTO_INCREMENT,
    user_id    int,
    service_id int,
    event_date timestamp,
    commentary varchar(1024),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES barbershop.users (id),
    FOREIGN KEY (service_id) REFERENCES barbershop.services (id)
);

