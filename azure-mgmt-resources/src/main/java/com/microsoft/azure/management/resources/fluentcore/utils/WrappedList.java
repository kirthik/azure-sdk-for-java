package com.microsoft.azure.management.resources.fluentcore.utils;

import java.util.*;

public class WrappedList<SourceT, WrappedT> implements List<WrappedT> {
    private List<SourceT> sourceList;
    private List<WrappedT> wrappedList;
    private Transformer<SourceT, WrappedT> transformer;

    public WrappedList(List<SourceT> sourceList, Transformer<SourceT, WrappedT> transformer) {
        this.sourceList = sourceList;
        this.wrappedList = new ArrayList<>();
        this.transformer = transformer;
    }

    @Override
    public int size() {
        return sourceList.size();
    }

    @Override
    public boolean isEmpty() {
        return sourceList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<WrappedT> iterator() {
        return new WrappedListIterator(0);
    }

    @Override
    public Object[] toArray() {
        Object [] array = new Object[size()];
        int i = 0;
        for (WrappedT item: this) {
            array[i] = item;
            i++;
        }
        return array;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (size() > a.length) {
            a =  (T[]) new Object[size()];
        }

        int i = 0;
        for (WrappedT item: this) {
            a[i] = (T)item;
            i++;
        }

        for (; i < a.length; i++) {
            a[i] = null;
        }
        return a;
    }

    @Override
    public WrappedT get(int index) {
        while (index >= wrappedList.size() && index < sourceList.size()) {
            SourceT source = sourceList.get(index);
            wrappedList.add(transformer.transform(source));
        }

        return wrappedList.get(index);
    }

    @Override
    @SuppressWarnings("unchecked")
    public int indexOf(Object o) {
        WrappedT o1 = (WrappedT)o;
        int index = 0;
        for (WrappedT item : this) {
            if (item == o1) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public int lastIndexOf(Object o) {
        WrappedT o1 = (WrappedT)o;
        int index = size() - 1;
        while (index >= 0) {
            if (get(index) == o1) {
                break;
            }
        }
        return index;
    }

    @Override
    public boolean add(WrappedT wrapped) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends WrappedT> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends WrappedT> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public WrappedT set(int index, WrappedT element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, WrappedT element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public WrappedT remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<WrappedT> listIterator() {
        return new WrappedListIterator(0);
    }

    @Override
    public ListIterator<WrappedT> listIterator(int index) {
        return new WrappedListIterator(index);
    }

    @Override
    public List<WrappedT> subList(int fromIndex, int toIndex) {
        List<WrappedT> list = new ArrayList<>();
        for(int index = fromIndex; index <= toIndex; index++) {
            list.add(get(index));
        }
        return list;
    }

    class WrappedListIterator implements ListIterator<WrappedT> {
        private ListIterator<SourceT> sourceListIterator;

        public WrappedListIterator(int index) {
            sourceListIterator = sourceList.listIterator(index);
        }

        @Override
        public boolean hasNext() {
            return sourceListIterator.hasNext();
        }

        @Override
        public WrappedT next() {
            int index = nextIndex();
            sourceListIterator.next();
            return get(index);
        }

        @Override
        public boolean hasPrevious() {
            return sourceListIterator.hasPrevious();
        }

        @Override
        public WrappedT previous() {
            int index = previousIndex();
            sourceListIterator.previous();
            return get(index);
        }

        @Override
        public int nextIndex() {
            return sourceListIterator.nextIndex();
        }

        @Override
        public int previousIndex() {
            return sourceListIterator.previousIndex();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(WrappedT wrapped) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void add(WrappedT wrapped) {
            throw new UnsupportedOperationException();
        }
    }

    public interface Transformer<SourceT, WrappedT> {
        WrappedT transform(SourceT source);
    }
}