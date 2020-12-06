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
      System.out.println("Tool 1 selected! Starting Multiplication table...");
      System.out.println("--------------------------------------------");
          // Needs to be %3d to have room for 100 (3 digets)
          // Blank println alines table properly
          // r is row
          // c is column
          // n is number
          for (int n=0;n<=10;n++){
          System.out.printf("%3d ",n);
          }
            System.out.println("");  
            for(int r=1;r<=10;r++){
            System.out.printf("%3d ", r);
            for(int c=1;c<=10;c++){
            System.out.printf("%3d ",r*c);
          }
          System.out.println("");
        }
      System.out.println("--------------------------------------------");
  }
// Option 2
  if (currentTool==2)
  {
    System.out.println("Tool 2 selected! Starting Addition Tool...");
    System.out.println("--------------------------------------------");
          int rowOutput = 1; // keeps track of row diget ex. 10, 20, 30, etc...
          int columnOutput = 1; // keeps track of column diget ex. 1, 2, 3, etc...
            for(int row=1;row<=10;row++)
            {
              System.out.printf("%3d ", rowOutput);
          
              for(int column=1;column<10;column++)
              {
                System.out.printf("%3d ",rowOutput+columnOutput);
                columnOutput = columnOutput +1;
              }
              System.out.println("");
              rowOutput = rowOutput +10;
              columnOutput = 1;
              // have to rest column output so it doesnt think its in column 11 instead of back at 1
            }
    System.out.println("--------------------------------------------");
  }
// Option 3
  if (currentTool==3)
  {
    System.out.println("Tool 3 selected! Starting AND Gate...");
        boolean one; // condition 1
        boolean two; // condition 2
        boolean three = false; // output
        int conditionCount = 0; // count if any conditions are true

        System.out.println("----------------------");
          // take values
          System.out.println("Is condition one TRUE or FALSE?");
          one = input.nextBoolean();
          System.out.println("----------------------");

          System.out.println("Is condition two TRUE or FALSE?");
          two = input.nextBoolean();
          System.out.println("----------------------");
            // check conditions
              if(one)
              {
               conditionCount = conditionCount + 1;
              }
          
              if(two)
              {
               conditionCount = conditionCount + 1;
              }
            
            // if one or two is false then this wont run since it doesn't == 2
              if(conditionCount == 2)
              {
                three = true;
              }
          // print out conditions
          System.out.println("1." + one);
          System.out.println("2." + two);
          System.out.println("Output is " + three);
          System.out.println("----------------------");
  }
// Option 4
  if (currentTool==4)
  {
    System.out.println("Tool 4 selected! Starting OR Gate...");
        boolean one; // condition 1
        boolean two; // condition 2
        boolean three = true; // output
        int conditionCount = 0; // count if any conditions are true

        System.out.println("----------------------");
          // take values
          System.out.println("Is condition one TRUE or FALSE?");
          one = input.nextBoolean();
          System.out.println("----------------------");

          System.out.println("Is condition two TRUE or FALSE?");
          two = input.nextBoolean();
          System.out.println("----------------------");
            // check conditions
             if(one)
              {
               conditionCount = conditionCount + 1;
              }
          
             if(two)
              {
                conditionCount = conditionCount + 1;
             }
            
             // if one or two is true then this wont run since it doesn't == 0
             if(conditionCount == 0)
             {
                three = false;
              }
          // print out conditions
          System.out.println("1." + one);
          System.out.println("2." + two);
          System.out.println("Output is " + three);
          System.out.println("----------------------");
  }






}
}
