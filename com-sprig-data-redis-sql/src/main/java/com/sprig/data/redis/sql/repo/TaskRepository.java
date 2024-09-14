package com.sprig.data.redis.sql.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sprig.data.redis.sql.entity.Task;

@repository
public interface TaskRepository extends MongoRepository<Task, String> {
	// Custom query methods can be defined here
	Task findByTitle(String title);
}
