package ua.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        List<Integer> list = Arrays.asList(8, 2, 3, 6, 8, 1, 2, 6, 7, 2);
        Map<Integer, Integer> statistic = counter.countSameElements(list);
        counter.printStatistic(statistic);
    }

    private Map<Integer, Integer> countSameElements(List<Integer> integers) {
        Map<Integer, Integer> statistic = new HashMap<>();
        for (Integer element : integers) {
            statistic.put(element, statistic.containsKey(element) ? statistic.get(element) + 1 : 1);
        }
        return statistic;
    }

    private void printStatistic(Map<Integer, Integer> statistic) {
        statistic.forEach((key, value) -> System.out.println(key + "-" + value));
    }
}
