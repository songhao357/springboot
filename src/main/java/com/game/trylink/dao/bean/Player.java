package com.game.trylink.dao.bean;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;


public class Player {

	private int id;
	private String name;
	private String nickName;
	private String passWord;
	private int score;
	private List<Game> games;
	
	
	
	public Player() {
		super();
	}

	public Player(String name, String nickName, String passWord) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.passWord = passWord;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String password) {
		this.passWord = password;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", nickName=" + nickName + ", password=" + passWord + ", score="
				+ score + ", games=" + games + "]";
	}
	


}
