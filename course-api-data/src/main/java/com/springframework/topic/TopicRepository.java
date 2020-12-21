package com.springframework.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	//getAllTopics
	// getTopic(Topic topic)
	//updateTopic(Topic topic)
	//deleteTopic(String id)

}
