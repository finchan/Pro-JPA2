CREATE TABLE REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE (ID INTEGER NOT NULL, LOT INTEGER, LOCATION VARCHAR(255), PRIMARY KEY (ID));
CREATE TABLE REMOVINGWITHRELATIONSHIPSCASCADE_EMPLOYEE (ID INTEGER NOT NULL, NAME VARCHAR(255), PSPACE_ID INTEGER, PRIMARY KEY (ID),
                       CONSTRAINT PSPACE_FK FOREIGN KEY (PSPACE_ID) REFERENCES REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE(ID));
CREATE TABLE REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID INTEGER NOT NULL, NUMBER VARCHAR(255), TYPE VARCHAR(255), EMPLOYEE_ID INTEGER, PRIMARY KEY (ID),
                    CONSTRAINT EMPLOYEE_FK FOREIGN KEY (EMPLOYEE_ID) REFERENCES REMOVINGWITHRELATIONSHIPSCASCADE_EMPLOYEE(ID));

INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE (ID, LOT, LOCATION) VALUES (1, 1, 'East Lot');
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE (ID, LOT, LOCATION) VALUES (2, 2, 'West Lot');
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE (ID, LOT, LOCATION) VALUES (3, 3, 'North Lot');
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE (ID, LOT, LOCATION) VALUES (4, 4, 'South Lot');
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PARKING_SPACE (ID, LOT, LOCATION) VALUES (5, 5, 'West Lot');

INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_EMPLOYEE (ID, NAME, PSPACE_ID) VALUES (1, 'Joan', 1);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_EMPLOYEE (ID, NAME, PSPACE_ID) VALUES (2, 'Sarah', 2);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_EMPLOYEE (ID, NAME, PSPACE_ID) VALUES (3, 'John', 3);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_EMPLOYEE (ID, NAME, PSPACE_ID) VALUES (4, 'Roberts', 4);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_EMPLOYEE (ID, NAME, PSPACE_ID) VALUES (5, 'Peter', 5);

INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (1, '212-555-1234', 'office', 1);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (2, '212-555-1234', 'home', 1);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (3, '315-555-1234', 'office', 2);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (4, '516-555-1234', 'office', 3);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (5, '516-555-1234', 'cell', 3);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (6, '650-555-1234', 'office', 4);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (7, '650-555-1234', 'home', 4);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (8, '650-555-1234', 'office', 5);
INSERT INTO REMOVINGWITHRELATIONSHIPSCASCADE_PHONE (ID, NUMBER, TYPE, EMPLOYEE_ID) VALUES (9, '650-555-1234', 'cell', 5);