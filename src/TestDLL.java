public class TestDLL
{
    public static void main(String[] args) {

        // Integer test
        SortedDoubleLinkedList<Integer> sdll = new SortedDoubleLinkedList<>();
        sdll.add(234);
        sdll.add(3455);
        sdll.add(123);
        sdll.add(5000);
        sdll.add(234);
        sdll.add(0);

        System.out.println("List in  order:");
        System.out.println(sdll);

        // test contains()
        System.out.println("List contains item value of '3455' = " + sdll.contains(3455));

        // test remove()
        System.out.println("\nRemoving item 3455");
        sdll.remove(3455);

        System.out.println("List contains item value of '3455' = " + sdll.contains(3455));
        System.out.println("List in order:");
        System.out.println(sdll);

        // test getfirst() & getLast()
        System.out.println("First: " + sdll.getFirst());
        System.out.println("Last: " + sdll.getLast());

        // test Strings
        SortedDoubleLinkedList<String> sdll2 = new SortedDoubleLinkedList<>();
        sdll2.add("Fish");
        sdll2.add("Meat");
        sdll2.add("Fruit");
        System.out.println("\nList of strings");
        System.out.println(sdll2);
        System.out.println("List contains 'Fish' = " + sdll2.contains("Fish"));
        System.out.println();

        // test Doubles
        SortedDoubleLinkedList<Double> dub = new SortedDoubleLinkedList<>();
        dub.add(120.003);
        dub.add(3.1415967);
        dub.add(27.3);
        System.out.println("List of doubles:");
        System.out.println(dub);


        // test object
        SortedDoubleLinkedList<Inventory> objects = new SortedDoubleLinkedList<>();
        objects.add(new Inventory("Quixotic Journey", 10, 20.00f));
        objects.add(new Inventory("Purple Suit", 5, 199.99f));
        objects.add(new Inventory("Alphabet Soup", 100, 0.99f));
        objects.add(new Inventory("Maple Syrup",20, 5.99f));

        System.out.println("Object list:");
        System.out.println(objects);
        System.out.println("Object at index 0 = \n" + objects.get(0));
        System.out.println("Remove object at index 1");
        objects.remove(objects.get(1));
        System.out.println(objects);
    }

}