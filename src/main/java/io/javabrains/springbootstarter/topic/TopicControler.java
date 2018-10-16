package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicControler {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("python", "programming in pthn"),
				new Topic("java", "programming in pthn"),
				new Topic("c#", "programming in c#"));
	}

}
