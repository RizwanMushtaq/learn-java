class Animal {
  public static void testClassMethod() {
    System.out.println("The static method in Animal");
  }

  public void testInstanceMethod() {
    System.out.println("The instance method in Animal");
  }
}

class Cat extends Animal {
  public static void testClassMethod() {
    System.out.println("The static method in Cat");
  }

  @Override
  public void testInstanceMethod() {
    System.out.println("The instance method in Cat");
  }
}

public class Main {
  public static void main(String[] args) {
    Cat myCat = new Cat();
    Animal myAnimal = myCat;
    Animal.testClassMethod();
    Cat.testClassMethod();
    myCat.testInstanceMethod();
    myAnimal.testInstanceMethod();
  }
}
