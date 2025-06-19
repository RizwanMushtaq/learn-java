import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface ClassPreamble {
  String author();

  String date();

  int currentRevision() default 1;

  String lastModified() default "N/A";

  String lastModifiedBy() default "N/A";

  String[] reviewers();
}

@ClassPreamble(author = "Rizwan Mushtaq", date = "3/17/2002", currentRevision = 6, lastModified = "4/12/2004", lastModifiedBy = "Jane Doe", reviewers = {
    "Alice", "Bob", "Cindy" })
class Generation3List {
  // class code goes here
}

public class Main {
  public static void main(String[] args) {
    System.out.println("Annotations Example");
    Generation3List list = new Generation3List();
    System.out.println("Author: " + list.getClass()
        .getAnnotation(ClassPreamble.class).author());
  }
}