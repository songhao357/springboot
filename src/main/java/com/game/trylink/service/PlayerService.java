package com.game.trylink.service;

import com.game.trylink.dao.bean.Player;

public interface PlayerService {

	public void addPlayer(Player player);
	
	public Player selectPlayer(String name,String pwd);

	public Player checkRepeat(String name);
}
