import junit.framework.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestList {
    private List staff;

    @Test
    public void testList() throws Exception {
        staff=new LinkedList();
        staff.add(new Staff("Shane","Paulus",21,"Teacher"));
        staff.add(new Staff("Keanan","Cloete",34,"HOD"));
        staff.add(new Staff("Julian","Conradie",49,"Cleaner"));

        staff.remove(1);
        Assert.assertTrue(staff.size()==2);
    }
}
