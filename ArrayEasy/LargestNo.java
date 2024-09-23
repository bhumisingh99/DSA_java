package ArrayEasy;

public class LargestNo {
    public static void main(String args[]) {
        int arr[] = {2,5,4,9,1};

        int largest = arr[0];
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest No. in array is : "+largest);
    }
}