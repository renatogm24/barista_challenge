public class TestOrders {
  public static void main(String args[]) {
    Order order1 = new Order();
    Order order2 = new Order();

    Order order3 = new Order("Renato");
    Order order4 = new Order("Paco");
    Order order5 = new Order("Vanessa");

    Item item1 = new Item("moka",11.5);
    Item item2 = new Item("latte",13.5);
    Item item3 = new Item("café de goteo",15.5);
    Item item4 = new Item("capuchino",17.5);


    order1.addItem(item1);
    order1.addItem(item2);

    order2.addItem(item2);
    order2.addItem(item3);

    order3.addItem(item3);
    order3.addItem(item4);

    order4.addItem(item4);
    order4.addItem(item1);

    order5.addItem(item1);
    order5.addItem(item2);

    order1.display();
    System.out.println("---------");
    order2.display();
    System.out.println("---------");
    order3.display();
    System.out.println("---------");
    order4.display();
    System.out.println("---------");
    order5.display();

    order2.setIsListo(true);
    System.out.println(order2.getStatusMessage());
  }

}
