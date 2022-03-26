package ru.javabegin.training.fastjava2.shop33.utilits;


import java.util.Arrays;

public class DynaArrayTest {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray(0);

        System.out.println(Arrays.toString(dynaArray.getResult()));
        System.out.println(dynaArray.getCount());
        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(2);
        dynaArray.add(3);
        dynaArray.add(4);
        dynaArray.add(5);
        System.out.println(dynaArray.getCount());

        dynaArray.add(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});

        DynaArray dynaArray2 = new DynaArray();
        dynaArray2.add(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1, 0});
        dynaArray.add(dynaArray2);

        dynaArray.add(99);
        dynaArray.add(98);
        dynaArray.add(97);

        // [0, 1, 2, 3, 4, 5, 9, 8, 7, 6, 5, 4, 3, 2, 1, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 99, 98, 97]
        System.out.println(dynaArray.asString());

        // ----- remove -------
        DynaArray dynaArray3 = new DynaArray();
        dynaArray3.add(0);
        dynaArray3.add(1);
        dynaArray3.add(2);
        dynaArray3.add(3);

        System.out.println(dynaArray3.asString());

        dynaArray3.remove(5);
        // [0, 1, 2, 3]
        System.out.println(dynaArray3.asString());

        dynaArray3.remove(0);
        // [1, 2, 3]
        System.out.println(dynaArray3.asString());

        dynaArray3.remove(2);
        // [1, 3]
        System.out.println(dynaArray3.asString());

        dynaArray3.remove(1);
        // [3]
        System.out.println(dynaArray3.asString());

        // --------- size --------------
        System.out.println(dynaArray.size());
        System.out.println(dynaArray2.size());
        System.out.println(dynaArray3.size());

        // -------- contains -------------
        System.out.println(dynaArray.onString(dynaArray.contains(0)));
        System.out.println(dynaArray.onString(dynaArray.contains(2)));

        System.out.println(dynaArray.onString(dynaArray.contains(100)));
        System.out.println(dynaArray.onString(dynaArray.contains(-3)));

        //-------- clear ------------
        System.out.println(dynaArray.asString());
        dynaArray.clear();
        System.out.println(dynaArray.asString());
    }

}
