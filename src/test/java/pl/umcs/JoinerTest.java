package pl.umcs;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class JoinerTest {

    @Test
    public void shouldJoinStringsSkippingNull(){
        Joiner joiner = Joiner.on("; ").skipNulls();
        String returnedString = joiner.join("Harry", null, "Ron", "Hermione");

        Assert.assertEquals("Harry; Ron; Hermione", returnedString);
    }

    @Test
    public void shouldJoinFromListToString(){
        List<Integer> integerList = Arrays.asList(1,5,7);
        Joiner joiner = Joiner.on(",");

        String returnedString = joiner.join(integerList);

        Assert.assertEquals("1,5,7", returnedString);
    }
}
