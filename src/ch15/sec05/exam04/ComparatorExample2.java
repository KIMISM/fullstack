package ch15.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample2 {
    public static void main(String[] args) {
        // 익명구현 객체로 정해지지 않은 int배열을 정렬(sort)해 줌
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new Comparator<Fruit>() {
            
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return Integer.compare(o1.price, o2.price);
            }

//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
        });

        treeSet.add(new Fruit("포도",3000));
        treeSet.add(new Fruit("수박",10000));
        treeSet.add(new Fruit("딸기",6000));
        treeSet.add(new Fruit("복숭아",9000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
