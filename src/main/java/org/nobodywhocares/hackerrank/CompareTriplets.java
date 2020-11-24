/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nobodywhocares.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author noahn
 */
public class CompareTriplets {

    public static final int ALICE_SCORE_IDX = 0;
    public static final int BOB_SCORE_IDX = 1;
    
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList(2);
        scores.add(ALICE_SCORE_IDX, 0);
        scores.add(BOB_SCORE_IDX, 0);
        for (int idx = 0; idx < 3; idx++) {
            if (a.get(idx) > b.get(idx)) {
                scores.set(ALICE_SCORE_IDX, scores.get(ALICE_SCORE_IDX)+1);
            } else if (a.get(idx) < b.get(idx)) {
                scores.set(BOB_SCORE_IDX, scores.get(BOB_SCORE_IDX)+1);
            }
        }
        return scores;
    }
    
    public static void main(String[] args) {
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = compareTriplets(a, b);

            bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                    + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();

        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

}
