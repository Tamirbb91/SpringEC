package mum.edu.ea.extracredit2.controller;

import mum.edu.ea.extracredit2.domain.Artist;
import mum.edu.ea.extracredit2.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping(value = "/artists")
    public String getAll(Model model){
        List<Artist> artists = artistService.getAll();
        model.addAttribute("artists", artists);
        return "artists";
    }

    @GetMapping(value = "/artists/{id}")
    public String get(Model model, @PathVariable long id){
        Artist artist = artistService.get(id);
        model.addAttribute("artist", artist);
        return "artist";
    }

    @PostMapping(value = "/artists")
    public String search(Model model, @RequestParam("search") String search){
        model.addAttribute("artists", artistService.search(search));
        return "artists";
    }
}
