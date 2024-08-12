CREATE TABLE author
(
    id         INT PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(255) NOT NULL,
    lastName  VARCHAR(255) NOT NULL
);

CREATE TABLE book
(
    id         INT PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(255) NOT NULL,
    pageCount INT          NOT NULL,
    author_id  INT,
    FOREIGN KEY (author_id) REFERENCES author (id)
);