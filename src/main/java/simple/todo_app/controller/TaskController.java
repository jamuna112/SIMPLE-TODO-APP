package simple.todo_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simple.todo_app.model.Task;
import simple.todo_app.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/create")
    public Task addTask(@RequestBody Task task){
        return taskService.addTask(task);
    }
    @GetMapping("/show-all")
    public List<Task> showAllTasks(){
        return taskService.showAllTask();
    }
    @GetMapping("/{taskId}")
    public Task showATask(@PathVariable int taskId){
        return taskService.getATask(taskId);
    }
    @PutMapping("/update")
    public Task updateTask(@RequestBody Task task){
        return taskService.updateTask(task);
    }
    @DeleteMapping("/{taskId}")
    public void deleteTask(@PathVariable int taskId){
        this.taskService.deleteTask(taskId);
    }

}
