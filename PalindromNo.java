package assignmentmdk;

import java.util.Arrays;

public class PalindromNo {

	public static void main(String[] args) {
		String input=" kadak ";
        String output="kadak";
        
        for(int i=input.length()-1;i>=0;i--)
        {
                char c1=        input.charAt(i);
                output=output+c1;
        }
                System.out.println("Here is my input->"+input);
                System.out.println("Here is my output->"+output);

        if(input.equals(output))
        {
                System.out.println("It is a Palindrome");
        }
        else
        {
                System.out.println("NOT a Palindrome");
        }
	}

}
