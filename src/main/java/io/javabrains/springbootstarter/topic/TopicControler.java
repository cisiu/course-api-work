package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicControler {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/filmTopic/{id}")
	public Topic getFilmTopics(@PathVariable String id){
		return topicService.getFilmTopic(id);
	}
	
	@RequestMapping("/filmTopic")
	public List<Topic> getAllFilmTopics(){
		return topicService.getAllFilmTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/filmTopic")
	public void addFilmTopic(@RequestBody Topic topic) {
		topicService.addFilmTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/filmTopic/{id}")
	public void updateFilmTopic(@RequestBody Topic topic, @PathVariable("id") String id) {
		topicService.updateFilmTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/filmTopic/{id}")
	public void deleteFilmTopic(@PathVariable("id") String id) {
		topicService.deleteFilmTopic(id);
	}
	
	
	//http://localhost:8080/topics?name=kamil
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(@RequestParam(value ="name", defaultValue = "defaulty") String imie) {
		return Arrays.asList(
				new Topic("python", "programming in pthn"),
				new Topic(imie, "programming in pthn"),
				new Topic("c#", "programming in c#"));
	}
	
	//http://localhost:8080/topics2/kamil
	@RequestMapping("/topics2/{name}")
	public List<Topic> getAllTopics2(@PathVariable("name") String imie) {
		return Arrays.asList(
				new Topic("python", "programming in pthn"),
				new Topic(imie, "programming in pthn"),
				new Topic("c#", "programming in c#"));
	}

	
}
