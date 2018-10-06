package com.example.ramadan.notetaking;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        NoteTakingTest.AddNoteText.class,
        NoteTakingTest.AddImageNote.class,
        NoteTakingTest.AddAudioNote.class
})
public class NoteTakingTest {


    public static  class  AddNoteText{

        @Test
        public void testEmptyNote(){

        }


        @Test
        public void testMultilineText(){

        }


    }

    public static  class  AddImageNote{

        @Test
        public void testGifImage(){

        }

        @Test
        public void testVeryLargeImage(){

        }

    }

    public static  class  AddAudioNote{

        @Test
        public void testMp3Audio(){

        }

    }



}
