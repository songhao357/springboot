package com.game.trylink.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.game.trylink.dao.bean.Player;


		
@Repository
public interface PlayerMapper {

	public void addPlayer(@Param("name") String name,@Param("nickName")String nickName,@Param("passWord")String passWord);
	
	public void addPlayers(List<Player> list);
	
}
