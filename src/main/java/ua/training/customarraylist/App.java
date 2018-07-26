package ua.training.customarraylist;

public class App {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        for (Integer i : list) {
            System.out.println(i);
        }

        list.set(1, 500);
        System.out.println(list.get(1));


        System.out.println(list.size());
    }
}
