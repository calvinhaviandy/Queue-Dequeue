
package antrian1;
import java.util.Scanner;

public class Antrian1 {
    static int front = -1, rear = -1;
    static int MAX = 5;
    static int queue[] = new int[MAX];

    static void enqueue() {
        if (rear == MAX - 1) {
            System.out.println("Antrian Penuh!");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Angka: ");
            int element = sc.nextInt();

            if (front == -1) {
                front = 0;
            }
            queue[++rear] = element;
            System.out.println("Angka " + element + " ditambahkan ke antrian.");
        }
    }

    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Antrian Kosong!");
        } else {
            System.out.println("Angka " + queue[front] + " dihapus dari antrian.");
            front++;
        }
    }

    static void view() {
        if (front == -1 || front > rear) {
            System.out.println("Antrian Kosong!");
        } else {
            System.out.print("Angka: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. View");
            System.out.println("4. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Salah!");
            }
        } while (choice != 4);
    }
    
}
