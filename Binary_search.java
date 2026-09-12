import java.util.*;

class Binary_search{
    public static void main(String[] args){
        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the element of array : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       System.out.println("Enter the search element : ");
       int key = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = low + (high - low)/ 2;
            if(arr[mid] == key){
                System.out.println("The position is " + (mid + 1));
                return;
            }else if(arr[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
    }
}