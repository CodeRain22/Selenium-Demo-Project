
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests {
    @Test
    public void test1(){
        System.out.println("This is first test");
    }
    @Test
    public void test2(){
        System.out.println("This is second test");
    }
    @Test
    public void test3(){
        System.out.println("This is third test");
    }
    @Test
    public void test4(){
        System.out.println("This is fourth test");
    }
    @Test
    public void test5(){
        System.out.println("This is fifth test");
        Assert.assertTrue(false);
    }
}
