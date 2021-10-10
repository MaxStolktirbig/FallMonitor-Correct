create table patient(
    patient_id integer identity primary key,
    name varchar(70) not null,
    room_number integer not null,
    phone_number integer not null,
    age integer not null,
    length float not null,
    severity varchar (10)
    );
create table recorded_patient_data(
    id integer identity primary key,
    patient_id integer,
    foreign key (patient_id) references patient(patient_id)
);

create table recorded_data_instance(
    id integer identity primary key,
    walking_speed float not null,
    recorded_patient_data_id integer,
    foreign key (recorded_patient_data_id) references recorded_patient_data(id)
);

create table caretaker(
    caretaker_id integer identity primary key,
    name varchar(70) not null,
    address varchar (50) not null,
    phone_number integer,
    email varchar(128)
);