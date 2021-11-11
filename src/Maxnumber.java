import java.util.*;
import java.util.Scanner;
import java.lang.Comparable;

public class Maxnumber {
    public static void main(String[] args){
        Maxnumber obj = new Maxnumber();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enters number to compare :");
        Integer a= scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
        int index = scanner.nextInt();

        obj.max(a,b,c,index);
    }
    /*
    * Genric method for taking input of different data types as input and compare
    * */

    public <T extends Comparable<T>> T max(T a,T b,T c, int index){
        ArrayList<T> arrayList = new ArrayList<T>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        T maximum = arrayList.get(0);
        //index =index+1;

        for (int i =0;i<=arrayList.size()-1;i++) {                  //for checking maximum value and changing position of max value to o index
            if (arrayList.get(i).compareTo(maximum)>0)
            {
                maximum= arrayList.get(i);
                arrayList.set(i,arrayList.get(index));
                arrayList.set(index,maximum);
            }
        }
        System.out.println(arrayList);
        return arrayList.get(index);                      //method index of maximum number by method
    }
}
