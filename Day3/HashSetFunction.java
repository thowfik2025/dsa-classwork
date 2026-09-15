import java.util.HashSet;
import java.util.Scanner;

public class HashSetFunction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(set.contains(x)){
                System.out.println("Duplicate element found: "+x);
            }else{
                set.add(x);
            }
        }
    }
        
}
