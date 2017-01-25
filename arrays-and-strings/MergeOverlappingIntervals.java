package com.javierarboleda.codingchallenges.challenges.arrays_and_strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created on 1/23/17.
 */

public class MergeOverlappingIntervals {

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        if (intervals == null || intervals.isEmpty()) {
            return intervals;
        }

        ArrayList<Interval> results = new ArrayList<>();

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval x, Interval y) {
                return x.start - y.start;
            }
        });

        int i = 1;
        Interval current = intervals.get(0);
        Interval interval;

        while (i < intervals.size()) {
            interval = intervals.get(i);

            if (isOverlapping(current, interval)) {
                current = getNewMergedInterval(current, interval);
            } else {
                results.add(current);
                current = interval;
            }

            i++;
        }

        results.add(current);

        return results;
    }

    public static  boolean isOverlapping(Interval x, Interval y) {

        if ((y.start >= x.start && y.start <= x.end) ||
                (y.end >= x.start && y.end <= x.end)) {
            return true;
        }

        return false;
    }

    public static  Interval getNewMergedInterval(Interval x, Interval y) {
        return new Interval(
                x.start < y.start ? x.start : y.start,
                x.end > y.end ? x.end : y.end
        );
    }

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(51, 92));
        intervals.add(new Interval(30,66));
        intervals.add(new Interval(4,4));
        intervals.add(new Interval(29,92));

        ArrayList<Interval> result = merge(intervals);

        System.out.println(result.toString());
    }

    public static class Interval {
             int start;
             int end;
            Interval() { start = 0; end = 0; }
             Interval(int s, int e) { start = s; end = e; }
         }

}
