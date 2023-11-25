package asenovpub.core.interfaces;

public interface Controller {

   String addWine(String type, String name, double price);

   String addRakia(String type, String name, double price);
   
   String addFood(String type, String name, double price);
   
   String addMusic(String type);

   String getIncome();
}
