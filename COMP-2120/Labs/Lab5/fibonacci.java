

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter value for n: ");
        n = scan.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        for(int i = 2;i<n;i++){
            arrayList.add(arrayList.get(i-1)+arrayList.get(i-2));
        }
        for(int i = 0;i<n;i++){
            System.out.println(arrayList.get(i));
        }
        System.out.print("Index of number? : ");
        System.out.print(arrayList.indexOf(scan.nextInt()));
    }
}
