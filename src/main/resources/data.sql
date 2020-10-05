CREATE TABLE user (
    id INT PRIMARY KEY,
    email VARCHAR(250) NOT NULL,
    name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    birth_date DATE
);