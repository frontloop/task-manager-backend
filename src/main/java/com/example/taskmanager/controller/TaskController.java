package com.example.taskmanager.controller;

import com.example.taskmanager.model.dto.TaskDto;
import com.example.taskmanager.service.TaskService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${app.endpoint.api}/task")
@CrossOrigin(origins = "${allowed.origins}", allowCredentials = "true")
public class TaskController {

	private static final Logger LOG = LoggerFactory.getLogger(TaskController.class);

	private final TaskService taskService;

	protected TaskController(TaskService service) {
		this.taskService = service;
	}

	@GetMapping("/all")
	public ResponseEntity<List<TaskDto>> getAll() {
		List<TaskDto> dtos = this.taskService.getAll();
		return ResponseEntity.ok(dtos);
	}
}
