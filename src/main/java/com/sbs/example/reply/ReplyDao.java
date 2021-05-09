package com.sbs.example.reply;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ReplyDao {
	SqlSessionFactory sqlSessionFactory;

	public ReplyDao() throws IOException {
		// 경로
		String resource = "com/sbs/example/config/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		System.out.println(sqlSessionFactory);
	}
	
	public List <Reply> getRepliesByArticleId(int articleId) {
		List <Reply> replies = null;
		SqlSession session = sqlSessionFactory.openSession();
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		replies = mapper.getRepliesByArticleId(articleId);
		
		return replies;
	}
}
