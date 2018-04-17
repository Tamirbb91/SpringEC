package mum.edu.ea.extracredit2.service;

import mum.edu.ea.extracredit2.domain.Season;
import mum.edu.ea.extracredit2.repository.SeasonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SeasonService {

    @Autowired
    SeasonRepo seasonRepo;

    public void add(Season Season){
        seasonRepo.saveAndFlush(Season);
    }

    public void edit(Season Season){
        seasonRepo.saveAndFlush(Season);
    }

    public void delete(long id){
        seasonRepo.deleteById(id);
    }

    public Season get(long id){
        Optional<Season> SeasonOptional = seasonRepo.findById(id);
        if(SeasonOptional.isPresent()){
            return SeasonOptional.get();
        }

        return null;
    }

    public List<Season> getAll(){
        return seasonRepo.findAll();
    }
}
