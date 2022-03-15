package com.rls.jdbc.advanced;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.rls.jdbc.utils.JDBCUtils;

/**
 * 开源连接池Druid的使用
 * @author jt
 *
 */
public class DruidDemo1 {

	@Test
	/**
	 * Druid的使用:
	 * * 配置方式设置参数
	 * Druid配置方式可以使用属性文件配置的。
	 * * 文件名称没有规定但是属性文件中的key要一定的。
	 */
	public void demo2(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			// 使用连接池：
			// 从属性文件中获取：
			Properties properties = new Properties();
			properties.load(new FileInputStream("/Users/ranlingsheng/Desktop/GitHub/java-learn/1电商基础架构/com.rls.learn/src/db.properties"));
			DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
			// 获得连接：
//			conn = JDBCUtils.getConnection();
			conn = dataSource.getConnection();
			// 编写SQL:
			String sql = "select * from user ";
			// 预编译SQL:
			pstmt = conn.prepareStatement(sql);
			// 设置参数:
			// 执行SQL:
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs, pstmt, conn);
		}
	}
	
	@Test
	/**
	 * Druid的使用:
	 * * 手动设置参数的方式
	 */
	public void demo1(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			// 使用连接池：
			DruidDataSource dataSource = new DruidDataSource();
			// 手动设置数据库连接的参数:
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/test1?useSSL=false&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT");
			dataSource.setUsername("root");
			dataSource.setPassword("root123456");
			// 获得连接：
//			conn = JDBCUtils.getConnection();
			conn = dataSource.getConnection();
			// 编写SQL:
			String sql = "select * from user";
			// 预编译SQL:
			pstmt = conn.prepareStatement(sql);
			// 设置参数:
			// 执行SQL:
			rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtils.release(rs, pstmt, conn);
		}
	}
}
