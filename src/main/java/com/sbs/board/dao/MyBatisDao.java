package com.sbs.board.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.taglibs.standard.resources.Resources;


public class MyBatisDao {

	SqlSessionFactory sqlSessionFactory;

	public MyBatisDao() throws IOException {
			
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		System.out.println(sqlSessionFactory);
	}

	public ArrayList<Addr> getAddresses() {
		SqlSession session = sqlSessionFactory.openSession();
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		ArrayList<Addr> addresses = mapper.getAddresses();			

		System.out.println(addresses.get(0).getName());
		
		return addresses;
	}

}
