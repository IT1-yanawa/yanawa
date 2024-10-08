CREATE TABLE TBL_TEAM_MEMBER(
    ID NUMBER PRIMARY KEY,
    MEMBER_ID NUMBER,
    TEAM_ID NUMBER,
    CONSTRAINT FK_TEAM_MEMBER_TEAM FOREIGN KEY(TEAM_ID)
    REFERENCES TBL_TEAM(ID),
    CONSTRAINT FK_TEAM_MEMBER_MEMBER FOREIGN KEY(MEMBER_ID)
    REFERENCES TBL_MEMBER(ID)
);

CREATE SEQUENCE SEQ_TEAM_MEMBER;

SELECT * FROM TBL_TEAM_MEMBER;