package com.mahadi;

import com.Phone.Android;
import com.Phone.OS;
import com.Phone.OperatingSystemFactory;
import com.Phone.Windows;

/**
 * Created by Mahadi on 2/2/2018.
 */
public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();

        OS obj = osf.getInstance("Closed");

        obj.spec();
    }
}
