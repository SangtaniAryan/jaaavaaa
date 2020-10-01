//public class odd{
//public static void main(String args[]){
//Scannerr sc = new Scanner (System.in){
//int a = sc.nextInt();
//int b = sc.nextInt();

//My code for odd even with output 

class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}

#OUTPUT :- 

Output 1:
Enter an Integer number:
78
Entered number is even

Output 2:

Enter an Integer number:
77
Entered number is odd
