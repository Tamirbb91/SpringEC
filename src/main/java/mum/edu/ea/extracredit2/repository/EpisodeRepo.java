package mum.edu.ea.extracredit2.repository;

import mum.edu.ea.extracredit2.domain.Episode;
import mum.edu.ea.extracredit2.domain.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpisodeRepo extends JpaRepository<Episode, Long> {

    @Query(value = "select distinct s.season.related_show from Episode s join s.cast map where (VALUE(map).name like CONCAT('%',:search,'%'))")
    public List<Show> searchByArtistName(@Param("search") String search);

    @Query(value = "select distinct s.season.related_show from Episode s join s.cast map where (KEY(map) like CONCAT('%',:search,'%'))")
    public List<Show> searchByCharacterName(@Param("search") String search);
}
