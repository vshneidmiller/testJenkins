import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    void test() {
        int actualSum = HelloWorld.sum(2, 8);
        assert actualSum == 5;
        System.out.println("actual sum is :" + actualSum);
    }
}
