package Covariant;

public class Pengenalan<T> {
  // bisa melakukan subsitusi generic dri child ke parent maupun sebaliknya

  // covariant itu sifatnya read-only jadi generic type nya tidak bisa diubah2

  private T hasil;
  
  public T getHasil() {
    return hasil;
  }

  public void setHasil(T hasil) {
    this.hasil = hasil;
  }

  public void sayHello(Pengenalan<? extends Object> pengenalan){
    pengenalan.getHasil();

    // pengenalan.setHasil(10); // ERROR -> Karena covariant itu sifatnya read-only
  }

  public static void main(String[] args) {
    Pengenalan<String> pengenalan = new Pengenalan<>();
    Pengenalan<? extends Object> pengenalan2 = pengenalan;

  }
}
