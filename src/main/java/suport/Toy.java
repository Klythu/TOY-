package suport;


public class Toy {
    public Integer id;
    public String name;
    public Integer chance;
    public Integer in_stock;

    public Toy(String input){
        String[] data=input.split(" ",4);
        this.id=Integer.parseInt(data[0]);
        this.name=data[1];
        this.chance=Integer.parseInt(data[2]);
        this.in_stock=Integer.parseInt(data[3]);
    }
    public String getName(){
        return this.name;
    }
    public void setIn_stock(Integer stock){
        this.in_stock=stock;
    }
    public Integer getIn_stock(){
        return this.in_stock;
    }

}
