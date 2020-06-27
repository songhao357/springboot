package com.game.trylink.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.trylink.dao.bean.Player;
import com.game.trylink.dao.mapper.PlayerMapper;
import com.game.trylink.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerMapper playerMapper;
	
	@Override
	public void addPlayer(Player player) {
		
		 playerMapper.addPlayer(player.getName(),player.getNickName(),player.getPassword());
	}

	@Override
	public Player selectPlayer(String name, String pwd) {
		
		return playerMapper.selectPlayer(name, pwd);
	}

	@Override
	public Player checkRepeat(String name) {
		return playerMapper.selectPlayerByName(name);
	}

}
