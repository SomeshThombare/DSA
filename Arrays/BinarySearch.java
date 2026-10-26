
public class BinarySearch {
    public static int binaySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
// time complexity -- 1st time n/2 , 2nd time -- n/4 .....n/6 ... kth time  n/k  --> O(log n)
        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){ // if found
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1; //right
            }else{ //left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers [] = {2,3,4,6,7,8,9,6};
        int key = 2;

        System.out.println("Index of key is :" + binaySearch(numbers , key));
    }
}
