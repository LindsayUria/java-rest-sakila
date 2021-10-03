package bo.edu.ucb.ingsoft.tasks;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TaskRestRepositort extends PagingAndSortingRepository<Task, Integer> {

    // List<Task> findAll();
    List<Task> findByTitle(@Param("title") String title);
}
