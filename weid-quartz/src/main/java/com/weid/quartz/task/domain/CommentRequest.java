package com.weid.quartz.task.domain;

import java.util.Arrays;
import java.util.List;

public class CommentRequest {

    private List<String> noteIdList;

    public CommentRequest(String noteIds) {
        this.noteIdList = Arrays.asList(noteIds.split(","));
    }

    public List<String> getNoteIdList() {
        return noteIdList;
    }

    public void setNoteIdList(List<String> noteIdList) {
        this.noteIdList = noteIdList;
    }
}

