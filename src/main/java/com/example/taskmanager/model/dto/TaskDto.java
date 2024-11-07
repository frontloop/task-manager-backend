package com.example.taskmanager.model.dto;

import com.example.taskmanager.domain.Task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class TaskDto {

	private Long id;

	private String name;

	public TaskDto() {
	}

	public TaskDto(Task task) {
		this.id = task.getId();
		this.name = task.getName();
	}
}
