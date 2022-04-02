import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private E elements[];

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public E[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void add(int index, E e) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            size++;
            if (size == elements.length) {
                ensureCapa();
            }
            for (; index < size; index += 2) {
                E temp = elements[index];
                elements[index] = e;
                e = elements[index + 1];
                elements[index + 1] = temp;
            }
        }
    }

    public E remove(int index) {
        E removeValue = null;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not found");
        } else {
            removeValue = elements[index];
            for (; index <size ; index++) {
              elements[index]= elements[index+1];
            }
            size--;
        }
        return removeValue;
    }

    public int size() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null)
                size++;
        }
        return size;
    }

    public MyList<E> clone() {
        MyList<E> list = new MyList<>();
        for (int i = 0; i < size; i++) {
            list.add((E) elements[i]);
        }
        return list;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                index = i;
            }
        }
        if (index == -1 ){
            System.out.println("không có trong mảng");
        }
        return index;
    }

    public void render() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(this.get(i));
        }
    }
    public void Clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
}


