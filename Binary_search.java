import java.util.*;

class Binary_search{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 4;

        int low = arr[0];
        int high = arr[arr.length - 1];
        
        int mid = low + (high - low)/ 2;
        if(arr[mid] == key){
            System.out.println("The position is " + arr[mid])
        }else if(arr[mid] < key){
            low = mid + 1;
        }else{
            high = mid - 1;
        }
        
    }
}