package com.TomaszKarman.malze;


import java.util.List;

public class Crud {


    public List<Malza>listaMalzy;

    public int size() {

        int size = listaMalzy.size();
        return size;
    }


    public boolean isEmpty() {

        if (listaMalzy.size() < 1)
            return true;
        else
            return false;
    }

    public boolean contains(Malza o) {
        for (Malza m : listaMalzy) {
            if (o == m)
                return true;
        }
        ;
        return false;
    }

    public boolean add(Malza malza) {
        try {
            listaMalzy.add(malza);
        } catch (Exception x) {
            return false;
        }
        return true;
    }

    public boolean remove(Malza malza) {
        try {
            listaMalzy.remove(malza);
        } catch (Exception x) {
            return false;
        }
        return true;
    }

    public boolean update(Malza malza) {
        try {
            int last=listaMalzy.size() -1;
            listaMalzy.get(last).setAge(1);
        } catch (Exception x) {
            return false;
        }
        return true;
    }


//
//        public int size(List<Malza>listaMalzy) {
//
//            int size = listaMalzy.size();
//            return size;
//        }
//
//        public boolean isEmpty(List<Malza>listaMalzy) {
//
//            if (listaMalzy.size()<1)
//                return true;
//            else
//                return false;
//        }
//
//        public boolean contains(Malza o, List<Malza>listaMalzy) {
//            for( Malza m : listaMalzy){
//                if (o == m)
//                    return true;
//            };
//            return false;
//        }
//
//        public Iterator<Malza> iterator() {
//            return null;
//        }
//
//        public Object[] toArray() {
//            return new Object[0];
//        }
//
//        public <T> T[] toArray(T[] a) {
//            return null;
//        }
//
//        public boolean add(Malza malza, List<Malza>listaMalzy) {
//            try {
//                listaMalzy.add(malza);
//            }
//            catch (Exception x) {
//                return false;
//            }
//            return true;
//        }
//
//        public boolean remove(Malza malza, List<Malza>listaMalzy) {
//            try {
//                listaMalzy.remove(malza);
//            }
//            catch (Exception x) {
//                return false;
//            }
//            return true;
//        }
//
//        public boolean containsAll(Collection<?> c) {
//            return false;
//        }
//
//        public boolean addAll(Collection<? extends Malza> c) {
//            return false;
//        }
//
//        public boolean addAll(int index, Collection<? extends Malza> c) {
//            return false;
//        }
//
//        public boolean removeAll(Collection<?> c) {
//            return false;
//        }
//
//        public boolean retainAll(Collection<?> c) {
//            return false;
//        }
//
//        public void clear() {
//
//        }
//
//        public Malza get(int index) {
//            return null;
//        }
//
//        public Malza set(int index, Malza element) {
//            return null;
//        }
//
//        public void add(int index, Malza element) {
//
//        }
//
//        public Malza remove(int index) {
//            return null;
//        }
//
//        public int indexOf(Object o) {
//            return 0;
//        }
//
//        public int lastIndexOf(Object o) {
//            return 0;
//        }
//
//        public ListIterator<Malza> listIterator() {
//            return null;
//        }
//
//        public ListIterator<Malza> listIterator(int index) {
//            return null;
//        }
//
//        public List<Malza> subList(int fromIndex, int toIndex) {
//            return null;
//        }
    }




