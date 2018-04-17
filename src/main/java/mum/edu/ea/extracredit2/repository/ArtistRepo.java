package mum.edu.ea.extracredit2.repository;

import mum.edu.ea.extracredit2.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, Long> {
    @Query(value = "select a from Artist a where a.bio like CONCAT('%',:search,'%') or a.name like CONCAT('%',:search,'%')")
    public List<Artist> search(@Param("search") String search);
}
