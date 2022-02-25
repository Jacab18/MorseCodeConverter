package Morsecode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConverter {

    @Test
    public void testMorseToA() {
        Converter converter = new Converter();
        String actual = converter.toEnglish("*-");

        assertEquals("A", actual);
    }

    @Test
    public void testLetterToA() {
        Converter converter = new Converter();
        String actual = converter.toEnglish("A");

        assertEquals("*-", actual);
    }

    @Test
    public void testMorseToHIT() {
        Converter converter = new Converter();
        String actual = converter.toEnglish("**** ** -");

        assertEquals("HIT", actual);
    }

    @Test
    public void testLettersToHIT() {
        Converter converter = new Converter();
        String actual = converter.toMorse("HIT");

        assertEquals("**** ** -", actual);
    }

    @Test
    public void testLettersToDISKMASKINSREPARATÖR() {
        Converter converter = new Converter();
        String actual = converter.toMorse("DISKMASKINSREPARATOR");

        assertEquals("-** ** *** -*- -- *- *** -*- ** -* *** *-* * *--* *- *-* *- - --- *-*", actual);
    }
}
