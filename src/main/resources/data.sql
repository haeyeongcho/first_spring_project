CREATE TABLE article (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         title VARCHAR(255),
                         content VARCHAR(255)
);


-- data.sql
INSERT INTO article (title, content) VALUES ('aaaa', '1111');
INSERT INTO article (title, content) VALUES ('bbbb', '2222');
INSERT INTO article (title, content) VALUES ('cccc', '3333');
