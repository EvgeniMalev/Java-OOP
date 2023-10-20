
public class Pokemon {
    
    String name;
    String type;
    int num;
    String color;
 
    
    public Pokemon(String name, String type, int num,
               String color)
    {
        this.name = name;
        this.type = type;
        this.num = num;
        this.color = color;
    }
 
    
    public String getName() { return name; }
 
   
    public String getType() { return type; }
 
    
    public int getNum() { return num; }
 
    
    public String getColor() { return color; }
 
    @Override public String toString(){
        return ("The name of the selected pokemon is " + this.getName()
                + ".\n whick is  and with number ,age in the Pokedex and color are "
                + this.getType() + "," + this.getNum()
                + "," + this.getColor());
    }
 
  public static void main(String[] args){
    Pokemon Bulbasaur = new Pokemon("Bulbasaur", "grass", 1, "green");
        System.out.println(Bulbasaur.toString());
		Pokemon Pidgey = new Pokemon("Bulbasaur", "bird", 16, "brown");
        System.out.println(Pidgey.toString());
		Pokemon Pikachu = new Pokemon("Pikachu", "electric", 1, "yellow");
        System.out.println(Pikachu.toString());
		
    }
}
