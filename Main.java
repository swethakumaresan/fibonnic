/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
int T=scan.nextInt();

String str= scan.nextLine();
for(int i=0;i<str.length();i++){
	int count = 1;  
    for(int j = i+1; j < str.length(); j++) {  
        if(str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {  
            count++;  
}
}
}
}
}