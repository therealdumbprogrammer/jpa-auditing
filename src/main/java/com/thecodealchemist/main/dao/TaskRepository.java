package com.thecodealchemist.main.dao;

import com.thecodealchemist.main.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
