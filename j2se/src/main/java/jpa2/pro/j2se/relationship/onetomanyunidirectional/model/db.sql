CREATE TABLE ONETOMANYUNIDIRECTIONAL_PHONE (ID INTEGER  NOT NULL AUTO_INCREMENT,
                    TYPE VARCHAR(255), NUM VARCHAR(32), PRIMARY KEY (ID));
CREATE TABLE ONETOMANYUNIDIRECTIONAL_EMPLOYEE (ID INTEGER  NOT NULL AUTO_INCREMENT,
                       NAME VARCHAR(255), SALARY BIGINT, PRIMARY KEY (ID));
CREATE TABLE ONETOMANYUNIDIRECTIONAL_EMP_PHONE (ONETOMANYUNIDIRECTIONAL_PHONE_ID INTEGER NOT NULL, EMP_ID INTEGER NOT NULL,
                        CONSTRAINT ONETOMANYUNIDIRECTIONAL_PHONE_FK FOREIGN KEY (ONETOMANYUNIDIRECTIONAL_PHONE_ID) REFERENCES ONETOMANYUNIDIRECTIONAL_PHONE (ID),
                        CONSTRAINT ONETOMANYUNIDIRECTIONAL_EMP_FK FOREIGN KEY (EMP_ID) REFERENCES ONETOMANYUNIDIRECTIONAL_EMPLOYEE (ID),
                        PRIMARY KEY (ONETOMANYUNIDIRECTIONAL_PHONE_ID, EMP_ID))