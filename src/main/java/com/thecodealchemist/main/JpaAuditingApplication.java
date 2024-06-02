package com.thecodealchemist.main;

import com.thecodealchemist.main.dao.ReminderRepository;
import com.thecodealchemist.main.entity.Reminder;
import com.thecodealchemist.main.entity.Task;
import com.thecodealchemist.main.dao.TaskRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaAuditingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAuditingApplication.class, args);
	}

	//@Bean
	public ApplicationRunner applicationRunner(TaskRepository taskRepository) {
		return args -> {
			System.out.println("====== Insert =======");
			Task t = new Task();
			t.setTitle("ToDO");

			taskRepository.save(t);

			System.out.println("====== Update =======");

			t.setTitle("ToDo-1");
			Thread.sleep(2 * 1000);
			taskRepository.save(t);
		};
	}

	@Bean
	public ApplicationRunner applicationRunner(ReminderRepository reminderRepository) {
		return args -> {
			System.out.println("====== Insert =======");
			Reminder r = new Reminder();
			r.setTitle("Do something");
			reminderRepository.save(r);

			System.out.println("====== Update =======");
			r.setTitle("Do something else");
			Thread.sleep(2 * 1000);
			reminderRepository.save(r);
		};
	}

}
