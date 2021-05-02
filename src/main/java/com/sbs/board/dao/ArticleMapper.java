package com.sbs.board.dao;
import java.util.ArrayList;
import java.util.Map;

import com.sbs.board.Article;

// 메서드 명세서
@Mapper
public interface ArticleMapper {
	
	// mybatis야 내가  getAddresses 라는 이름으로 메서드를 부르면 data가져와줘
	// 1. sql
	// 2. parameter
	// 3. return type

	// 어노테이션 붙이기
	ArrayList<Article> getAddresses(); 
	void insertAddress(Article article);
	void deleteAddress(int id);
	void updateAddress(Article article);
	ArrayList<Article> getSearchedList(Map param);
}

