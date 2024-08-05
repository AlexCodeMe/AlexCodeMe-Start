import org.junit.Assert;
import org.junit.Test;

public class QuestionsTest {
    Questions q = new Questions();

    @Test
    public void testQuestion1() {
        int expectedResult = (int) Math.PI / 1;
        int actualResult = q.question1();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testQuestion2() {
        int expectedResult = (int) Math.pow(2, 4) - 2;
        int actualResult = q.question2();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testQuestion3() {
        String expectedResult = new StringBuilder("xdeiDgnirtSwLskdu"
        .substring(5, 11))
        .reverse()
        .toString()
        .toLowerCase();
        
        String actualResult = q.question3();
        Assert.assertEquals(expectedResult, actualResult.trim().toLowerCase());
    }
}
