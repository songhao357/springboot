package com.game.trylink.controller;

import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import com.game.trylink.dao.bean.Player;
import com.game.trylink.service.PlayerService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/player")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PlayerController {
	
	@Autowired
	public PlayerService playerService;
	
	@RequestMapping(method = RequestMethod.POST ,path = "/registerPlayer" )
	public String addPlayer(@RequestBody Player player)  {
		System.out.println(player);

		if (StringUtils.isEmpty(player.getName())||StringUtils.isEmpty(player.getPassword())||StringUtils.isEmpty(player.getNickName())){
			return "400";
		}
		try{
			playerService.addPlayer(player);
		}catch(Exception e){
			Player player1 = playerService.checkRepeat(player.getName());
			if (player.getName().equals(player1.getName())){
				return "nameRepeat";
			}

			return "500";
		}
		return "success";
	}


	@RequestMapping(method = RequestMethod.POST , path = "/login")
	public Object login(@RequestBody Player player) {
		String name =player.getName();
		String pwd = player.getPassword();
		System.out.println(player);
		System.out.println(name+pwd);
		if(StringUtils.isEmpty(name)||StringUtils.isEmpty(pwd)) {
			return "400";
			
		}
		
	
		
		return playerService.selectPlayer(name, pwd);
	}
	
	
}
