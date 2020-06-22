package com.game.trylink.dao.bean;

import java.util.List;

public class Game {

	private int id;
	private int playerId;
	private short score;
	private long stratTime;
	private long endTime;
	private List<Player> players;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public short getScore() {
		return score;
	}

	public void setScore(short score) {
		this.score = score;
	}

	public long getStratTime() {
		return stratTime;
	}

	public void setStratTime(long stratTime) {
		this.stratTime = stratTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", playerId=" + playerId + ", score=" + score + ", stratTime=" + stratTime
				+ ", endTime=" + endTime + ", players=" + players + "]";
	}

}
