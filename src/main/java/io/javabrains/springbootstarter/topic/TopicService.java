package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> filmTopic = new ArrayList<>(Arrays.asList(
			new Topic("dramat", "quin of drama"),
			new Topic("kryminal", "smierc w wenecji"),
			new Topic("melodramat", "lovesick")));
	
	public Topic getFilmTopic(String id){
		return filmTopic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public List<Topic> getAllTopics(String imie){
		return Arrays.asList(
			new Topic("python", "programming in pthn"),
			new Topic(imie, "programming in java"),
			new Topic("c#", "programming in c#"));
	}

	public void addFilmTopic(Topic topic) {
		// TODO Auto-generated method stub
		filmTopic.add(topic);
	}

	public List<Topic> getAllFilmTopics() {
		// TODO Auto-generated method stub
		return filmTopic;
	}
}