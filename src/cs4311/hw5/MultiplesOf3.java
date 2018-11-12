package cs4311.hw5;

import cs4311.hw5.MultOf3State.State0;

/*
 * This class is designed to demonstrate the State Pattern classes
 * This class is created by Jia Shin Tseng; tz4862
 * This class is last modifed in 5/30/2018
 */

public class MultiplesOf3  {

    /**
     * @param args the command line arguments
     */
    private static StateInterface state;
    private String input;
    // constructor
    public MultiplesOf3(){
        input = "00";
        state = MultOf3State.ZEROMOD3;
    }
    // set the state
    void setState(final StateInterface newState) {
        state = newState;
    }
    //return if the input is accpted by MultiplesOf3
    public int computeY(String str){
        char[] newInput = input.toCharArray();
        char digit = '0';
        char tenth = '0';
        if((str.charAt(1) == '1' && input.charAt(1) == '1')){
            tenth = '1';
        }
        else if ((str.charAt(1) == '1' || input.charAt(1) == '1')){
            digit = '1';
        }
        
        if((str.charAt(0) == '1' && input.charAt(0) == '1')){
            
        }
        else if(str.charAt(0) == '1' || input.charAt(0) == '1'){
            if(tenth == '1'){
                tenth = '0';
            }
            else if(tenth == '0'){
                tenth = '1';
            }
        }
        // update string
        newInput[0] = (char)tenth;
        newInput[1] = (char)digit;
        input = String.valueOf(newInput);
        
        // update state
        if(str.charAt(0) == '1'){
            state.CurrState(this);
            state.CurrState(this);
        }
        
        if(str.charAt(1) == '1'){
            state.CurrState(this);
        }
        
        if(state instanceof State0)
            return 1;
        return 0;
    }
    public StateInterface getCurrent(){
        return state;
    }
}
