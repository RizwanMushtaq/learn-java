class Boo {
  public Boo(int i) {}
  public Boo(String s) {}
  public Boo(String s, int i) {}
}

public class Main extends Boo {
    public Main() {
        super("boo");
    }
    public Main(int i) {
        super("Fred");
    }
    public Main(String s) {
        super(42);
    }
    public Main( int i, String s) {
    }
    public Main(String a, String b, String c) {
      super(a,b);
    }
    public Main(int i, int j) {
      super("man", j);
    }
    public Main(int i, int j, int k) {
      super(i, "star");
    }

    public static void main(String[] args) {
        System.out.println("How Constructors Work in Java");
    }
}