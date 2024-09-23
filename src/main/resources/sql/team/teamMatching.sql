CREATE TABLE TBL_TEAM_MATCHING(
                                  ID NUMBER PRIMARY KEY,
                                  TRYTEAM_ID NUMBER,
                                  MATCHING_ID NUMBER,
                                  CREATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
                                  UPDATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
                                  CONSTRAINT FK_TEAM_MATCHING_MATCHING FOREIGN KEY(MATCHING_ID)
                                      REFERENCES TBL_MATCHING(POST_ID),
                                  CONSTRAINT FK_TEAM_MATCHING_TEAM FOREIGN KEY(TRYTEAM_ID)
                                      REFERENCES TBL_TEAM(ID)
);
