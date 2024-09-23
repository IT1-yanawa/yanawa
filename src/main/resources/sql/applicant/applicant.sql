CREATE TABLE TBL_APPLICANT(
    ID NUMBER PRIMARY KEY,
    USER_ID NUMBER,
    TEAM_POST_ID NUMBER,
    INTRODUCE VARCHAR2(255) NOT NULL,
    CREATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
    UPDATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_VOLUNTEER_USER FOREIGN KEY(USER_ID)
    REFERENCES TBL_USER(ID),
    CONSTRAINT FK_VOLUNTEER_TEAM FOREIGN KEY(TEAM_POST_ID)
    REFERENCES TBL_TEAM_POST(POST_ID)
);

CREATE SEQUENCE SEQ_APPLICANT;

SELECT * FROM TBL_APPLICANT;