import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestInterfaceSpringframeWork {
    private Subject subject;

    @Test
    public void testInterface() throws Exception {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        subject=(Subject)ctx.getBean("junior");

        System.out.println(subject.getName()+"sdasd");
        //Assert.assertEquals(juniorYear.getYear(),2015);
    }
}
