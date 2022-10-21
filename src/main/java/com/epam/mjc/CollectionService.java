package com.epam.mjc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream()
                .max((numFirst, numSecond) -> numFirst.compareTo(numSecond));
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(everyList -> everyList.stream())
                .min((numFirst, numSecond) -> numFirst.compareTo(numSecond));
    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0, (acc, num) -> (acc + num));
    }
}
