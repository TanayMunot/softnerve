import java.util.*;
class One
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of array elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Stack <Integer> a = new Stack<>();
        ArrayList <Integer> s = new ArrayList<>();
        int max=-1;
        for(int i = arr.length-1;i>=0;i-- )
        {
            if(max < arr[i])
            {
                max=arr[i];
                a.push(arr[i]);
                
            }
        }
        while(!a.empty())
        {
            s.add(a.pop());
        }
        System.out.println(s);
    }
}