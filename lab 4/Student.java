class Student{
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(11);
        queue.add("S1");
        queue.add("S2");
        queue.add("S3");
        queue.add("S4");
        queue.add("S5");
        System.out.println(queue.first());
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());
        System.out.println(queue.toString());
    }
}