import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestInterface {
    private Subject senior;

    @Test
    public void testInterface() throws Exception {
        senior=new SeniorYear();
        Assert.assertTrue(senior.getName()=="Mathematics 12");
    }
}
