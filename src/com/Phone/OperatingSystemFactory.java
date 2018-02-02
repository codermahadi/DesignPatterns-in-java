package com.Phone;

/**
 * Created by Mahadi on 2/2/2018.
 */
public class OperatingSystemFactory {

    public OS getInstance(String str){

        if (str.equals("Open"))
            return new Android();

        else if (str.equals("Closed"))
            return new IOS();

        else
            return new Windows();
    }
}
