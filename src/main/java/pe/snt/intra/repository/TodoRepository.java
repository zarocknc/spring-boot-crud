package pe.snt.intra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.snt.intra.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
