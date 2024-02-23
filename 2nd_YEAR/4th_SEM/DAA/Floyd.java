import java.util.Scanner;

public class misc {
    static int[][] dmatrix;
    static int n;
    public static final int infinity = 999;

    public static void main(String[] args) {
        int[][] wmatrix;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        wmatrix = new int[n ][n ];
        dmatrix = new int[n][n];
        System.out.println("Enter the weighted matrix for graph: ");
        for (int i =0;i < n;i++) {
            for (int j = 0; j < n; j++) {
                wmatrix[i][j] = sc.nextInt();
                if (i == j) {
                    wmatrix[i][j] = 0;
                    continue;
                }
                if (wmatrix[i][j] == 0) {
                    wmatrix[i][j] = infinity;
                }
            }
        }
        System.out.println("The following matrix show the shortest distance between: ");
        misc obj = new misc();
        obj.floyds(wmatrix);
        sc.close();

    }

    private void floyds(int[][] amatrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dmatrix[i][j] = amatrix[i][j];
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dmatrix[i][k] + dmatrix[k][j] < dmatrix[i][j]) {
                        dmatrix[i][j] = dmatrix[i][k] + dmatrix[k][j];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+i);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < n; j++) {
                System.out.print(dmatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}