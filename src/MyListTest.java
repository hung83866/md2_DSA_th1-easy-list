public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println("(4) = "+listInteger.get(4));
        System.out.println("(1) = "+listInteger.get(1));
        System.out.println("(0) = "+listInteger.get(0));
        listInteger.add(23);
        listInteger.add(34);
        System.out.println("(-1)="+listInteger.get(-1));
    }
}
