public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>(13);
        integerMyList.addElement(3, 9);
        integerMyList.removeElement(3);
        System.out.println(integerMyList.Size());
    }
}
