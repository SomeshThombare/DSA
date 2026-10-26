
public class LargestNumber{
    public static int getLargets(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for (int i=0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }


    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        
        for(int i = 0; i < numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers [] = {1,2,4,5,6,7};
        System.out.println("The Largest No is :" + getLargets(numbers));
        System.out.println("The smaller no is :" + getSmallest(numbers));

    }
}