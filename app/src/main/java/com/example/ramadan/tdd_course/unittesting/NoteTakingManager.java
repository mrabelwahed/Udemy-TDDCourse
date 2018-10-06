package com.example.ramadan.tdd_course.unittesting;

import java.util.ArrayList;
import java.util.List;

public class NoteTakingManager {

    private NoteTakingService service;

    public NoteTakingManager(NoteTakingService service){

        this.service = service;

    }

    public List<String> getAllBusinessNotes() {

        List<String> filter = new ArrayList<>();
        List<String> allNotes = service.getAllBusinessNotes();

        for (String note:allNotes)
            if (note.contains("Android"))
                filter.add(note);

    return filter;

    }
}
