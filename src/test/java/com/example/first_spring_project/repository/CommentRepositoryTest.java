package com.example.first_spring_project.repository;

import com.example.first_spring_project.entity.Article;
import com.example.first_spring_project.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // JPA와 연동한 테스트!
class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    @DisplayName("특정 게시글 모든 댓글 조회")
    void findByArticleId() {
        /* Case 1: 4번 게시글의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            Long articleId = 4L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기
            Article article = new Article(4L, "What is the movie of your life?", "Comment 1");

            Comment a = new Comment(1L, article, "Park", "Good Will Hunting");
            Comment b = new Comment(2L, article, "Kim", "I Am Sam");
            Comment c = new Comment(3L, article, "Choi", "The Shawshank Redemption");
            List<Comment> expected = Arrays.asList(a, b, c);

            // 검증
            assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력!");
        }

        /* Case 2: 1번 게시글의 모든 댓글 조회 */

        {
            // 입력 데이터 준비
            Long articleId = 1L;

            // 실제 수행
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            // 예상하기

            Article article = new Article(1L, "aaaa", "1111");
            List<Comment> expected = Arrays.asList();

            // 검증
            assertEquals(expected.toString(), comments.toString(), "1번 글은 댓글이 없음");
        }

        /* Case 3: 9번 게시글의 모든 댓글 조회 */
        {}

        /* Case 4: 9999번 게시글의 모든 댓글 조회 */
        {}

        /* Case 4: -1번 게시글의 모든 댓글 조회 */
        {}
    }

    @Test
    @DisplayName("특정 닉네임의 모든 댓글 조회")
    void findByNickname() {
        /* Case 1: "Park"의 모든 댓글 조회 */
        {
            // 입력 데이터 준비
            String nickname = "Park";

            // 실제 수행
            List<Comment> comments = commentRepository.findByNickname(nickname);

            // 예상하기
            Comment a = new Comment(1L, new Article(4L, "What is the movie of your life?", "Comment 1"), nickname, "Good Will Hunting");
            Comment b = new Comment(4L, new Article(5L, "What is your soul food?", "Comment 2"), nickname, "치킨");
            Comment c = new Comment(7L, new Article(6L, "What are your hobbies?", "Comment 3"), nickname, "조깅");

            List<Comment> expected = Arrays.asList(a, b, c);

            // 검증
            assertEquals(expected.toString(), comments.toString(), "Park의 모든 댓글을 출력!");
        }

        /* Case 2: "Kim"의 모든 댓글 조회 */
        {}

        /* Case 3: null 의 모든 댓글 조회 */
        {}

        /* Case 4: ""의 모든 댓글 조회 */
        {}

        /* Case 5: "i"의 모든 댓글 조회 */
        {}
    }
}