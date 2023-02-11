package airport.backend.repository;

import airport.backend.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AiportRepository extends JpaRepository <Airport, Integer >{
}
