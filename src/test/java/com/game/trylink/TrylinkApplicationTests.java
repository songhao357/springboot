package com.game.trylink;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.annotation.security.RunAs;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.game.trylink.dao.bean.Player;
import com.game.trylink.dao.mapper.PlayerMapper;



@SpringBootTest()
class TrylinkApplicationTests {

	@Autowired
	PlayerMapper playerMapper;
//	
//	@Autowired
//	DataSource ds;
	
	@Test
	void testcase() throws ClassNotFoundException, SQLException {
		
//		ds.getConnection();
//		
//		 Connection con=null;	
//			PreparedStatement ps =null;
//			ResultSet rs =null;
//	       
//	              // 1.加载驱动
//				Class.forName("com.mysql.cj.jdbc.Driver");  
//				System.out.println("获取驱动");
//	            //2.获取连接
//				                                        //jbdc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false
////	                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false", "root",
////							"123");
//	                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false", "root",
//								"123");
//
//			// 3.获取预解析对象
//	            ps = con.prepareStatement("select * from player");
//			// 4.执行操作 返回结果
//	      
//	// 查询 返回查询结果集
//	 rs = ps.executeQuery();
//	                               // 非查询操作 无返回结果集
//					// ps.executeUpdate()
//
//			// 5.操作结果
//	// 操作结果集
//					// 遍历
//					while (rs.next()) {
//						// 获取name字段的值
//						String name = rs.getString("name");
//						int id = rs.getInt("id");
//						System.out.println(name + "--" + id);
//
//					}
//
//			// 6.关闭
//	con.close();
//	ps.close();
//	rs.close();
		
		
		
	}
	
	@Test
	void contextLoads() throws SQLException, ClassNotFoundException {
		Player player = new Player("xiaoming1", "小明1", "213");
		Player player1 = new Player("xiaoming2", "小明2", "213");
		Player player2 = new Player("xiaoming3", "小明3", "213");
		
		List<Player> players=new ArrayList<Player>();
		
		players.add(player);
		players.add(player1);
		players.add(player2);

		
		playerMapper.addPlayers(players);
		
		
		
		
	}

}
