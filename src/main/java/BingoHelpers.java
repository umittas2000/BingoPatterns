import java.util.ArrayList;

public class BingoHelpers {
    public static ArrayList<Integer> generateBingoCardNumbers() {
        ArrayList<Integer> bingoCardNumbers = new ArrayList<>();

        for(int k=1;k<25;k++){
            bingoCardNumbers.add(k);
        }

        return bingoCardNumbers;
    }

    public static ArrayList<Integer> generateBingoPatternNumbers(){
        ArrayList<Integer> bingoPatternNumbers = new ArrayList<>();
        //This part is adding sample patterned numbers to calculate pattern into generated ball draws.
        //Note: Following numbers must be in Bingo card as well. Otherwise app will not give correct output
        bingoPatternNumbers.add(1);
        bingoPatternNumbers.add(2);
        bingoPatternNumbers.add(3);
        bingoPatternNumbers.add(4);
        bingoPatternNumbers.add(5);
        bingoPatternNumbers.add(6);
        bingoPatternNumbers.add(7);
        bingoPatternNumbers.add(8);

        return bingoPatternNumbers;
    }

    //Maybe it can be used in the future
    public static ArrayList<Integer> concatArrayLists(ArrayList<Integer> first, ArrayList<Integer> second){
        ArrayList<Integer> concatenated = new ArrayList<>();
        concatenated.addAll(first);
        concatenated.addAll(second);

        return concatenated;
    }
}
