public class Main {
  public static void main(String[] args) {
    System.out.println("Annotations Example");
    Generation3List list = new Generation3List();
  }
}

@interface ClassPreamble {
  String author();

  String date();

  int currentRevision() default 1;

  String lastModified() default "N/A";

  String lastModifiedBy() default "N/A";

  String[] reviewers();
}

@ClassPreamble(author = "John Doe", date = "3/17/2002", currentRevision = 6, lastModified = "4/12/2004", lastModifiedBy = "Jane Doe", reviewers = {
    "Alice", "Bob", "Cindy" })
class Generation3List {
  // class code goes here
}