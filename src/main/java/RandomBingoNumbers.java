import java.util.ArrayList;
import java.util.Random;

public class RandomBingoNumbers {
    /**
     * Umit Tas, October 5, 2025
     * randomNumbers method takes 2 parameters in and gives 1 Arraylist<Integer> back
     * contains 75 numbers, checks the number is in Bingocard or not, if it's not in bingo card,
     * takes picked number out from allNumbers arrayList and
     * reduces number of array to ease the process of random number generation
     * @param allNumbers
     * @param bingoCardNumbers
     * @return randomNumbers
     *
     */
    public static ArrayList<Integer> randomNumbers(ArrayList<Integer> allNumbers, ArrayList<Integer> bingoCardNumbers)
    {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random1 = new Random();

        //This Method is creating Random numbers ArrayList with no Bingo card numbers in it
        int counter=74;
        while(counter>=bingoCardNumbers.size()){
            int randomIndex = random1.nextInt(0,allNumbers.size());

            int num = allNumbers.get(randomIndex);
            if(!bingoCardNumbers.contains(num)){
                randomNumbers.add(allNumbers.get(randomIndex));
                allNumbers.remove(randomIndex);
                counter--;

                //Debug purpose,
                //ArrayList<Integer> sortedRandomNumbers = new ArrayList<>(randomNumbers);
                //Collections.sort(sortedRandomNumbers);
                //System.out.println("All Numbers Size: "+allNumbers.size()+" - Random Numbers: " + randomNumbers.size() +" - " + randomNumbers.toString());
            }
        }

        return randomNumbers;
    }
}
