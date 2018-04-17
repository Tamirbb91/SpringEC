package mum.edu.ea.extracredit2.controller;

import mum.edu.ea.extracredit2.domain.Comment;
import mum.edu.ea.extracredit2.domain.Season;
import mum.edu.ea.extracredit2.domain.Show;
import mum.edu.ea.extracredit2.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SeasonController {

    @Autowired
    SeasonService seasonService;

    @GetMapping(value = "/seasons")
    public String getAll(Model model){
        List<Season> seasons = seasonService.getAll();
        model.addAttribute("seasons", seasons);
        return "seasons";
    }

    @GetMapping(value = "/seasons/{id}/episodes")
    public String episodes(Model model, @PathVariable long id){
        Season season = seasonService.get(id);
        model.addAttribute("episodes", season.getEpisodes());
        return "episodes";
    }
}
