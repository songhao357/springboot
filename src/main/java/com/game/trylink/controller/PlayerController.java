package com.game.trylink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.trylink.dao.bean.Player;
import com.game.trylink.service.PlayerService;

@RestController
@RequestMapping(path = "/player")
public class PlayerController {
	
	@Autowired
	public PlayerService playerService;
	
	@RequestMapping(method = RequestMethod.POST ,path = "/registerPlayer" )
	public String addPlayer(@RequestParam(required= true,name = "name") String name,@RequestParam(required = true,name = "nickName") String nickName,@RequestParam(required = true,name = "passWord") String passWord) {
		
		Player player=new Player();
		player.setName(name);
		player.setPassword(passWord);
		player.setNickName(nickName);
		playerService.addPlayer(player);
		return "success";
	}
	
	
}
