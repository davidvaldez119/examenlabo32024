import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      List<ProductosOficina > product=new ArrayList<>();
      Sillas s1=new Sillas(10,"lolo",25.56,0);
      Escritorio e1=new Escritorio(15.7,23.6,19,"polo",56.7);
      Impresoras i1=new Impresoras("lolin" ,100);
      product.add(s1 );
      product.add(e1);
      product.add(i1);
      for(Integer i=0;i<product.size();i++){

          product.get(i).toString();
      }

    }
}