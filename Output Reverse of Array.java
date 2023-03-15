import java.util.Arrays;
public class Main{
    public static void main(String arg[]){
        String[] fruits = { "Apple", "Mango", "Orange" };
        
        for (int i = fruits.length-1; i>=0; i--)
            System.out.println(fruits[i]);
            
        for (String fruit : fruits)//Repeating the array 3 times as the number of elements
            System.out.println(Arrays.toString(fruits));
    }
}
