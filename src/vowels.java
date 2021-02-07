import java.util.Scanner;

public class vowels {
    public static void main (String args[]){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence or phrase:  ");
        String words =sc.nextLine();

        for (int i = 0; i<words.length(); i++){
            if(words.charAt(i) == 'a'|| words.charAt(i)  == 'e' || words.charAt(i)  == 'i' || words.charAt(i)  == 'o' || words.charAt(i)  == 'u'){
                count ++;
            }

        }

System.out.println("Number of vowels in the sentence or phrase is "+ count);
    }
}
