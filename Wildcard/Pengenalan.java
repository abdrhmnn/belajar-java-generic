package Wildcard;

public class Pengenalan<T> {
  // tidak memperdulikan generic parameter type

  // jadi wildcard ini berguna ketika kita hanya ingin nerima dan memproses data saja
  // tidak disarankan untuk set ataupun konversi type data

  public static void main(String[] args) {
    System.out.println(new Pengenalan<String>());
    System.out.println(new Pengenalan<Integer>());
    System.out.println(new Pengenalan<Character>());
  }

  public void sayHello(Pengenalan<?> pengenalan){

  }
}
