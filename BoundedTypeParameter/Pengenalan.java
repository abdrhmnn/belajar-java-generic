package BoundedTypeParameter;

public class Pengenalan {
  // yaitu cara dimana kita bisa membatasi type data di generic parameter type

  // by default type dari generic type itu adalah Object, makanya semua type itu bisa dimasukan ke dalam
  // generic type karena turunan dari class Object

  public static void main(String[] args) {
    Hello<Hello2> hello = new Hello<>();
    Hello<Hello2> hello2 = new Hello<>();
  }
}

// artinya ini hanya bisa diberikan generic parameter type Number dan turunan dari class tersebut
// bisa menambahkan lebih dr satu generic type hanya saja untuk type setelahnya itu hrs interface
class Hello<T extends Hello2 & Hello3>{
  public static void main(String[] args) {
    System.out.println();
  }
}

class Hello2 implements Hello3{
  @Override
  public void sayHello() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sayHello'");
  }
}

interface Hello3{
  void sayHello();
}