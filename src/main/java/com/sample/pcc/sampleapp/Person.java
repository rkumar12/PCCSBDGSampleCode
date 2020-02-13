package com.sample.pcc.sampleapp;

import java.io.Serializable;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.ClientRegion;


@ClientRegion(value = "People", shortcut = ClientRegionShortcut.PROXY)
public class Person implements Serializable {

	@Id
	private  String name;

	private  int age;

	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	@Override
	public String toString() {
		return String.format("%s is %d years old", getName(), getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
