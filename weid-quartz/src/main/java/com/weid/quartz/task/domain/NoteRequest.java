package com.weid.quartz.task.domain;

public class NoteRequest {
    private int keyword_id;
    private String keyword;
    private int all_page;

    public NoteRequest(int keyword_id, String keyword, int all_page) {
        this.keyword_id = keyword_id;
        this.keyword = keyword;
        this.all_page = all_page;
    }

    public int getKeyword_id() {
        return keyword_id;
    }

    public void setKeyword_id(int keyword_id) {
        this.keyword_id = keyword_id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getAll_page() {
        return all_page;
    }

    public void setAll_page(int all_page) {
        this.all_page = all_page;
    }
}

