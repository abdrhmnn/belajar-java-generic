package ExampleCovaAndContraVariant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pengenalan {
  // copies any kind of numbers from one list into another list. It only gets items from the source
  // and it only puts items in the destiny

  public static void main(String[] args) {
    List<Integer> myInts = Collections.unmodifiableList(Arrays.asList(1,2,3,4));
    List<Double> myDoubles = Collections.unmodifiableList(Arrays.asList(1.5,22.2,3.1,4.2));
    List<Object> myObjs = new ArrayList<Object>();
    copy(myInts, myObjs);
    copy(myDoubles, myObjs);
  }

  public static void copy(List<? extends Number> source, List<? super Number> destiny) {
      for(Number number : source) {
      destiny.add(number);
    }
  }
}
