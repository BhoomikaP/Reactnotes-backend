package in.bhoomika.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bhoomika.springboot.entity.Notes;

@Repository
public interface NotesRepository extends JpaRepository<Notes, 	Long> {

}
