package com.test;

public class Warrior {
	
	private int id;
	private String name;
	private String clan;
	private String rank;
	
	public Warrior() {
		
	}
	
	public Warrior(int id, String name, String clan, String rank) {
		this.id = id;
		this.name = name;
		this.clan = clan;
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Warrior [id=" + id + ", name=" + name + ", clan=" + clan + ", rank=" + rank + "]";
	}

}
