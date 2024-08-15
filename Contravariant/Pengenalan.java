package Contravariant;

public class Pengenalan<T> {
  // yaitu subtitusi generic type supertype dari parent ke child

  // contravariant bisa write and read, cuman hati" ketika melakukan read data kalo parent nya punya bnyk child

  private T hasil;
  
  public T getHasil() {
    return hasil;
  }

  public void setHasil(T hasil) {
    this.hasil = hasil;
  }

  public void sayHello(Pengenalan<? super Object> pengenalan){
    pengenalan.getHasil();

  }

  public static void main(String[] args) {
    Pengenalan<Integer> pengenalan = new Pengenalan<>();
    pengenalan.setHasil(100);

    Pengenalan<? super Object> pengenalan2 = pengenalan;

    pengenalan.getHasil();
  }
}
