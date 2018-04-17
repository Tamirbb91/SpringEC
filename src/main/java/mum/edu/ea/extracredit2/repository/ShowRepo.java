package mum.edu.ea.extracredit2.repository;

import mum.edu.ea.extracredit2.domain.Genre;
import mum.edu.ea.extracredit2.domain.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepo extends JpaRepository <Show, Long> {
    @Query(value = "select s from Show s where s.name like CONCAT('%',:search,'%')")
    public List<Show> searchByName(@Param("search") String search);

    @Query(value = "select s from Show s where s.director like CONCAT('%',:search,'%')")
    public List<Show> searchByDirector(@Param("search") String search);

    @Query(value = "select s from Show s where s.rating = :search")
    public List<Show> searchByRating(@Param("search") double search);

    @Query(value = "select s from Show s where s.genre = :search")
    public List<Show> searchByGenre(@Param("search") Genre search);
}
