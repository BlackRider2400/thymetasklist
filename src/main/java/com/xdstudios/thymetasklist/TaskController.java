package com.xdstudios.thymetasklist;


import jakarta.validation.Valid;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Log4j2
@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;


    @GetMapping("/index")
    public String showTasks(Model model){
        String[] tasks = {"Test1", "Test2", "Test3"};
        log.info("Request sent");
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @GetMapping("/")
    public String redirect(Model model){
        return "redirect:/index";
    }

//    @PostMapping("/addTask")
//    public String addTask(@Valid Task task, BindingResult result, Model model){
//        if(result.hasErrors()){
//            return "redirect:/index";
//        }
//
//        taskRepository.save(task);
//        return "redirect:/index";
//    }

}
