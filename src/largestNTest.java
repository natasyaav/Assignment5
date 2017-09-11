import org.junit.Assert;

public class largestNTest {
    largestN n = new largestN();
    int a = 0;

    @org.junit.Test
    public void largestNum() throws Exception {
        Assert.assertEquals("Expected result n = 22", 22, n.largestNum(a));
    }
}