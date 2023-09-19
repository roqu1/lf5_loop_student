package numberAnalyser;

import java.util.ArrayList;
import java.util.Objects;

public class NumberAnalyser {

    public int getGGT(int number1, int number2) {
        ArrayList<Integer> dividedNumber1 = new ArrayList<Integer>();
        ArrayList<Integer> dividedNumber2 = new ArrayList<Integer>();
        int finalResponse = 0;
        for(int i = 1; i<=100;i++) {
            double result = number1 % i;
            double result2 = number2 % i;
            if (result == 0) {
                // add the i to the array
               dividedNumber1.add(i);
            }
            if (result2 == 0) {
                dividedNumber2.add(i);
            }
        }

        for(int i = 0; i<dividedNumber1.size();i++){
            for(int j = 0; j<dividedNumber2.size();j++){
                if(Objects.equals(dividedNumber1.get(i), dividedNumber2.get(j))){
                    finalResponse = dividedNumber1.get(i);
                }
            }
        }


        return finalResponse;
    }

    public boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            number = number % i;
            if (number == 0) {
                return false;
            }
        }
        return true;
    }

    public String getPrimeNumbers(int start, int end) {
        return "";
    }

    public int getChecksum(int number) {
        return 0;
    }

    public boolean isHappyNumber(int number) {
        return false;
    }

    public boolean isPerfectNumber(int number) {
        return false;
    }
}
