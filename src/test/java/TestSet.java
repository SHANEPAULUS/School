import junit.framework.Assert;
import org.junit.Test;

import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestSet {
    private Set<Double> salaries;

    @Test
    public void testSet() throws Exception {
        salaries=new HashSet<Double>();

        salaries.add(25000.00);
        salaries.add(90000.00);
        salaries.add(33000.00);

        Assert.assertFalse(salaries.contains(4000.00));

    }
}
