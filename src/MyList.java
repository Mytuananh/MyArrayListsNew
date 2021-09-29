public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void addElement(int index, E element) {
        Object[] elementsNew = new Object[elements.length +1];
        for (int i = 0; i < index; i++) {
            elementsNew[i] = elements[i];
        }
        for (int i = index; i < elements.length; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        elements = elementsNew;
    }
    public void removeElement(int index) {
        Object[] elementsNew = new Object[elements.length - 1];
        for (int i = 0; i < index; i++) {
            elementsNew[i] = elements[i];
        }
        for (int i = index; i < elements.length; i++) {
            elementsNew[i] = elements[i + 1];
        }
        elements = elementsNew;
    }
    public int Size() {
        int  count = 0;
        for (int i = 0; i < elements.length; i++) {
            count++;
        }
        return count;
    }

}
