CREATE TABLE COLLECTIONTABLE_EMPLOYEE (ID INTEGER AUTO_INCREMENT, NAME VARCHAR(255), SALARY BIGINT, PRIMARY KEY (ID));
CREATE TABLE COLLECTIONTABLE_Employee_VACATIONBOOKINGS (Employee_ID INTEGER NOT NULL, STARTDATE VARCHAR(255), DAYS INTEGER);
CREATE TABLE COLLECTIONTABLE_Employee_NICKNAMES (Employee_ID INTEGER NOT NULL, NICKNAMES VARCHAR(255));