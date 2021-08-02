package edu.depaul.cdm.se450.assign_02.hello;

import edu.depaul.cdm.se450.assign_02.intf.Hellointerface;
import edu.depaul.cdm.se450.assign_02.util.HelloHelper;

import java.util.ArrayList;

public class hello implements Hellointerface {
    private ArrayList<String> list;

    public hello(ArrayList<String> list){
        this.list = list;
    }

    public void useHelper(){
        HelloHelper helper = new HelloHelper();
        int length = this.list.size();
        if(length > 0) {
            for (int i = 0; i < length; i++) {
                helper.sayHello(this.list.get(i));
            }
        }

    }


}
