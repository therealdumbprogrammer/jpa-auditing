package com.thecodealchemist.main.dao;

import com.thecodealchemist.main.entity.Reminder;
import com.thecodealchemist.main.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {
}
