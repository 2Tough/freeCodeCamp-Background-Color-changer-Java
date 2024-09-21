package org.changer;

public class ColorChanger {
    private int one;
    private int two;
    private int three;

    public ColorChanger(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getThree() {
        return three;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public void setThree(int three) {
        this.three = three;
    }
}
