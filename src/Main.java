import data.model.CartObject;
import data.model.Order;
import data.model.exception.nullCartException;
import data.source.catalog.*;
import data.source.cart.*;
import data.source.orderDataSource.*;
import view.Out;
import controller.*;

public class Main {
    public static void main(String[] args) {
        catalogDataSource catalog = new catalogTest();
        cartDataSource cart = new cartDataSource();
        orderDataSource orderList = new orderDataSource();
        run(catalog,cart,orderList);
    }
    public static void run(catalogDataSource catalog, cartDataSource cart, orderDataSource orderList){
        boolean exit = false;
        Out.println("Enter command");
        String in = In.call();
        switch (in.split(" ")[0]) {
            case "/help" -> {
                Out.println("/catalog - output the catalog.");
                Out.println("/cart - withdraw the shopping cart.");
                Out.println("/orders - withdraw all orders.");
                Out.println("/create_order {address} {your name} - create the order.");
                Out.println("/add_to_cart {id} {count} - add product to cart.");
                Out.println("/close - exit.");
                Out.println("");
            }
            case "/catalog" -> {
                Out.printCatalog(catalog);
            }
            case "/cart" -> {
                if (cart.getItems().size() != 0) Out.printCart(cart);
                else Out.println("Cart is empty.");
            }
            case "/orders" -> {
                Out.printOrders(orderList);
            }
            case "/create_order" -> {
                int index;
                try {
                    if (cart.getItems().size() == 0) throw new nullCartException();
                    if (orderList.getOrders().size() == 0) index = 1;
                    else index = orderList.getOrders().size();
                    orderList.add(new Order(index, in.split(" ")[1], in.split(" ")[2], cart));
                    cart = new cartDataSource();
                    Out.println("Order successfully added.");

                } catch (nullCartException e) {
                    Out.println(e.getMessage());
                } catch (RuntimeException e) {
                    Out.println("Incorrect arguments!");
                }
            }
            case "/add_to_cart" -> {
                try {
                    cart.add(new CartObject(catalog.getProducts().get(Integer.parseInt(in.split(" ")[1]) - 1), Integer.parseInt(in.split(" ")[2])));
                    Out.println("Product added successfully.");
                } catch (RuntimeException e) {
                    Out.println("Incorrect arguments!");
                }
            }
            case "/close" -> {
                Out.println("Goodbye.");
                exit = true;
            }
            default -> Out.println("You can type /help to find out the commands");
        }
        if (!exit) run(catalog,cart,orderList);
    }
}
