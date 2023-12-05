package observerpattern;


import java.util.*;

public class NewSubscriberServ {
    public static void main(String[] args){

        Subscribers brian = new Subscribers();
        brian.setClientName("Brian");

        Subscribers edison = new Subscribers();
       edison.setClientName("Edison");

        Subscribers rome = new Subscribers();
        rome.setClientName("Rome");

        //add the subscribers to the subscribers list
        List<Subscribers> subscribersList = new ArrayList<>();
        subscribersList.add(brian);
        subscribersList.add(edison);
        subscribersList.add(rome);

        news stock = new news();
        stock.setStockName("Hello There!");
        stock.setClientList(subscribersList);

       
        System.out.println("News Alert! Hello Subscribers! The News industry is buzzing with the latest News!");
        System.out.println(stock.notifySubscribers());

        
        stock.detach(charlie);

        Subscribers charlie = new Subscribers();
        charlie.setClientName("Charlie");
        stock.attach(charlie);

        // updates for the news
        System.out.println("Updates recently!");
        System.out.println(stock.notifySubscribers());
    }
}