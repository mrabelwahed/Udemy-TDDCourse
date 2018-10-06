package com.example.ramadan.notetaking;

import com.example.ramadan.tdd_course.unittesting.NoteTakingManager;
import com.example.ramadan.tdd_course.unittesting.NoteTakingService;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessNotesTest {

    @Test
    public void testRetrieveBusinessNotes(){
        NoteTakingService service = mock(NoteTakingService.class);

        List<String> data = Arrays.asList("Android market is huge","Android is awesome","I  am mahmoud");

        when(service.getAllBusinessNotes()).thenReturn(data);

        NoteTakingManager manager = new NoteTakingManager(service);
        assertEquals(2,manager.getAllBusinessNotes().size());
    }
}
