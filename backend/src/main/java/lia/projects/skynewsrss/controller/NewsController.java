package lia.projects.skynewsrss.controller;

import lia.projects.skynewsrss.model.NewsItem;
import lia.projects.skynewsrss.service.RssService;
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
        return rssService.getHeadlines(); // Make sure this returns a List<NewsItem>
    }
}
