package kyu7;

// https://www.codewars.com/kata/6089c7992df556001253ba7d/train/java

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Kata10 {
    Song song = new Song("Mount Moose", "The Snazzy Moose");
    @Test
    public void TestForTitleAndArtist() {
        assertEquals("Wrong title!", "Mount Moose", song.getTitle());
        assertEquals("Wrong artist!", "The Snazzy Moose", song.getArtist());
    }

    @Test
    public void TestForDataEncapsulation() {
        assertEquals("Make sure that your attributes are private!", 0, song.getClass().getFields().length);
    }

    @Test
    public void TestHowManyMethod() {
        assertEquals(5, song.howMany(new ArrayList<String>(Arrays.asList("John", "Fred", "Bob", "Carl", "RyAn"))));
        assertEquals(2, song.howMany(new ArrayList<String>(Arrays.asList("JoHn", "Luke", "AmAndA"))));
        assertEquals(2, song.howMany(new ArrayList<String>(Arrays.asList("Amanda", "CalEb", "CarL", "Furgus"))));
        assertEquals(1, song.howMany(new ArrayList<String>(Arrays.asList("JOHN", "FRED", "BOB", "CARL", "RYAN", "KATE"))));
        assertEquals(1, song.howMany(new ArrayList<String>(Arrays.asList("Jack", "jacK"))));
    }
}

class Song {
    private final String title;
    private final String artist;
    private final Set<String> uniqueListeners = new TreeSet<>(String::compareToIgnoreCase);
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int howMany(List<String> listeners) {
        return (int) listeners.stream().filter(uniqueListeners::add).count();
    }
}