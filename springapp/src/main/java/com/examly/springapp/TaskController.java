package com.examly.springapp.controller;
//import java.util.*;
import com.examly.springapp.repo.TaskRepo;
import com.examly.springapp.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TaskController {
  @Autowired
  TaskRepo repo;
    @RequestMapping("/")
    public String home(){
        System.out.println("home Page launched!");
        return "home.jsp";
    }
    @RequestMapping("/saveTask")
    public String saveTask(Task task){
        repo.save(task);
         System.out.println("Task Saved!");
        return "home.jsp";
        
    }
    @RequestMapping("/getTask")
    public ModelAndView getTask(@RequestParam int id){
      ModelAndView mv = new ModelAndView("showTask.jsp");
      Task task = repo.findById(id).orElse(new Task());
      mv.addObject(task);
      return mv;
    }

    @RequestMapping("/deleteTask")
    public String deleteTask(@RequestParam int id){
      Task task = repo.findById(id).orElse(new Task());
      repo.delete(task);
      System.out.println("Task Deleted!");
      return "home.jsp";
    }
    @RequestMapping("/alltasks")
    @ResponseBody
    public String alltasks(){
     return repo.findAll().toString();
    }
    @RequestMapping("changeStatus")
    public String changeStatus(@RequestParam int id){
      Task task = repo.findById(id).orElse(new Task());
      String oldStatus = task.getTaskStatus();
      if(oldStatus.contains("Progress")){
        task.setTaskStatus("Completed");
      }
      else {
        task.setTaskStatus("In Progress");
      }
      repo.save(task);
      System.out.println("Task Status Changed!");
      return "home.jsp";
    }
    
  }
