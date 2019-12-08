package com.dzd.studyspringboot.controller;



import com.dzd.studyspringboot.model.AjaxResponse;
import com.dzd.studyspringboot.model.ArticleVO;
import com.dzd.studyspringboot.service.ArticleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    //@Resource
    private ArticleRestService articleRestServiceImpl;

    //@PostMapping("/articleVO")
    @RequestMapping(value = "/article", method = POST, produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody ArticleVO articleVO) {

        //log.info("saveArticle：{}",articleVO);
        articleRestServiceImpl.saveArticle(articleVO);
        return  AjaxResponse.success(articleVO);
    }

    @DeleteMapping("/article/{id}")
    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    public AjaxResponse deleteArticle(@PathVariable Long id) {

        //articleRestService.deleteArticle(id);

        articleRestServiceImpl.deleteArticle(id);

        return AjaxResponse.success(id);
    }

    @PutMapping("/article/{id}")
    //@RequestMapping(value = "/articleVO/{id}", method = PUT, produces = "application/json")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVO articleVO) {
        articleVO.setId(id);

        //articleRestService.updateArticle(articleVO);

        articleRestServiceImpl.updateArticle(articleVO);

        return AjaxResponse.success(articleVO);
    }


    @GetMapping("/article/{id}")
    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    public AjaxResponse getArticle(@PathVariable Long id) {

        return AjaxResponse.success(articleRestServiceImpl.getArticle(id));
    }

    @GetMapping("/article")
    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    public @ResponseBody AjaxResponse getAll() {

        return AjaxResponse.success(articleRestServiceImpl.getAll());
    }
}