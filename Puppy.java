public class Puppy{
  public int puppyAge;

  public Puppy(){
    System.out.println("default constructor ");
  }

  public Puppy(String s){
    System.out.println("printing in constructor: "+ s);
  }

  public void setAge(int num){
    puppyAge = num;
  }

  public int getAge(){
    System.out.println("inside getter- "+ puppyAge);
    return puppyAge;
  }
  public static void main(String[] args){
    Puppy puppy = new Puppy("Puppy1");

    Puppy puppy2 = new Puppy();
    puppy2.setAge(3);
    System.out.println("getting method- "+ puppy2.getAge());
    System.out.println("directly through var "+ puppy2.puppyAge);
  }


}
