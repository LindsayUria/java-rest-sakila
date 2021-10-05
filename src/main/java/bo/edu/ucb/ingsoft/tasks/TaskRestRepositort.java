package bo.edu.ucb.ingsoft.tasks;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel = "sakila", path = "sakila")
public interface TaskRestRepositort extends PagingAndSortingRepository<Task, Integer> {

    // List<Task> findAll();
    List<Task> findByName(@Param("name") String name);
}
