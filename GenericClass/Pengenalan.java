package GenericClass;

/**
 * Pengenalan
 */
public class Pengenalan<T, S> {
  // yaitu class atau interface yg memiliki parameter type

  // jenis" parameter type yg biasa digunakan oleh programmer java, yaitu :
  // E - Element (biasa digunakan pada collection atau struktur data)
  // K - Key
  // N - Number
  // T - Type
  // V - Value
  // S, U, V (type urutan 2,3 dan 4)

  private T data;
  private S data2;

  public Pengenalan(T data, S data2){
    this.data = data;
    this.data2 = data2;
  }
  
  public S getData2() {
    return data2;
  }

  public void setData2(S data2) {
    this.data2 = data2;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public static void main(String[] args) {
    Pengenalan<String, Byte> pengenalan1 = new Pengenalan<String, Byte>("Abdu", (byte) -10);
    Pengenalan<Boolean, Float> pengenalan2 = new Pengenalan<Boolean, Float>(false, 94.5F);

    System.out.println(pengenalan1.getData());
    System.out.println(pengenalan2.getData());
  }
}

