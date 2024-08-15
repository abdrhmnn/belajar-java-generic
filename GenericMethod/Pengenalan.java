package GenericMethod;

public class Pengenalan {
  
  public static void main(String[] args) {
    Pengenalan pengenalan = new Pengenalan();

    String[] names = { "1", "2", "3" };
    Integer[] angka = { 1, 2, 3 };

    System.out.println(pengenalan.<String>hitung(names));
    System.out.println(pengenalan.<Integer>hitung(angka));
    System.out.println(pengenalan.hitung(angka));
  }

  public <T> int hitung(T[] hasil){
    return hasil.length;
  } 
}
