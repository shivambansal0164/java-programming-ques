import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner scc=new Scanner(System.in);
        int b=scc.nextInt();
		int i=1;
        while(i<=b)
        {
            int a=1;
            while(a<=i)
            {
                System.out.print("*");
                a++;
            }
            i++;
            System.out.println();
        }
	}

}
