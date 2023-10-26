import java.util.Scanner;

public class arrays {
public static boolean equals(int[][] m1, int[][] m2) {
/*Returns true if m1 and m2 are identical*/
if((m1.length != m2.length) || (m1[0].length != m2[0].length)) return false;
for(int i=0; i<m1.length; i++) {
for(int j=0; j<m1[i].length; j++) {
if(m1[i][j] != m2[i][j]) return false;
}
}
return true;
}

/*Main method*/
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int m1[][] = new int[3][3];
int m2[][] = new int[3][3];

/*Asks user to enter the first 3x3 array*/
System.out.println("Enter m1:");
for(int i=0; i<m1.length; i++) {
for(int j=0; j<m1[0].length; j++) {
m1[i][j] = in.nextInt();
}
}

/*Asks user to enter the second 3x3 array*/
System.out.println("Enter m2:");
for(int i=0; i<m1.length; i++) {
for(int j=0; j<m1[0].length; j++) {
m2[i][j] = in.nextInt();
}
}

/*Prints if the two arrays are identical*/
if(equals(m1,m2)) {
System.out.println("The two arrays are identical.");
}
  /*Prints if the two arrays are different*/
else {
System.out.println("The two arrays are not identical.");
}
/*Closes the scanner*/
in.close();
}
}