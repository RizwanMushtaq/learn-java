public void Main() {
  public static void main(String[] args){
    // Example usage of the Stream and Lambda expressions
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
    // Using a stream to filter names that start with 'A'
    List<String> filteredNames = names.stream()
        .filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());
    // Printing the filtered names
    filteredNames.forEach(System.out::println);
  }
}