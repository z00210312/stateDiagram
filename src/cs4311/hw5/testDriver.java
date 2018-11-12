package cs4311.hw5;

import cs4311.hw5.MultOf3State.State0;

/*
 * This class is the test driver for MultiplesOf3 class
 * This class is created by Jia Shin Tseng; tz4862
 * This class is last modifed in 5/30/2018
 */

public class testDriver {
    public static void main(String[] args) {
        // input
        
        String []inputs = {"01", "10", "10", "11", "01"};
        // class object
        MultiplesOf3 multOf3;
        multOf3 = new MultiplesOf3();
        
        /*
        System.out.println(multOf3.computeY("01"));
        if(multOf3.getCurrent() instanceof State01){
            System.out.println(true);
        }
        */
        
        
        int result = runSeries(multOf3,inputs);
        System.out.println(result);
        if(multOf3.getCurrent() instanceof State0){
            System.out.println(true);
        }
        
        //assertEquals(1, result);
        //assertEquals(MultOf3State.ZEROMOD3, multOf3.getCurrent());
        
    }
    public static int runSeries(MultiplesOf3 multOf3,String[] inputs) {
        int result = 1;    // if inputs is empty
        
        for (String in: inputs)
            result = multOf3.computeY(in);
        return result;
    }
}
