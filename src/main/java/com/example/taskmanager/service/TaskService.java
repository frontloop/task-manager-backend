package com.example.taskmanager.service;

import org.springframework.stereotype.Service;

import com.example.taskmanager.repository.TaskRepository;
import com.example.taskmanager.domain.Task;
import com.example.taskmanager.model.dto.TaskDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public List<TaskDto> getAll() {
		final List<Task> tasks = taskRepository.findAll();
		return tasks.stream().map(TaskDto::new).collect(Collectors.toList());
	}

}