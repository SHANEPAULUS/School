import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestMap {
    Map<Long,Staff> staffList;

    @Test
    public void testMap() throws Exception {
        staffList=new HashMap<Long, Staff>();

        staffList.put(001L,new Staff("Anil","Paulus",21,"Vice-Principal"));
        staffList.put(002L,new Staff("Eddie","Jenkins",25,"HOD-Science"));
        staffList.put(003L,new Staff("Jade","Smith",28,"Secretary"));

        staffList.remove(002L);

        Assert.assertTrue(staffList.get(001L).getSurname()=="Paulus"&&staffList.size()==2);
    }
}
