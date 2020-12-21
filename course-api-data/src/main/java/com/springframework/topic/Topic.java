package com.springframework.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Required;

@Entity
public class Topic {
	@Id
	@NotEmpty(message = "id can not be empty")
private String id;
	@NotEmpty(message = "name can not be empty")
private String name;
private String description;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Topic() {
	// TODO Auto-generated constructor stub
}
public Topic(String id, String name, String description) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
}

}
