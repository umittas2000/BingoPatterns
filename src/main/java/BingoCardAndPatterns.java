import java.util.*;

public class BingoCardAndPatterns {
    public static void main(String[] args) {
        ArrayList<Integer> allNumbers = new ArrayList<>(AllNumbers.allNumbers());
        ArrayList<Integer> bingoCardNumbers = new ArrayList<>(BingoHelpers.generateBingoCardNumbers());
        ArrayList<Integer> bingoPatternNumbers = new ArrayList<>(BingoHelpers.generateBingoPatternNumbers());
        ArrayList<Integer> randomNumbers = new ArrayList<>(RandomBingoNumbers.randomNumbers(allNumbers, bingoCardNumbers));

        /*
            Adding bingo patterns into randomNumber list's first line
            and at the same time removing the pattern number from bingo card list
            So, There will be 2 different list out of bingo card
        */


        //Add bingo pattern into randomNumber list to the first
        for(int ii=bingoPatternNumbers.size()-1; ii>=0; ii--){
            int num = bingoPatternNumbers.get(ii);
            randomNumbers.addFirst(num);
            bingoCardNumbers.remove((Integer) num);
        }

        //Add remaining Bingo card number list into randomNumber list to the last
        for(int ii=0; ii<bingoCardNumbers.size(); ii++){
            int num = bingoCardNumbers.get(ii);
            randomNumbers.addLast(num);
        }

        //Debug purpose, Final number with Pattern numbers
        //System.out.println("Complete Random Numbers included patterned numbers and remaining bingo card, Size: "+ randomNumbers.size() +"\n" + randomNumbers.toString());

        ArrayList<ArrayList<Integer>> fullList = new ArrayList<ArrayList<Integer>>(PatternedList.patternedFullList(bingoCardNumbers, bingoPatternNumbers, randomNumbers));

        System.out.println("\nBingo card numbers - all");
        System.out.println(allNumbers.toString());
        System.out.println("\nBingo Card numbers - without pattern numbers");
        System.out.println(bingoCardNumbers.toString());
        System.out.println("\nBingo card numbers - Pattern numbers only");
        System.out.println(bingoPatternNumbers.toString());
    }
}
