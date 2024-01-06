import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {

  public static void main(String[] args) {
    Product item1 = new Product(100, 12, "Lays", 1231);
    Product item2 = new Product(90, 13, "Орешки", 1232);
    Product item3 = new Product(20, 2, "Мюсли", 1233);
    Product item4 = new Product(50, 1, "3Корочки", 1234);
    Product item5 = new Product(75, 4, "Сникерс", 1235);
    Product item6 = new Product(60, 7, "Милка", 1236);
    Product item7 = new Bottle(150, 12, "Fanta", 15, 0.5f);
    Product item8 = new HotDrink(120, 17, "Latte", 12348, 0.3f, 75);
    Product item9 = new HotDrink(110, 18, "BlackCoffee", 12349, 0.3f, 80);

    Holder hold = new Holder();
    CoinDispenser coin = new CoinDispenser();
    Display disp = new Display();
    List<Product> listProd = new ArrayList<>();

    listProd.add(item1);
    listProd.add(item2);
    listProd.add(item3);
    listProd.add(item4);
    listProd.add(item5);
    listProd.add(item6);
    listProd.add(item7);
    listProd.add(item8);
    listProd.add(item9);

    VendingMachine vm = new VendingMachine(hold, coin, disp, listProd);
    for (Product p : vm.getAssort()) {
      System.out.println(p);
    }
  }
}