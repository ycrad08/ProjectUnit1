import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
// Selection menu
  System.out.println("");
    System.out.println("Welcome to the student resource menu.");
    System.out.println("Select one of the following:");
    System.out.println("1. Multiplication");
    System.out.println("2. Addition 1-100");
    System.out.println("3. Logic AND Gate");
    System.out.println("4. Logic OR Gate");
    System.out.println("----------------------");
    System.out.println("");
    int currentTool = Integer.parseInt(input.nextLine());
    System.out.println("");
// Option 1
  if (currentTool==1)
  {
    // Finding values
      System.out.println("Tool 1 selected! Starting Multiplication table...");
          // Needs to be %3d to have room for 100 (3 digets)
          // Blank println alines table properly
          for (int n=0;n<=10;n++){
              System.out.printf("%3d ",n);
          }
             System.out.println("");  
               for(int t=1;t<=10;t++){
                 System.out.printf("%3d ", t);
          for(int s=1;s<=10;s++){
            System.out.printf("%3d ",t*s);
          }
            System.out.println("");
        }
  }
// Option 2
  if (currentTool==2)
  {
    System.out.println("Tool 2 selected! Starting Addition Tool...");
          //for (int n=0;n<=10;n++){
              //System.out.printf("%3d ",n);
          //}
             System.out.println("");  
               for(int t=1;t<=10;t++){
                 System.out.printf("%3d ", t);
          for(int s=1;s<=10;s++){
            System.out.printf("%3d ",t+s);
          }
            System.out.println("");
        }

  }
// Option 3
  if (currentTool==3)
  {
    System.out.println("Tool 3 selected! Starting AND Gate...");

  }
// Option 4
  if (currentTool==4)
  {
    System.out.println("Tool 4 selected! Starting OR Gate...");

  }






}
}
