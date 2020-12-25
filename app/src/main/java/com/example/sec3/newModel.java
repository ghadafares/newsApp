package com.example.sec3;

import java.util.ArrayList;

public class newModel {

    private ArrayList<Article> articles;

    public ArrayList<Article> getArticles() {
        return articles;
    }

}
    class Article {
        private String title;
        private String url;
        private String urlToImage;

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }
    }
