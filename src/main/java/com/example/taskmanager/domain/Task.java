package com.example.taskmanager.domain;

import com.example.taskmanager.model.dto.TaskDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TASK")
@Builder
@AllArgsConstructor
@Getter
@Setter
public class Task extends DBOEntity {

	@Id
	@SequenceGenerator(name = "EMBE_KONTAKT_ID_GENERATOR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMBE_KONTAKT_ID_GENERATOR")
	private Long id;

	@Column
	private String name;

	public Task() {
	}

	public Task(TaskDto task) {
		this.name = task.getName();
	}
}
