package mum.edu.ea.extracredit2.service;

import mum.edu.ea.extracredit2.domain.Genre;
import mum.edu.ea.extracredit2.domain.Show;
import mum.edu.ea.extracredit2.repository.ShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowService {
    
    @Autowired
    ShowRepo showRepo;

    public void add(Show Show){
        showRepo.saveAndFlush(Show);
    }

    public void edit(Show Show){
        showRepo.saveAndFlush(Show);
    }

    public void delete(long id){
        showRepo.deleteById(id);
    }

    public Show get(long id){
        Optional<Show> ShowOptional = showRepo.findById(id);
        if(ShowOptional.isPresent()){
            return ShowOptional.get();
        }

        return null;
    }

    public List<Show> getAll(){
        return showRepo.findAll();
    }

    public List<Show> searchByName(String search){
        return showRepo.searchByName(search);
    }

    public List<Show> searchByDirector(String search){
        return showRepo.searchByDirector(search);
    }

    public List<Show> searchByRating(double search){
        return showRepo.searchByRating(search);
    }

    public List<Show> searchByGenre(Genre search){
        return showRepo.searchByGenre(search);
    }
}
