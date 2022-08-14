import java.util.Scanner;
class exam {
    public static void main (String []args){
        int n,c;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        System.out.println("enter value of n");
        int arr[] = new int[n];

        System.out.println();("enter" + n + "values");

        for (c = 0; c<n; c++)
          arr[c] = in.nextInt();
     
    
      for (c = 0; c<n ; c++)
         System.out.println(arr[c]);
    }
    

    
}
