CREATE TABLE TBL_POST(
                         ID NUMBER PRIMARY KEY,
                         POST_TITLE VARCHAR2(255) NOT NULL,
                         POST_CONTENT VARCHAR2(255) NOT NULL,
                         CREATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
                         UPDATED_DATE DATE DEFAULT CURRENT_TIMESTAMP,
                         TYPE NUMBER NOT NULL
);
