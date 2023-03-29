public class Main {
    public static void main(String[] args) {
        CustomLinkedList<String> countries = new CustomLinkedList<>();
        countries.add("Belgium");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Switzerland");
        countries.add("Ukraine");
        countries.add("United Kingdom");

        System.out.println("LinkedList elements: " + countries + " size = " + countries.size());
        countries.add("Sweden");
        System.out.println("Last element of LinkedList: " + countries.get(countries.size()-1));
        System.out.println("Element by index: " + countries.get(1));
        System.out.println("LinkedList elements: " + countries + " size = " + countries.size());
        System.out.println("Does LinkedList contain United Kingdom? " + countries.contains("United Kingdom"));
        System.out.println("Removed element by index: " + countries.remove(5));
        System.out.println("Does LinkedList contain United Kingdom? " + countries.contains("United Kingdom"));
        System.out.println("LinkedList elements: " + countries + ", size = " + countries.size());
        System.out.println("Is LinkedList empty? "+ countries.isEmpty());
        countries.clear();
        System.out.println("Is LinkedList empty? "+ countries.isEmpty());


    }
}
