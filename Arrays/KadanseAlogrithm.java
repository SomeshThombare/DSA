public class KadanseAlogrithm {
    // time complexity is O(n) thsi is reliable algorithem
    public static void Kadanse(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i < numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max subarray sum is : " + maxSum);
    }
    public static void main (String args[]){
        int numbers[] = {-2, -3, 4, 5, 3, 2, 1,7,3};
        Kadanse(numbers);
    }
}
