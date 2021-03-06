insert into airway(name) values('SAW');
insert into airway(name) values('ESB');
insert into airway(name) values('IGA');
insert into airline(name) values('THY');
insert into airline(name) values('PGS');
insert into airline(name) values('ATLAS');
insert into route(departure_id, arrival_id, time_in_minutes) values(2, 1, 125);
insert into route(departure_id, arrival_id, time_in_minutes) values(3, 2, 135);
insert into route(departure_id, arrival_id, time_in_minutes) values(1, 3, 155);
insert into flight (quota, route_id, airline_id) values(100, 1, 2);
insert into flight (quota, route_id, airline_id) values(110, 2, 1);
insert into ticket (number, credit_card, price, sold, cancelled, flight_id) values('12345567', '1111111111111111', 123.0, 0, 0, 1);
insert into ticket (number, credit_card, price, sold, cancelled, flight_id) values('12345568', '2222222222222222', 124.0, 1, 0, 1);
insert into ticket (number, credit_card, price, sold, cancelled, flight_id) values('12345569', '3333333333333333', 125.0, 1, 1, 2);
insert into ticket (number, credit_card, price, sold, cancelled, flight_id) values('12345560', '3333333333333333', 126.0, 0, 1, 2);