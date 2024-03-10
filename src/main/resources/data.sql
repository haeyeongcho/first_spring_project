CREATE TABLE article (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         title VARCHAR(255),
                         content VARCHAR(255)
);

-- data.sql
INSERT INTO article (id, title, content) VALUES (1, 'aaaa', '1111');
INSERT INTO article (id, title, content) VALUES (2, 'bbbb', '2222');
INSERT INTO article (id, title, content) VALUES (3, 'cccc', '3333');

-- article 더미 데이터

INSERT INTO article (id, title, content) VALUES (4, 'What is the movie of your life?', 'Comment 1');
INSERT INTO article (id, title, content) VALUES (5, 'What is your soul food?', 'Comment 2');
INSERT INTO article (id, title, content) VALUES (6, 'What are your hobbies?', 'Comment 3');

CREATE TABLE comment (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         body VARCHAR(255),
                         nickname VARCHAR(255),
                         article_id BIGINT,
                         FOREIGN KEY (article_id) REFERENCES article(id)
);

-- comment 더미 데이터
-- 4번 게시글의 댓글들
INSERT INTO comment (id, article_id, nickname, body) VALUES (1, 4, 'Park', 'Good Will Hunting');
INSERT INTO comment (id, article_id, nickname, body) VALUES (2, 4, 'Kim', 'I Am Sam');
INSERT INTO comment (id, article_id, nickname, body) VALUES (3, 4, 'Choi', 'The Shawshank Redemption');

-- 5번 게시글의 댓글들
INSERT INTO comment (id, article_id, nickname, body) VALUES (4, 5, 'Park', '치킨');
INSERT INTO comment (id, article_id, nickname, body) VALUES (5, 5, 'Kim', '샤브샤브');
INSERT INTO comment (id, article_id, nickname, body) VALUES (6, 5, 'Choi', '초밥');

-- 6번 게시글의 댓글들
INSERT INTO comment (id, article_id, nickname, body) VALUES (7, 6, 'Park', '조깅');
INSERT INTO comment (id, article_id, nickname, body) VALUES (8, 6, 'Kim', '유튜브');
INSERT INTO comment (id, article_id, nickname, body) VALUES (9, 6, 'Choi', '독서');