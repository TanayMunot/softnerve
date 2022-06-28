import java.util.*;


class three {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of array elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elemnts");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int subsets = (int) Math.pow(2, arr.length); 
        int total = 0;
        for (int i = 0; i < subsets; i++) {
            int temp = i;
            int xsum = 0;
            for (int j = arr.length - 1; j >= 0; --j) {

                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 1) {
                    xsum = xsum ^ arr[j];

                }
            }
            total = total + xsum;
        }
        System.out.println("Sum :" +total);
    }
}
