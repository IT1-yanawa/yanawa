CREATE TABLE TBL_ATTACHMENT (
                                ID NUMBER PRIMARY KEY,
                                ATTACHMENT_PATH VARCHAR2(255) NOT NULL,
                                ATTACHMENT_SIZE NUMBER DEFAULT 0,
                                POST_ID NUMBER NOT NULL,
                                CREATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
                                UPDATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
                                CONSTRAINT FK_ATTACHMENT_POST FOREIGN KEY(POST_ID)
                                    REFERENCES TBL_POST(ID)
);
