import java.util.*;
class readline{
  public static void main(String args[]){
    int n;
    int sum=0;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter integers with one space gap:");
    String str=s1.nextLine();
    StringTokenizer st=new StringTokenizer(str," ");
    while(st.hasMoreTokens()){
      String temp=st.nextToken();
      n=Integer.parseInt(temp);
      System.out.println(n);
      sum=sum+n;
    }
    System.out.println("Sum of the integers is:"+sum);
    s1.close();
  }
}
