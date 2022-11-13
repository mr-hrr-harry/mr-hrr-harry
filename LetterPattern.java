//Conditional operator

import java.util.*;
public class LetterPattern
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with letters or digits only:\n");
        char[] ar=sc.nextLine().toCharArray();
        for(char i:ar){
            
                 if(i=='A' || i=='a') System.out.print(" *** \n*   *\n*   *\n*****\n*   *\n\n");
            else if(i=='B' || i=='b') System.out.print("**** \n*   *\n**** \n*   *\n**** \n\n");
            else if(i=='C' || i=='c') System.out.print(" *** \n*   *\n*    \n*   *\n *** \n\n");
            else if(i=='D' || i=='d') System.out.print("**** \n*   *\n*   *\n*   *\n**** \n\n");
            else if(i=='E' || i=='e') System.out.print("*****\n*    \n*****\n*    \n*****\n\n");
            else if(i=='F' || i=='f') System.out.print("*****\n*    \n*****\n*    \n*    \n\n");
            else if(i=='G' || i=='g') System.out.print(" *** \n*   *\n*    \n*  **\n *** \n\n");
            else if(i=='H' || i=='h') System.out.print("*   *\n*   *\n*****\n*   *\n*   *\n\n");
            else if(i=='I' || i=='i') System.out.print("*****\n  *  \n  *  \n  *  \n*****\n\n");
            else if(i=='J' || i=='j') System.out.print("*****\n    *\n    *\n*   *\n *** \n\n");
            else if(i=='K' || i=='k') System.out.print("*   *\n*  * \n**   \n*  * \n*   *\n\n");
            else if(i=='L' || i=='l') System.out.print("*    \n*    \n*    \n*    \n*****\n\n");
            else if(i=='M' || i=='m') System.out.print("*   *\n** **\n* * *\n*   *\n*   *\n\n");
            else if(i=='N' || i=='n') System.out.print("*   *\n**  *\n* * *\n*  **\n*   *\n\n");
            else if(i=='O' || i=='o') System.out.print(" *** \n*   *\n*   *\n*   *\n *** \n\n");
            else if(i=='P' || i=='p') System.out.print("**** \n*   *\n**** \n*    \n*    \n\n");
            else if(i=='Q' || i=='q') System.out.print(" *** \n*   *\n*   *\n*  **\n ****\n\n");
            else if(i=='R' || i=='r') System.out.print("**** \n*   *\n**** \n*  * \n*   *\n\n");
            else if(i=='S' || i=='s') System.out.print(" *** \n*    \n *** \n    *\n *** \n\n");
            else if(i=='T' || i=='t') System.out.print("*****\n  *  \n  *  \n  *  \n  *  \n\n");
            else if(i=='U' || i=='u') System.out.print("*   *\n*   *\n*   *\n*   *\n *** \n\n");
            else if(i=='V' || i=='v') System.out.print("*   *\n*   *\n*   *\n * * \n  *  \n\n");
            else if(i=='W' || i=='w') System.out.print("*   *\n*   *\n* * *\n** **\n*   *\n\n");
            else if(i=='X' || i=='x') System.out.print("*   *\n * * \n  *  \n * * \n*   *\n\n");
            else if(i=='Y' || i=='y') System.out.print("*   *\n * * \n  *  \n  *  \n  *  \n\n");
            else if(i=='Z' || i=='z') System.out.print("*****\n   * \n  *  \n *   \n*****\n\n");
           
            else if(i=='0') System.out.print(" *** \n**  *\n* * *\n*  **\n *** \n\n");
            else if(i=='1') System.out.print("  *  \n **  \n* *  \n  *  \n*****\n\n");
            else if(i=='2') System.out.print(" *** \n*   *\n   * \n **  \n*****\n\n");
            else if(i=='3') System.out.print("**** \n    *\n  ** \n    *\n**** \n\n");
            else if(i=='4') System.out.print("*    \n*    \n*  * \n*****\n   * \n\n");
            else if(i=='5') System.out.print("*****\n*    \n**** \n    *\n**** \n\n");
            else if(i=='6') System.out.print(" *** \n*    \n**** \n*   *\n *** \n\n");
            else if(i=='7') System.out.print("*****\n   * \n  *  \n *   \n*    \n\n");
            else if(i=='8') System.out.print(" *** \n*   *\n *** \n*   *\n *** \n\n");
            else if(i=='9') System.out.print(" *** \n*   *\n ****\n    *\n *** \n\n");

            else if(i==' ') System.out.print("\n\n");
            
        }
    }
}


