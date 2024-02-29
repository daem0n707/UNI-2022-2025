import java.util.*;

class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

class solve {
    int[] jobSchedule(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > max)
                max = arr[i].deadline;
        }
        int result[] = new int[max];
        Arrays.fill(result, -1);

        int count = 0, jobprofit = 0;

        for (int i = 0; i < n; i++) {
            for (int j=arr[i].deadline-1; j>=0; j--) {
                if (result[j] == -1) {
                    result[j] = i;
                    count += 1;
                    jobprofit += arr[i].profit;
                    break;
                }
            }
        }

        int ans[] = new int[2];
        ans[0] = count;
        ans[1] = jobprofit;
        return ans;
    }
}

public class jobSequencing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of jobs: ");
        int n = s.nextInt();
        Job[] arr = new Job[n];
        int x,y;
        for(int i=0;i<n;i++) {
            System.out.print("Enter deadline and profit: ");
            x = s.nextInt();
            y = s.nextInt();
            arr[i] = new Job(i, x, y);
        }
        solve ob = new solve();
        int[] res = ob.jobSchedule(arr, 4);
        System.out.print("\nCount/Profit: "+Arrays.toString(res));
    }
}
