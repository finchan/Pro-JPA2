CREATE TABLE ONETOMANYENTITYATTRIBUTEKEY_EMPLOYEE (ID INTEGER AUTO_INCREMENT NOT NULL, NAME VARCHAR(255), SALARY BIGINT,
                                                   DEPARTMENT_ID INTEGER, PRIMARY KEY (ID));
CREATE TABLE ONETOMANYENTITYATTRIBUTEKEY_DEPARTMENT (ID INTEGER AUTO_INCREMENT NOT NULL, NAME VARCHAR(255), PRIMARY KEY (ID));