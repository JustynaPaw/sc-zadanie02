package pl.umcs;

import static org.junit.Assert.assertTrue;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import org.junit.Test;

public class SplitterTest {

    @Test
    public void shouldSplitStringOnGivenChar(){
        Splitter splitter = Splitter.on(';');
        String stringToSplit = "a;b;c";

        Iterable splitedString = splitter.split(stringToSplit);

        assertTrue(Iterables.contains(splitedString, "a"));
        assertTrue(Iterables.contains(splitedString, "b"));
        assertTrue(Iterables.contains(splitedString, "c"));
    }

    @Test
    public void shouldSplitStringOnGivenLength(){
        Splitter splitter = Splitter.fixedLength(2);
        String stringToSplit = "abcdef";

        Iterable splitedString = splitter.split(stringToSplit);

        assertTrue(Iterables.contains(splitedString, "ab"));
        assertTrue(Iterables.contains(splitedString, "cd"));
        assertTrue(Iterables.contains(splitedString, "ef"));
    }
}
