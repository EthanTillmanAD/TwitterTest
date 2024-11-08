import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import twitter.SocialHandle;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SocialHandleTest {
SocialHandle socialHandle;

    @BeforeEach
    void setup(){
    socialHandle = new SocialHandle();
    }


    @Test
    @DisplayName("Test Creating Handle")
    void createHandleTest(){


        String expected = "@bandsmake";
        String actual = socialHandle.createHandle("BandsMakeMeDance");
        Assertions.assertEquals(expected,actual);

    }
    @Test
    @DisplayName("Test Add Handle")
    void addHandleTest(){

        String expected = "[@pinkdounu]";

        socialHandle.addHandle("pinkdounut11");

        HashSet<String> x = socialHandle.getHandles();

        Assertions.assertEquals(expected, x.toString());

    }
    @Test
    @DisplayName("Test Remove Handle")
    void removeHandleTest(){

        String expected = "[]";

        socialHandle.addHandle("@pinkdouNut");

        socialHandle.removeHandle("@pinkdounut66");

        String actual = socialHandle.getHandles().toString();

        Assertions.assertEquals(expected, actual);


    }
}
