package httpInterface.complaint;

import java.util.Arrays;

public class testNumber {
    public static void main(String[] args) {
        double[] dbe = new double[]{90.14,83.16,89.22,92,88.46,77.1,85.44,92.88,86.26,77.86,46.04,83.7,76.68,76.28,78.76,83.94,71.94,86.16,72.38};
        System.out.println(Arrays.toString(fourSum(dbe, 356.96)));
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
