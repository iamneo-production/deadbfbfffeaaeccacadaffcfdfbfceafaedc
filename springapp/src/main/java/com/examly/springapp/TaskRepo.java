package com.examly.springapp.repo;
import com.examly.springapp.model.Task;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import java.util.*;
public interface TaskRepo extends CrudRepository<Task, Integer>{
    //@Query("from task")
   // List <Task> alltasks(); 
}
