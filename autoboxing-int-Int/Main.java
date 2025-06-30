public class Main {
  private Integer i;
  private int j;

  public void go() {
    j = i;
    System.out.println("i = " + i);
    System.out.println("j = " + j);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.go();
  }
}
