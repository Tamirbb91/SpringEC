package mum.edu.ea.extracredit2.service;

import mum.edu.ea.extracredit2.domain.Comment;
import mum.edu.ea.extracredit2.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    CommentRepo commentRepo;

    public void add(Comment comment){
        commentRepo.saveAndFlush(comment);
    }

    public void edit(Comment comment){
        commentRepo.saveAndFlush(comment);
    }

    public void delete(Comment comment){
        commentRepo.delete(comment);
    }

    public Comment get(long id){
        Optional<Comment> commentOptional = commentRepo.findById(id);
        if(commentOptional.isPresent()){
            return commentOptional.get();
        }

        return null;
    }

    public List<Comment> getAll(){
        return commentRepo.findAll();
    }
}
