package com.example.ramadan.notetaking;

import com.example.ramadan.tdd_course.unittesting.NoteTakingService;

import java.util.Arrays;
import java.util.List;

public class NoteTakingStubService implements NoteTakingService {

    @Override
    public List<String> getAllBusinessNotes() {
        return Arrays.asList("Android market is huge","Android is awesome","I  am mahmoud");
    }
}
