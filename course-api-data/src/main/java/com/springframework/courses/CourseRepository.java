package com.springframework.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	//getAllTopics
	// getTopic(Topic topic)
	//updateTopic(Topic topic)
	//deleteTopic(String id)
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String description);
	public List<Course> findByTopicId(String topicId);

}
