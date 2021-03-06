CREATE TABLE ELEMENTCOLLECTIONSTRINGMAP_EMP_PHONE (EMPLOYEE_ID INTEGER NOT NULL, PHONE_NUM VARCHAR(255), PHONE_TYPE VARCHAR(255));
CREATE TABLE ELEMENTCOLLECTIONSTRINGMAP_EMPLOYEE (ID INTEGER AUTO_INCREMENT NOT NULL, NAME VARCHAR(255), SALARY INT, DEPARTMENT_ID INTEGER, PRIMARY KEY (ID));
CREATE TABLE ELEMENTCOLLECTIONSTRINGMAP_DEPARTMENT (ID INTEGER AUTO_INCREMENT NOT NULL, NAME VARCHAR(255), PRIMARY KEY (ID));
ALTER TABLE ELEMENTCOLLECTIONSTRINGMAP_EMP_PHONE ADD CONSTRAINT EMPPHONEID FOREIGN KEY (EMPLOYEE_ID) REFERENCES ELEMENTCOLLECTIONSTRINGMAP_EMPLOYEE (ID);
ALTER TABLE ELEMENTCOLLECTIONSTRINGMAP_EMPLOYEE ADD CONSTRAINT MPLOYEEDPARTMENTID FOREIGN KEY (DEPARTMENT_ID) REFERENCES ELEMENTCOLLECTIONSTRINGMAP_DEPARTMENT (ID);