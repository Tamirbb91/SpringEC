package mum.edu.ea.extracredit2.controller;

import mum.edu.ea.extracredit2.domain.Comment;
import mum.edu.ea.extracredit2.domain.Episode;
import mum.edu.ea.extracredit2.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping(value = "/comments")
    public String getAll(Model model){
        List<Comment> comments = commentService.getAll();
        model.addAttribute("comments", comments);
        return "comments";
    }
}
