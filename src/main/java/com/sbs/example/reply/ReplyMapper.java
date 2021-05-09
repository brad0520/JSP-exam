package com.sbs.example.reply;

import java.util.List;

public interface ReplyMapper {

	public List<Reply> getRepliesByArticleId(int articleId);
}
