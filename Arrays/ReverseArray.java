public class ReverseArray {
    public static void reverseArray(int numbers[]){
            int first = 0, last = numbers.length - 1;
            //Time complxity: O(n/2) == O(n)
            while(first < last){
                //swap
                int temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first] = temp;

                first++ ;
                last-- ;
            }
    }
    public static void main(String args[]){
        int numbers[] = {2,3,4,5,7,9,10};
        reverseArray(numbers);
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}


