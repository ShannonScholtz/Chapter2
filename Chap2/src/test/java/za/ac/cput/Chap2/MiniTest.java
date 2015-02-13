package za.ac.cput.Chap2;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.concurrent.TimeoutException;


/**
 * Created by student on 2015/02/12.
 */
public class MiniTest {

    MiniApps mini = new MiniApps();

    //execute before class
    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("In before class");
    }

    @Test
    public void TestFloat()
    {
        float num = (float) 124.56;
        Assert.assertTrue(mini.fNumber() == num);
    }

    @Test
    public void TestInt()
    {
        int num = 111;
        Assert.assertTrue(mini.INumber() == num);
    }

    @Test
    public void ObjEquality()
    {
        String name = "Shannon";
        Assert.assertEquals(mini.FirstName(), name);
    }

    @Test
    public void objIdentity()
    {
        String name1 = "Shannon";
        Assert.assertSame(mini.FirstName2(), name1);
    }

    @Test
    public void TestTruth()
    {
        Assert.assertTrue(mini.truth());
    }

    @Test
    public void TestFalse()
    {
        Assert.assertFalse(mini.fal());
    }

    @Test
    public void TestNull()
    {
        Assert.assertNull(mini.NullName());
    }

    @Test
    public void NotNull()
    {
        Assert.assertNotNull(mini.NonNullName());
    }

    @Test
    public void TestFail()
    {
        Assert.fail();
    }

    @Test(timeout = 100)
    public void TestTimeout()
    {
        mini.excepTime();
    }

    @Ignore
    public void DisablingTest() {

        System.out.println("in ignore test");
    }


    @Test
    public void TestArray()
    {
        String[] name = {"Shannon", "Beatrix", "Edmund"};
        Assert.assertArrayEquals(mini.arrContent(), name);

    }

    @AfterClass
    public static void afterclass()
    {
        System.out.println("In after class");
    }
}
