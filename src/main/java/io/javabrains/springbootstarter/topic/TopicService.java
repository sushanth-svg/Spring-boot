package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class TopicService {
	
	private List<Topics> topics =  Arrays.asList(new Topics("java","Core java","Core java description"),
			new Topics("spring","Spring framework","Spring framework description"),
			new Topics("javascript","javascript","javascript description"));
	
	
	public List<Topics> getAllTopics() {
		System.out.println(topics);
		return topics;
		
	}
	
	
	public Topics getTopic(String id) {
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

}
