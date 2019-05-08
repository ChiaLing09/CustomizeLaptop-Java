import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class CustomizeLaptop {
  public static void main(String[] args) {

    // Array in object
    class screenList {
      public String type;
      public Integer price;

      screenList(String type, Integer price) {
        this.type = type;
        this.price = price;
      }
    }

    class ramList {
      public String type;
      public Integer price;

      ramList(String type, Integer price) {
        this.type = type;
        this.price = price;
      }
    }

    class hddList {
      public String type;
      public Integer price;

      hddList(String type, Integer price) {
        this.type = type;
        this.price = price;
      }
    }

    class processorList {
      public String type;
      public Integer price;

      processorList(String type, Integer price) {
        this.type = type;
        this.price = price;
      }
    }
    // List of options
    // String[] screenList = { "1080p", "4k", "Touchscreen" };
    // String[] ramList = { "8GB", "16GB", "32GB" };
    // String[] hddList = { "1TB HDD", "128GB SSD", "256GB SSD", "512 GB SSD" };
    // String[] processorList = { "i3", "i5", "i7" };

    screenList[] screen = new screenList[3];
    screen[0] = new screenList("1080p", 100);
    screen[1] = new screenList("4k", 200);
    screen[2] = new screenList("Touchscreen", 300);

    ramList[] ram = new ramList[3];
    ram[0] = new ramList("8GB", 100);
    ram[1] = new ramList("16GB", 200);
    ram[2] = new ramList("32GB", 300);

    hddList[] hdd = new hddList[4];
    hdd[0] = new hddList("1TB HDD", 100);
    hdd[1] = new hddList("128GB SSD", 200);
    hdd[2] = new hddList("256GB SSD", 300);
    hdd[3] = new hddList("512 GB SSD", 400);

    processorList[] processor = new processorList[3];
    processor[0] = new processorList("i3", 100);
    processor[1] = new processorList("i5", 200);
    processor[2] = new processorList("i7", 300);

    ArrayList<String> selection = new ArrayList<>();
    Integer proceedCheckoutChoice = 0;
    Integer totalPrice = 800;
    String coupon = "discount2019";
    Integer couponDiscount = 100;

    // start add laptop
    System.out.println("Laptop: New Inspiron 14 5000 (5480)");
    System.out.println("Laptop Price: RM " + totalPrice);
    System.out.println("Confirm Add to Cart?");
    System.out.println("1-Yes, 0-No");
    Scanner addToCart = new Scanner(System.in);
    Integer addToCartChoice = Integer.parseInt(addToCart.nextLine());

    if (addToCartChoice == 1) {
      System.out.println("Customize your laptop");
      System.out.println("--------------------------------------------");

      // start customize laptop
      // while (proceedCheckoutChoice == 0) {
      // display customization options
      System.out.println("Select screen:");
      for (int i = 0; i < screen.length; i++) {
        System.out.println(i + 1 + "-" + screen[i].type + " - RM " + screen[i].price);
      }
      Scanner screenSelect = new Scanner(System.in);
      Integer screenChoice = Integer.parseInt(screenSelect.nextLine());
      selection.add(screen[screenChoice - 1].type);
      totalPrice += screen[screenChoice - 1].price;

      System.out.println("--------------------------------------------");
      System.out.println("Select RAM:");
      for (int i = 0; i < ram.length; i++) {
        System.out.println(i + 1 + "-" + ram[i].type + " - RM " + ram[i].price);
      }
      Scanner ramSelect = new Scanner(System.in);
      Integer ramChoice = Integer.parseInt(ramSelect.nextLine());
      selection.add(ram[ramChoice - 1].type);
      totalPrice += ram[ramChoice - 1].price;

      System.out.println("--------------------------------------------");
      System.out.println("Select HDD:");
      for (int i = 0; i < hdd.length; i++) {
        System.out.println(i + 1 + "-" + hdd[i].type + " - RM " + hdd[i].price);
      }
      Scanner hddSelect = new Scanner(System.in);
      Integer hddChoice = Integer.parseInt(hddSelect.nextLine());
      selection.add(hdd[hddChoice - 1].type);
      totalPrice += hdd[hddChoice - 1].price;

      System.out.println("--------------------------------------------");
      System.out.println("Select Processor:");
      for (int i = 0; i < processor.length; i++) {
        System.out.println(i + 1 + "-" + processor[i].type + " - RM " + processor[i].price);
      }
      Scanner processorSelect = new Scanner(System.in);
      Integer processorChoice = Integer.parseInt(processorSelect.nextLine());
      selection.add(processor[processorChoice - 1].type);
      totalPrice += processor[processorChoice - 1].price;

      System.out.println("--------------------------------------------");
      System.out.println("Your selection:");
      System.out.println(selection);
      System.out.println("Total Price: RM " + totalPrice);

      System.out.println("--------------------------------------------");
      System.out.println("Apply coupon");
      Scanner applyCoupon = new Scanner(System.in);
      String applyCouponChoice = applyCoupon.nextLine();
      if (applyCouponChoice == coupon) {
        totalPrice = totalPrice - couponDiscount;
      } else {
        System.out.println("Incorrect coupon. No discount applied");
      }

      System.out.println("--------------------------------------------");
      // Confirm proceed checkout
      System.out.println("Proceed checkout?");
      System.out.println("1-Yes, 0-No");
      Scanner proceedCheckout = new Scanner(System.in);
      proceedCheckoutChoice = Integer.parseInt(proceedCheckout.nextLine());
      if (proceedCheckoutChoice == 1) {
        System.out.println("Laptop: New Inspiron 14 5000 (5480)");
        System.out.println("Customization list:");
        for (int i = 0; i < selection.size(); i++) {
          System.out.println(selection.get(i));
        }
        System.out.println("Total price: RM " + totalPrice);
      } else {
        System.out.println("Exit cart");
      }
      // }

    }
  }
}