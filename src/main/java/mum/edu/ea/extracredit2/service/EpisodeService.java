package mum.edu.ea.extracredit2.service;

import mum.edu.ea.extracredit2.domain.Episode;
import mum.edu.ea.extracredit2.domain.Show;
import mum.edu.ea.extracredit2.repository.EpisodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodeService {

    @Autowired
    EpisodeRepo episodeRepo;

    public void add(Episode Episode){
        episodeRepo.saveAndFlush(Episode);
    }

    public void edit(Episode Episode){
        episodeRepo.saveAndFlush(Episode);
    }

    public void delete(long id){
        episodeRepo.deleteById(id);
    }

    public Episode get(long id){
        Optional<Episode> EpisodeOptional = episodeRepo.findById(id);
        if(EpisodeOptional.isPresent()){
            return EpisodeOptional.get();
        }

        return null;
    }

    public List<Episode> getAll(){
        return episodeRepo.findAll();
    }


    public List<Show> searchByArtistName(String search){
        return episodeRepo.searchByArtistName(search);
    }

    public List<Show> searchByCharacterName(String search){
        return episodeRepo.searchByCharacterName(search);
    }

}
