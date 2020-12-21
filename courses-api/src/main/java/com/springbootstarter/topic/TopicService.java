package com.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private	List<Topic> topics = new ArrayList<Topic>( Arrays.asList(new Topic("1", "chetan", "P1"),
			 new Topic("2", "surabhi", "AP"),
			 new Topic("3", "Pooja", "P2")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++){
			Topic t = topics.get(i);
				if(t.getId().equals(topic.getId())) {
					topics.set(i, topic);
				}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}
}
