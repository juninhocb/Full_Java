package network;


import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DataConverters {

    public void runMe() throws Exception {

        ObjectMapper om = new ObjectMapper();

        Person p = new Person();
        p.setAge(15);
        p.setName("Jorge");
        p.setAmerican(false);

        File file = new File(System.getProperty("user.dir")+"/files/datac");
        //om.writeValue(file, p);





    }

}
