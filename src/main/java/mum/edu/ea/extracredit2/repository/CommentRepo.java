package mum.edu.ea.extracredit2.repository;

import mum.edu.ea.extracredit2.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository <Comment, Long> {
}
