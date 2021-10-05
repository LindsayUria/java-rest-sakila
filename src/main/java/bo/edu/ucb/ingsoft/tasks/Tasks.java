package bo.edu.ucb.ingsoft.tasks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Tasks {

    List<Task> List = new ArrayList<>();

    @GetMapping(path="/sakilaOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Task> listAll() {
        return List;
    }

    @PostMapping(path="/sakila", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Task listAll(@RequestBody Task task) {
        List.add(task);
        return task;
    }

    @DeleteMapping(path="/sakila/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Task deleteOne(@RequestBody Task task) {
        List.remove(task.getId());
        return task;
    }

    @PutMapping(path="/sakila/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Task PutOne(@RequestBody Task task) {
        List.set(task.getId(),task);
        return task;
    }
    
}