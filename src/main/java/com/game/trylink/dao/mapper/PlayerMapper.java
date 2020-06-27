package com.game.trylink.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.game.trylink.dao.bean.Player;



@Mapper
public interface PlayerMapper {

	public void addPlayer(@Param("name") String name,@Param("nickName")String nickName,@Param("passWord")String passWord);
	
	public void addPlayers(List<Player> list);

	public Player selectPlayerByName(@Param("name") String name);
	
	public Player selectPlayer(@Param("name")String name,@Param("passWord") String password); 
	
}
