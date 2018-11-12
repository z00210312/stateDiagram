/*
 * This class is designed to hold the states for State Pattern classes
 * This class is created by Jia Shin Tseng; tz4862
 * This class is last modifed in 5/30/2018
 */
package cs4311.hw5;

/**
 *
 * @author Tom
 */
public class MultOf3State {
    public static StateInterface ZEROMOD3 = new State0();
    public static StateInterface ONEMOD3 = new State1();
    public static StateInterface TWOMOD3 = new State2();
    public static class State0 implements StateInterface{
    // update the state
        @Override
        public void CurrState(MultiplesOf3 state) {
            state.setState(MultOf3State.ONEMOD3);
        }
    }
    public static class State1 implements StateInterface{
    // update the state
        @Override
        public void CurrState(MultiplesOf3 state) {
            state.setState(MultOf3State.TWOMOD3);
        }
    }
    public static class State2 implements StateInterface{
    // update the state
        @Override
        public void CurrState(MultiplesOf3 state) {
            state.setState(MultOf3State.ZEROMOD3);
        }
    }
}
