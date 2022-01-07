public class Mine {
    public static void main(String[] args){
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(3);
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(7,6);
       list.sort();
        list.printList();
    }
}
