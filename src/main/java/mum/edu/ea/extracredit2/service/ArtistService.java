package mum.edu.ea.extracredit2.service;

import mum.edu.ea.extracredit2.domain.Artist;
import mum.edu.ea.extracredit2.repository.ArtistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    ArtistRepo artistRepo;

    public void add(Artist artist){
        artistRepo.saveAndFlush(artist);
    }

    public void edit(Artist artist){
        artistRepo.saveAndFlush(artist);
    }

    public void delete(Artist artist){
        artistRepo.delete(artist);
    }

    public Artist get(long id){
        Optional<Artist> artistOptional = artistRepo.findById(id);
        if(artistOptional.isPresent()){
            return artistOptional.get();
        }

        return null;
    }

    public List<Artist> getAll(){
        return artistRepo.findAll();
    }

    public List<Artist> search(String search){
        return artistRepo.search(search);
    }
}
