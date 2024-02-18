import java.util.Scanner;

class Queue {
    int[] q;
    int f = 0, r = 0;

    public Queue(int maxSize) {
        q = new int[maxSize];
    }

    void insert(int n) {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " element: ");
            int ele = s.nextInt();
            if (r >= q.length) {
                System.out.print("\nQueue is full\nLost Packet: " + ele);
                break;
            } else {
                q[r++] = ele;
            }
        }
    }

    void delete() {
        if (r == 0)
            System.out.print("\nQueue empty ");
        else {
            for (int i = f; i < r; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("\nLeaked Packet: " + q[i]);
                f++;
            }
        }
        System.out.println();
    }
}

public class misc {
    public static void main(String ar[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the packets to be sent:");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        q.insert(size);
        q.delete();
    }
}
