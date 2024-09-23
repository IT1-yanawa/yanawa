CREATE TABLE TBL_PROFILE_IMG(
                                ID NUMBER PRIMARY KEY,
                                PROFILE_PATH VARCHAR2(255) NOT NULL,
                                PROFILE_SIZE NUMBER DEFAULT 0,
                                STATUS NUMBER DEFAULT 0,
                                CREATED_DATE DATE DEFAULT SYSDATE NOT NULL,
                                UPDATED_DATE DATE NOT NULL,
                                USER_ID NUMBER NOT NULL,
                                CONSTRAINT FK_PROFILE_USER FOREIGN KEY (USER_ID)
                                    REFERENCES TBL_USER(ID)
);
