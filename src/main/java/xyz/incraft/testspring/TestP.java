package xyz.incraft.testspring;

/**
 * Created by Михаил on 09.01.2016.
 */
public class TestP implements TestPInterface{
    private int val1;
    private int val2;
    private int val3;

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getVal3() {
        return val3;
    }

    public void setVal3(int val3) {
        this.val3 = val3;
    }

    @Override
    public int GetValue1() {
        return getVal1();
    }

    @Override
    public int GetValue2() {
        return getVal2();
    }

    @Override
    public int GetValue3() {
        return getVal3();
    }
}
