create table patient
(
    patient_id   integer identity primary key,
    name         varchar(70) not null,
    room_number  integer     not null,
    phone_number integer     not null,
    age          integer     not null,
    length       float       not null,
    severity     varchar(10)
);


create table recorded_data_instance
(
    recorded_data_instance_id integer identity primary key,
    walking_speed             float not null,
    patient_id                integer,
    foreign key (patient_id) references patient (patient_id)
);


create table caretaker
(
    caretaker_id integer identity primary key,
    name         varchar(70) not null,
    address      varchar(50) not null,
    phone_number integer,
    email        varchar(128)
);