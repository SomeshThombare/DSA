
public class Linearsearch{

    public static int linerSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args []){
        int numbers[] = {10,20,30,34,56,70};
        int key = 34;

        int index = linerSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key is at index:" + index);
        }

    }
}
