CREATE TABLE TBL_MEMBER(
                           ID NUMBER PRIMARY KEY,
                           USER_ID NUMBER,
                           CREATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
                           UPDATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
                           CONSTRAINT FK_MEMBER_USER FOREIGN KEY(USER_ID)
                               REFERENCES TBL_USER(ID)
);
