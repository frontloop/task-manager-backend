package com.example.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanager.domain.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findAllById(Long id);
	List<Task> findAllByName(String name);

}
