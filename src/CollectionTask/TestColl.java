package CollectionTask;

import java.util.*;
import java.util.stream.IntStream;

public class TestColl {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        IntStream.range(0,100000).forEach(x->num.add((x)));

        Random rand1 = new Random();
        ArrayList<Integer> search = new ArrayList<>();
        IntStream.range(0,1000).forEach(x->search.add(rand1.nextInt(999999)));

        Random rand2 = new Random();
        ArrayList<Integer> dell = new ArrayList<>();
        IntStream.range(0,1000).forEach(x->dell.add(rand2.nextInt(88888)));

        LinkedList<Integer> linkedL = new LinkedList<>();
        ArrayList<Integer> arrayL = new ArrayList<>();
        HashSet<Integer> hashS = new HashSet<>();
        TreeSet<Integer> treeS = new TreeSet<>();
        HashMap<Integer, Integer> hashM = new HashMap<>();
        TreeMap<Integer, Integer> treeM = new TreeMap<>();
        long time;

        System.out.println("LinkedList");
        time = System.currentTimeMillis();
        linkedL.addAll(num);
        System.out.println("Вставка: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer x : search)
            linkedL.contains(x);
        System.out.println("Поиск: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        linkedL.removeAll(dell);
        System.out.println("Удаление: " + (System.currentTimeMillis() - time));

        System.out.println("ArrayList");
        time = System.currentTimeMillis();
        arrayL.addAll(num);
        System.out.println("Вставка: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer x : search)
            arrayL.contains(x);
        System.out.println("Поиск: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        arrayL.removeAll(dell);
        System.out.println("Удаление: " + (System.currentTimeMillis() - time));

        System.out.println("HashSet");
        time = System.currentTimeMillis();
        hashS.addAll(num);
        System.out.println("Вставка: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer x : search)
            hashS.contains(x);
        System.out.println("Поиск: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        hashS.removeAll(dell);
        System.out.println("Удаление: " + (System.currentTimeMillis() - time));

        System.out.println("TreeSet");
        time = System.currentTimeMillis();
        treeS.addAll(num);
        System.out.println("Вставка: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer x : search)
            treeS.contains(x);
        System.out.println("Поиск: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        treeS.removeAll(dell);
        System.out.println("Удаление: " + (System.currentTimeMillis() - time));

        System.out.println("HashMap");
        time = System.currentTimeMillis();
        for (Integer x : num)
            hashM.put(x,x);
        System.out.println("Вставка: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer x : search)
            hashM.containsValue(x);
        System.out.println("Поиск: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer x : dell)
            hashM.remove(x);
        System.out.println("Удаление: " + (System.currentTimeMillis() - time));

        System.out.println("TreeMap");
        time = System.currentTimeMillis();
        for (Integer x : num)
            treeM.put(x, x);
        System.out.println("Вставка: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer x : search)
            treeM.containsValue(x);
        System.out.println("Поиск: " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        for (Integer x : dell)
            treeM.remove(x);
        System.out.println("Удаление: " + (System.currentTimeMillis() - time));
    }
}