package httpInterface.complaint;

import java.util.Arrays;

public class testNumber {
    public static void main(String[] args) {
        double[] dbe = new double[]{1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(fourSum(dbe, 20)));
    }

    public static double[] fourSum(double[] arr, double sum)
    {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                for (int k = j + 1; k < arr.length; ++k) {
                    for (int l = k + 1; l < arr.length; ++l) {
                        if (Math.abs(arr[i] + arr[j] + arr[k] + arr[l] - sum) <= 0.000001)
                            return new double[]{arr[i], arr[j], arr[k], arr[l]};
                    }
                }
            }
        }
        return new double[0];
    }
}
