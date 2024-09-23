CREATE TABLE TBL_VOLUNTEER(
                              ID NUMBER PRIMARY KEY,
                              USER_ID NUMBER,
                              TEAMPOST_ID NUMBER,
                              INTRODUCE VARCHAR2(255) NOT NULL,
                              CREATED_DATE DATE DEFAULT SYSDATE NOT NULL,
                              UPDATED_DATE DATE NOT NULL,
                              CONSTRAINT FK_VOLUNTEER_USER FOREIGN KEY(USER_ID)
                                  REFERENCES TBL_USER(ID),
                              CONSTRAINT FK_VOLUNTEER_TEAM FOREIGN KEY(TEAMPOST_ID)
                                  REFERENCES TBL_TEAMPOST(POST_ID)
);
