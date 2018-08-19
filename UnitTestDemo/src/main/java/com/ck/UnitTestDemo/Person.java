package com.ck.UnitTestDemo;

public class Person implements Comparable<Person> {
	String adharId;
	String name;
	
	
	public Person(String adharId, String name) {
		super();
		this.adharId = adharId;
		this.name = name;
	}


	public String getAdharId() {
		return adharId;
	}


	public void setAdharId(String adharId) {
		this.adharId = adharId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Person arg0) {
		
		return 0;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adharId == null) ? 0 : adharId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (adharId == null) {
			if (other.adharId != null)
				return false;
		} else if (!adharId.equals(other.adharId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
