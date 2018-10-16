package io.javabrains.springbootstarter.topic;

public class Topic {
	private String Id;
	private String Name;
	
	
	public Topic() {
		super();
	}
	public Topic(String id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
