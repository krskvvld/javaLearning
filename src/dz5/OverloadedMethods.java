package dz5;

public class OverloadedMethods {
    public int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public double sum(double... nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }
}