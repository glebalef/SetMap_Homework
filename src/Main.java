import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1
        printOnlyOdd(new ArrayList<>(List.of(9, 1, 2, 3, 4, 0, 77, 5, 6, 7)));

        // 2
        printOnlyUniqueEven(new ArrayList<>(List.of(1, 9, 88, 0, 4, 4, 5, 5, 6, 7)));

        // 3
        printOnlyUniqueWords(new ArrayList<>(List.of("машина", "квартира", "дача", "квартира")));

        // 4
        printNumberOfRepeats(new ArrayList<>(List.of("машина", "квартира", "дача", "квартира", "дача", "дача", "дача")));

    }


    // Задание 1
    public static void printOnlyOdd(ArrayList<Integer> nums) {
        List<Integer> numsNew = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                numsNew.add(num);
            }
        }
        System.out.println(numsNew);
    }

    // Задание 2
    public static void printOnlyUniqueEven(ArrayList<Integer> nums) {
        Set<Integer> numsNew = new HashSet<>();
        Collections.sort(nums);
        for (Integer num : nums) {
            if (num % 2 == 0 || num == 0) {
                numsNew.add(num);
            }
        } System.out.println(numsNew);
    }

    // Задание 3
    public static void printOnlyUniqueWords(ArrayList<String> words) {
        Set<String> wordsNew = new HashSet<>();
        for (String word : words) {
            wordsNew.add(word);
        }
        System.out.println(wordsNew);
    }

    // Задание 4
    public static void printNumberOfRepeats(ArrayList<String> words) {
        Map<String,Integer> counter = new HashMap<>();
        for (String s : words) {
            if (!counter.containsKey(s)) {
                counter.put(s, 1);
            } else {
                counter.put(s,counter.get(s)+1);
            }
        }
        System.out.println(counter.values());
    }
}




