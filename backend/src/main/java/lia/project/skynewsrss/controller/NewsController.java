package lia.project.skynewsrss.controller;

import lia.project.skynewsrss.model.NewsItem;
import lia.project.skynewsrss.service.RssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private RssService rssService;

    @GetMapping
    public List<NewsItem> getNews() {
        return rssService.getHeadlines();
    }
}
