public class Loops{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,6,43};

    System.out.printf("hello %f hello %d Hello %s", 11.02,23,"LOL!"+ "\n");

    String[] str = {"aa", "bb", "cc", "dd" };

    for(int i : arr){
      System.out.println(i+ " ");
    }

    for(String s: str){
      System.out.println(s);
    }
  }
}
