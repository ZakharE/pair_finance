import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pair.finance.FindMajority;

import java.util.stream.IntStream;

public class FindMajorityTest {
    @Test(dataProvider = "Arrays with result majority element")
    public void ifArrayConsistsOfSingleElementThenThisElementWillReturn(int[] a, int result) {
        int majority = FindMajority.findMajority(a);
        assert majority == result;
    }

    @DataProvider(name = "Arrays with result majority element")
    public Object[][] arrayWithResultProvider() {
        return new Object[][]{
                {IntStream.of(1, 2, 3, 2, 1, 1).toArray(), 1},
                {IntStream.of(1).toArray(), 1},
                {IntStream.of(-1, -1, -1, 2, 2, 2, -1).toArray(), -1}
        };
    }
}
