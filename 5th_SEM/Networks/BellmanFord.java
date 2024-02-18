import java.util.*;

public class misc {
    private int D[];
    private int n;
    public static final int max_value = 999;

    public misc(int n) {
        this.n = n;
        D = new int[n + 1];
    }

    public void shortest(int s, int a[][]) {
        for (int i = 1; i <= n; i++) {
            D[i] = max_value;
        }
        D[s] = 0;

        for (int k = 1; k <= n - 1; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (a[i][j] != max_value) {
                        if (D[j] > D[i] + a[i][j])
                            D[j] = D[i] + a[i][j];
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i][j] != max_value) {
                    if (D[j] > D[i] + a[i][j]) {
                        System.out.println("\nThe graph contains negative edge cycle");
                        return;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Distance of source " + s + " to " + i + " is " + D[i]);
        }
    }

    public static void main(String[] args) {
        int n = 0, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        n = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        System.out.println("\nEnter the weighted matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
                if (i == j) {
                    a[i][j] = 0;
                    continue;
                }
                if (a[i][j] == 0)
                    a[i][j] = max_value;
            }
        }
        System.out.print("\nEnter the source vertex: ");
        s = sc.nextInt();
        misc b = new misc(n);
        b.shortest(s, a);
        sc.close();
    }
}
