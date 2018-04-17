package mum.edu.ea.extracredit2.repository;

import mum.edu.ea.extracredit2.domain.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepo extends JpaRepository <Season, Long> {
}
