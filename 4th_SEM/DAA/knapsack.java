import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter no of elements: ");
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] profit = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the profit: ");
            profit[i] = sc.nextInt();
            System.out.print("\nEnter the weight: ");
            weight[i] = sc.nextInt();
        }
        System.out.print("\nEnter the Knapsack capacity: ");
        int bag = sc.nextInt();
        double[] pw = new double[n];
        for (int j = 0; j < n; j++) {
            pw[j] = (double) profit[j] / (double) weight[j];
        }
        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < n;y++ ) {
                if (pw[x] < pw[y]) {
                    double t1 = pw[x];
                    pw[x] = pw[y];
                    pw[y] = t1;

                    int t2 = profit[x];
                    profit[x] = profit[y];
                    profit[y] = t2;

                    int t3 = weight[x];
                    weight[x] = weight[y];
                    weight[y] = t3;
                }
            }
        }

        int k = 0;
        double sum = 0;
        while (bag > 0) {
            if (weight[k] < bag) {
                sum += 1 * profit[k];
                bag = bag - weight[k];
                k++;
            } else {
                sum = sum + (bag * pw[k]);
                bag = 0;
            }
        }
        System.out.println(Arrays.toString(profit));
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(pw));
        System.out.println(sum);
    }
}
