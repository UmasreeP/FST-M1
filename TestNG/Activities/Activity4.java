package suiteExample;
import org.testng.annotations.Test;

public class DemoOne {
    @Test
    public void firstTestCase() {
        System.out.println("I'm in first test case from demoOne Class");
    }

    @Test
    public void secondTestCase() {
        System.out.println("I'm in second test case from demoOne Class");
    }
}

package suiteExample;
import org.testng.annotations.Test;

public class DemoTwo {
    @Test
    public void TestCase() {
        System.out.println("I'm in the test case from DemoTwo Class");
    }
}