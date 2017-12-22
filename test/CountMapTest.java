import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CountMapTest {
    @Test
    public void addTest() {
        CountMap<Integer> map = new CountMapImpl<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        assertEquals(3, map.getCount(10));
        assertEquals(2, map.getCount(5));
        assertEquals(1, map.getCount(6));
    }

    @Test
    public void addAllTest () {
        CountMap<Integer> map = new CountMapImpl<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        CountMap<Integer> source = new CountMapImpl<>();
        source.add(8);
        source.add(23);
        source.add(23);

        map.addAll(source);
        assertEquals(1, map.getCount(8));
        assertEquals(2, map.getCount(23));
    }
}
