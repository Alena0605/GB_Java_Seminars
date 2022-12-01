package Seminar2;

public class Wrappers {
    public static void main(String[] args) {
        Long referenceSum = 0L;
        // Оберткам можно присвоить значение null
        // referenceSum = null;

        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            referenceSum++;
        }
        System.out.println("С ссылочным: " + (System.currentTimeMillis() - start));

        long primitiveSum = 0L;

        start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            primitiveSum++;
        }
        System.out.println("С примитивом: " + (System.currentTimeMillis() - start));
    }
}
