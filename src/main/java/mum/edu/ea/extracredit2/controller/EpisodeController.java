package mum.edu.ea.extracredit2.controller;

import mum.edu.ea.extracredit2.domain.Comment;
import mum.edu.ea.extracredit2.domain.Episode;
import mum.edu.ea.extracredit2.domain.Season;
import mum.edu.ea.extracredit2.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EpisodeController {

    @Autowired
    EpisodeService episodeService;

    @GetMapping(value = "/episodes")
    public String getAll(Model model){
        List<Episode> episodes = episodeService.getAll();
        model.addAttribute("episodes", episodes);
        return "episodes";
    }

    @GetMapping(value = "/episodes/{id}/comments")
    public String comments(Model model, @PathVariable long id){
        Episode episode = episodeService.get(id);
        model.addAttribute("comments", episode.getComments());
        return "comments";
    }

    @GetMapping(value = "/episodes/{id}/cast")
    public String cast(Model model, @PathVariable long id){
        Episode episode = episodeService.get(id);
        model.addAttribute("cast", episode.getCast());
        return "cast";
    }
}
