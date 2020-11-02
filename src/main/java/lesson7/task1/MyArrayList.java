package lesson7.task1;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {
    @Override
    public T get(int index) {

        try {
            return super.get(index);
        } catch (IndexOutOfBoundsException oboe) {
            return null;
        }
    }

    @Override
    public void add(int index, Object element) {
        super.add(index, (T) element);
        System.out.println(element);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

}

