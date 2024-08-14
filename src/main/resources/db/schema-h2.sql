CREATE SCHEMA IF NOT EXISTS mybatisplus;
--SET SCHEMA mybatisplus;

DROP TABLE IF EXISTS client cascade;

CREATE TABLE client
(
    id                 BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL primary key,
    first_name         VARCHAR(255),
    last_name          VARCHAR(255),
    email              VARCHAR(255),
    creation_date      timestamp,
    last_modified_date timestamp,
    deleted            int default 0
);