import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Make an array of doubles, and test your sumArray method
    double[] foo = new double[5];
    foo[0] = 2;
    foo[1] = 4;
    System.out.println(sumArray.foo);
   


    // TODO: Make an array of Strings, and test your averageLength method
    String [] dingtea = { "wintermelon", "matcha", "jazmine", "milktea"};
    System.out.println(averageLength(dingtea));
    // TODO: Make an array of ints, and test your arrayMax method

    // TODO: Make an array of Strings as well as a target, and test your linearSearch method
  }


  public static double sumArray(double[] arr)
  {
    double ans = 0.0;
    for (int i = 0; i < arr.length; i++)
    {
      ans += arr[i];
    }

    for(double val : arr)
    {
      ans += val;
    }
    return ans;
  }

  public static double averageLength(String[] arr)
  {
    double sum = 0.0;
    for(int i = 0; i < arr.length; i++)
    {
      sum += arr[i].length;
    }
    return sum/arr.length;
  }

  public static int arrayMax(int[] arr)
  {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] > max)
      {
        max = arr[i];
      }
    }
    return max;
  }

  public static boolean linearSearch(String[] arr)
  {
    for(int i = 0; i <arr.length; i++)
    {
      if (arr[i].equals(target))
      {
        return true; 
      }
    }
    return false;
  }
}
