import java.util.ArrayList;

public class PatternedList
{
    /**
        Umit Tas, October 4, 2025
        This method iterate bingo pattern numbers to generate desired bingo ball draws
        based on number of the bingo card and pattern.

        In between, there will be randomized numbers from 1 to 75 to force the pattern with given number of balls
        in example;
        if bingo card consist of : 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24
        and Bingo pattern is like following: 1,2,3,4,5,6,7,8

        8-ball draw should give the highest award in the game and the bingo ball draw list will be like
        Bingo pattern numbers, some random numbers not in bingo card, and at last part of the list will be remaining bingo card numbers.
        So, Method will return 2-dimensional ArrayList to
        fulfill all ball draw pattern testing requirement.
     */
    public static ArrayList<ArrayList<Integer>> patternedFullList(ArrayList<Integer> bcards, ArrayList<Integer> patterns, ArrayList<Integer> randomizedListWithPattern){

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        int num = randomizedListWithPattern.get(patterns.size());

        ArrayList<Integer> firstList = new ArrayList<>(randomizedListWithPattern);
        list.add(firstList);
        //Debug purpose.
        System.out.println("\n" + patterns.size()+" Balls Bingo Draw with "+ randomizedListWithPattern.size() +" Balls : " + randomizedListWithPattern.toString());

        for(int iii=patterns.size(); iii<(randomizedListWithPattern.size()-bcards.size()); iii++){

            //if this is the first ArrayList, add it as it is because that is
            // the complete list with Maximum award and will be used as entry  point
            int tempNum = randomizedListWithPattern.get(iii);

            randomizedListWithPattern.remove((Integer) tempNum);
            randomizedListWithPattern.addFirst(tempNum);

            ArrayList<Integer> newList = new ArrayList<>(randomizedListWithPattern);

            list.addLast(newList);

            //list.addLast(randomizedListWithPattern.);

            //Debug purpose.
            System.out.println((iii+1)+" balls Bingo Draw with "+ randomizedListWithPattern.size() +" Balls : " + randomizedListWithPattern.toString());
        }
        return list;
    }
}
