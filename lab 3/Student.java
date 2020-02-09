class Student{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.println(list.get(2));
        System.out.println(list.getIndex(4));
        System.out.println(list.sum());
        System.out.println(list.isEmpty());
        System.out.println(list.toString());
        
    }
}