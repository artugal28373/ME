package co.exam;
 import java.util.Scanner;


// hello 
public class CSE {
   /**
    * 1
    * **/
   public  static  void First()
   {
       Scanner scan = new Scanner(System.in);
       int[] arr = new int[10];
       for(int  i = 0;  i< 10; i++)  arr[i] = scan.nextInt();
       for (int i = 9; i>= 0; i--) System.out.print(arr[i]+" ");
   }
   /**
     2
    **/
   public  static  void Second()
   {
       Scanner scan = new Scanner(System.in);
       int[] arr= new int[10];

       for(int i = 0; i < 10; i++)
       {     arr[i] = scan.nextInt();
           System.out.print("You have entered ");
           for(int j = 0; j<=i; j++)
           {
                      System.out.print(arr[j]+" ");
           }
           System.out.println();
       }
   }

    /**
     * 3
     */
    public static  void Third()
    {
        int[] arr= new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i =0; i < 10 ; i++) arr[i] = scan.nextInt();
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j< 9-i; j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        for(int i =0; i  <  10; i++) System.out.print(arr[i]+" ");
    }

    /**
     * 4
     */
    public static void Fourth()
    {
                  int[] arr = new int[5];
                  int a;
                  int i , j;
                  Scanner scan = new Scanner(System.in);
                  i =0;
                  while(i<5)
                  {
                        a = scan.nextInt();
                        int flag = 1;
                        j = 0;
                        while(j< i)
                        {
                            if(arr[j]==a)
                            {
                                System.out.print(a +" has been already entered\n");
                                flag = 0;
                                break;
                            }
                            j++;
                        }
                        if(flag==1)
                        {
                            arr[i] = a;
                            i++;
                        }
                  }
                  for(i = 0; i< 5; i++) System.out.print(arr[i]+" ");
    }


    /**
     * 5
     */

    public static void Fifth()
    {
        double current , voltage, frequency, inductance, capacitance, resistance;
        Scanner scan = new Scanner(System.in);
        {
         voltage = scan.nextDouble();
        resistance = scan.nextDouble();
        inductance = scan.nextDouble();
        capacitance = scan.nextDouble();
        frequency = scan.nextDouble();
        }
      final double pi = java.lang.Math.acos(-1.0);
        
          double inductiveResistance = 2*pi*frequency*inductance;
          double capacitanceResistance = 2*pi*frequency*capacitance;
          capacitanceResistance = 1.0/capacitanceResistance;
          double del = inductiveResistance - capacitanceResistance;
          resistance = resistance*resistance;
          del = del*del;
          double total  = resistance+del;
          total = java.lang.Math.sqrt(total);
          current = voltage/total;
          System.out.println("Current = "+current+"A");
    }

    /**
     * 6
     */
    public static void Sixth()
    {
        int sum = 0, n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1; i <=n; i++)
        {
            if(i%2==1) sum += (i*i);
            else sum -= (i*i);
        }
        System.out.println(sum);
    }
    /**
     * 7
     **/
    public static void Seventh()
    {
        int[] arr = new int[11];
        int a;
        int i , j;
        Scanner scan = new Scanner(System.in);
        i =0;
        while(i<11)
        {
            a = scan.nextInt();
            int flag = 1;
            j = 0;
            int cnt = 0;
            while(j< i)
            {
                if(arr[j]==a)
                {
                    cnt++;
                    if(cnt>=4)
                    {
                        System.out.print(a +" has been already entered 4 times.\n");
                        flag = 0;
                        break;
                    }
                }
                j++;
            }
            if(flag==1)
            {
                arr[i] = a;
                i++;
            }
        }
        for(i = 0; i< 11; i++) System.out.print(arr[i]+" ");
    }

    /**
     *
     * 8
     */
    public static  void Eight()
    {
        int[] arr = new int[10];
        for(int i= 0; i < 10; i++) arr[i] = 0;
        int a;
        Scanner scan = new Scanner(System.in);
        for(int i= 0;  i< 10; i++)
        {
            a = scan.nextInt();
            arr[a]++;
        }
        for(int i= 0; i<10; i++)
        {
            if(arr[i]>=2 && arr[i] <= 4)
            {
                System.out.print(i+" ");
            }
        }
    }

    /**
     *
     * 9
     */
    public static void Ninth()
    {
        int[] arr = new int[10];
        int intia, add;
        Scanner scan = new Scanner(System.in);
        for(int i =0; i < 10 ; i++) arr[i] = scan.nextInt();
        System.out.println("1) only numbers at odd positions");
        System.out.println("2) only numbers at even positions");
        System.out.println("3) all numbers");
        int c;
        c = scan.nextInt();
        if(c==1) {
            intia = 0;
            add = 2;
        }
        else if(c==2)
        {
            intia = 1;
            add = 2;
        }
        else
        {
            intia = 0;
            add = 1;
        }
        for(int i = 0; i < 10; i+=add)
        {
            for(int j = intia; j< 9; j+=add)
            {
                if(j+add < 10 && arr[j]<arr[j+add] )
                {
                    int a = arr[j];
                    arr[j] = arr[j+add];
                    arr[j+add] = a;
                }
            }
        }
        for(int i =0; i  <  10; i++) System.out.print(arr[i]+" ");
    }

    public static void  main(String[] arg)
   {

      int a;
      Scanner scan = new Scanner(System.in);
      a = scan.nextInt();
      if(a==1) First();
      else if(a==2) Second();
      else if(a==3) Third();
      else if(a==4) Fourth();
      else if(a==5) Fifth();
      else if(a==6) Sixth();
      else if(a==7) Seventh();
      else if(a==8) Eight();
      else Ninth();





    }
}
