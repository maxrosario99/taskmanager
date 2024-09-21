package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {
    private Map<Long, Task> tasks = new HashMap<>();
    private long nextId = 1;

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task getTaskById(Long id) {
        return tasks.get(id);
    }

    public Task createTask(Task task) {
        task.setId(nextId++);
        if (task.getCreateDate() == null) {
            task.setCreateDate(new Date());
        }
        tasks.put(task.getId(), task);
        return task;
    }

    public Task updateTask(Long id, Task updatedTask) {
        if (tasks.containsKey(id)) {
            Task task = tasks.get(id);
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            return task;
        }
        return null;
    }
}