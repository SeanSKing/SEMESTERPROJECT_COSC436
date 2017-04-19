public class Main {

    public static void main(String[] args) {
        //get stock and cart instances
        StockList stockList = StockList.getInstance();
        CartList cartList = CartList.getInstance();

        //fill the stock list
        String [] newTag = { "camera", "electronics" };
        stockList.addItem(new Item("Camera", 20, "cool camera", 20.00, newTag));
        newTag = new String[]{"food","health"};
        stockList.addItem(new Item("Banana", 100, "yellow Banana", 10.00, newTag));
        newTag = new String[]{"electronics","fitness","health"};
        stockList.addItem(new Item("fitbit", 20, "activity tracker", 120.00,newTag));
        newTag = new String[]{"electronics"};
        stockList.addItem(new Item("Garmin", 20, "never get lost again", 80.00,newTag));
        newTag = new String[]{"food","fitness","health"};
        stockList.addItem(new Item("Protein", 20, "cool camera", 20.00,newTag));
        newTag = new String[]{"health"};
        stockList.addItem(new Item("toothbrush", 20, "brush your teeth kids", 20.00,newTag));

        //print stock list
        System.out.println("Stock");
        stockList.printStock();
        System.out.println("-------------------------------");


        //create invoker and commands
        Invoker broker = new Invoker();
        Command buy = new AddToCart(stockList,cartList,1);
        Command buy2 = new AddToCart(stockList,cartList,3);

        broker.invoke(buy);
        broker.invoke(buy2);


        //show stuff
        System.out.println("Cart w/ Banana and GPS");
        cartList.printCart();
        cartList.printTotal();
        cartList.printCartSize();
        System.out.println("-------------------------------");

        //remove from cart command
        Command ew = new RemoveFromCart(cartList,1);
        broker.invoke(ew);

        //show udpated cart
        System.out.println("Cart after removed GPS");
        cartList.printCart();
        cartList.printTotal();
        cartList.printCartSize();
        System.out.println("-------------ALL------------------");

        //test out iterators
        listIterator all = new allIterator(stockList,0);
        while (all.hasNext()){
            System.out.println("Item: "+all.next().getItem());
        }
        System.out.println("-----------Health------------");

        listIterator byTag = new tagIterator(stockList,0,"health");
        while (byTag.hasNext()){
            System.out.println("Item: "+byTag.next().getItem());
        }

        System.out.println("------------electronics-------------");

        listIterator byTag2 = new tagIterator(stockList,0,"electronics");
        while (byTag2.hasNext()){
            System.out.println("Item: "+byTag2.next().getItem());
        }

    }
}