package com.dzd.studyspringboot.service;



import com.dzd.studyspringboot.model.ArticleVO;

import java.util.List;

public interface ArticleRestService {

     ArticleVO saveArticle(ArticleVO article);

     void deleteArticle(Long id);

     void updateArticle(ArticleVO article);

     ArticleVO getArticle(Long id);

     List<ArticleVO> getAll();
}