package mum.edu.ea.extracredit2.controller;

import mum.edu.ea.extracredit2.domain.Genre;
import mum.edu.ea.extracredit2.domain.Show;
import mum.edu.ea.extracredit2.service.EpisodeService;
import mum.edu.ea.extracredit2.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowController {

    @Autowired
    ShowService showService;

    @Autowired
    EpisodeService episodeService;

    @GetMapping({"/", "/shows"})
    public String homePage(Model model) {
        List<Show> shows = showService.getAll();
        model.addAttribute("shows", shows);
        return "index";
    }

    @GetMapping("/shows/{showId}")
    public String showDetail(Model model, @PathVariable long showId){
        Show show = showService.get(showId);
        if (show != null){
            model.addAttribute("show", show);
        }
        return "redirect:/shows";
    }

    @PostMapping("/shows/add")
    public String add(Show show) {
        showService.add(show);
        return "redirect:/shows";
    }

    @GetMapping(value = "/shows/{id}")
    public String get(@PathVariable int id, Model model) {
        model.addAttribute("show", showService.get(id));
        return "showDetail";
    }

    @PostMapping(value = "/shows/{id}")
    public String update(Show show, @PathVariable long id) {
        showService.edit(show);
        return "redirect:/shows";
    }

    @PostMapping(value = "/shows/delete")
    public String delete(long showId) {
        showService.delete(showId);
        return "redirect:/shows";
    }

    @GetMapping(value = "/shows/{id}/seasons")
    public String seasons(Model model, @PathVariable long id){
        Show show = showService.get(id);
        model.addAttribute("seasons", show.getSeasons());
        return "seasons";
    }

    @PostMapping(value = "/shows")
    public String search(Model model, @RequestParam("searchType") String searchType, @RequestParam("search") String search){
        List<Show> list = new ArrayList<>();
        switch (searchType){
            case "name" : list = showService.searchByName(search); break;
            case "genre" : list = showService.searchByGenre(Genre.valueOf(search)); break;
            case "rating" : list = showService.searchByRating(Double.parseDouble(search)); break;
            case "artistName" : list = episodeService.searchByArtistName(search); break;
            case "charName" : list = episodeService.searchByCharacterName(search); break;
            case "director" : list = showService.searchByDirector(search); break;
        }
        model.addAttribute("shows", list);

        System.out.println("search " + search);
        System.out.println("searchType " + searchType);
        return "index";
    }
}
