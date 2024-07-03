import java.util.ArrayList;

public class konklom02 {
    static void twoLoopPN(int n){
        int inputNumber = n;
        float numberLimiter = 1;
        int spaceCriteria = inputNumber - 1;
        String lastFloor = "1";

        if (inputNumber == 1){
            System.out.print("1");
        } else {
            for (int loop = 0; loop < inputNumber; loop++){
                String myrows = " ";
                int numberCount = 0;
                int startNumber = 1;
                for (int i = 0; i < inputNumber*2 - 1; i++){
                    if (i == 0){
                        lastFloor += 11;
                    }
                    if (i < spaceCriteria){
                        myrows += " ";
                    }
                    else {
                        if (numberCount < Math.ceil(numberLimiter/2)){
                            myrows += startNumber;
                            startNumber += 1;
                            numberCount += 1;
                        } else if (numberCount < numberLimiter) {
                            if (numberCount == Math.ceil(numberLimiter/2)){
                                startNumber -= 1;
                            }
                            startNumber -= 1;
                            myrows += startNumber;
                            numberCount += 1;
                        }
                    }
                }
                System.out.print(myrows);
                System.out.println();
                spaceCriteria -= 1;
                numberLimiter += 2;
            }
            System.out.println(lastFloor);
        }
    }
    static void arraySorter(ArrayList<Integer> list, String mode){
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        sortedArray.addAll(list);
        if (mode == "asc"){
            for (int i = 0; i < list.size(); i++){
                ArrayList<Integer> storedArray = new ArrayList<Integer>();
                int trueCount = 0;
                int repeatCount = 0;
                for (int j = 0; j < list.size(); j++){
                    Object A = list.get(i);
                    int a = (int) A;
                    Object B = list.get(j);
                    int b = (int) B;
                    if (a - b > 0){
                        storedArray.add(1);
                    } else if (a - b < 0){
                        storedArray.add(0);
                    } else if (a - b == 0){
                        repeatCount += 1;
                    }
                }
                for (int k = 0; k < storedArray.size(); k++){
                    Object number = storedArray.get(k);
                    int n = (int) number;
                    trueCount += n;
                }
                if (repeatCount == 0) {
                    Object nowNumber = list.get(i);
                    int nN = (int) nowNumber;
                    sortedArray.set(trueCount, nN);
                } else {
                    Object nowNumber = list.get(i);
                    int nN = (int) nowNumber;
                    for (int next = 0; next < repeatCount; next++){
                        sortedArray.set(trueCount + next, nN);
                    }
                }
            }
        } else if (mode == "desc"){
            for (int i = 0; i < list.size(); i++){
                ArrayList<Integer> storedArray = new ArrayList<Integer>();
                int trueCount = 0;
                int repeatCount = 0;
                Object A = list.get(i);
                int a = (int) A;
                for (int j = 0; j < list.size(); j++){
                    Object B = list.get(j);
                    int b = (int) B;
                    if (a - b < 0){
                        storedArray.add(1);
                    } else if (a - b > 0){
                        storedArray.add(0);
                    } else if (a - b == 0){
                        repeatCount += 1;
                    }
                }
                for (int k = 0; k < storedArray.size(); k++){
                    Object number = storedArray.get(k);
                    int n = (int) number;
                    trueCount += n;
                }
                if (repeatCount == 0) {
                    Object nowNumber = list.get(i);
                    int nN = (int) nowNumber;
                    sortedArray.set(trueCount, nN);
                } else {
                    Object nowNumber = list.get(i);
                    int nN = (int) nowNumber;
                    for (int next = 0; next < repeatCount; next++){
                        sortedArray.set(trueCount + next, nN);
                    }
                }
            }
        }
        System.out.println(sortedArray);
    }
    public static void main(String[] args) {
        System.out.println("Pyramid Number with 2 loop");
        twoLoopPN(9);
        System.out.println("--------------------------");
        System.out.println("Array Sorter");
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        int numberLimit = 20;
        for (int test = 0; test < numberLimit; test++){
            int randomNum = (int)(Math.random() * 11);
            numberList.add(randomNum);
        }
        System.out.println("This is the Array you want to sort");
        System.out.println(numberList);
        System.out.println("");
        System.out.println("This is the ASC Array");
        arraySorter(numberList, "asc");
        System.out.println("----------------------------------------------------------------");
        System.out.println("This is the DESC Array");
        arraySorter(numberList, "desc");
    }
}