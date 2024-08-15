package Invariant;

public class Pengelanan<T> {
  // by default ketika membuat paramter type itu sifatnya adalah invariant

  // yaitu generic nya tidak boleh di subtitusi dengan child maupun parent nya

  public static void main(String[] args) {
    Pengelanan<String> pengelanan = new Pengelanan<String>();
    Pengelanan<Object> pengelanan2 = pengelanan; // ERROR -> dri child ke parent

    Pengelanan<Object> pengelanan3 = new Pengelanan<Object>();
    Pengelanan<Integer> pengelanan4 = pengelanan3; // ERROR -> dri parent ke child
  }
}
