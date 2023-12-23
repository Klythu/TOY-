package suport;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Viktorina {
    public ArrayList<Toy> list;

    public Viktorina(){
        this.list=new ArrayList<>();
    }
    public void put(String str){
        Toy newtoy= new Toy(str);
        this.list.add(newtoy);
    }
    public void get() throws EmptyExeption {
        if(this.list.size()==0){
            throw new EmptyExeption ("Add some prizes first)");
        }
        Random random=new Random();
        ArrayList<Integer> chances=new ArrayList<Integer>();
        Integer sumchance=0;
        for (Toy tmp:this.list
             ) {
            chances.add(tmp.chance);
            sumchance+= tmp.chance;
        }
        Integer prize_chance=random.nextInt(0,sumchance);
        Integer prize_id=0;
        for (Integer tmp:chances
             ) {
            if(prize_chance<=tmp){
                prize_id=chances.indexOf(tmp);
                break;
            }else {
                prize_chance-=tmp;
            }
        }
        try {
            FileWriter writer = new FileWriter("prize.txt", true);
            StringBuilder prize= new StringBuilder(this.list.get(prize_id).getName());
            prize.append(" был выигран.Ура!!!");
            prize.append("\n");
            writer.append(prize);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (this.list.get(prize_id).getIn_stock()-1==0){
            this.list.remove(this.list.get(prize_id));
        }else {
            this.list.get(prize_id).setIn_stock(this.list.get(prize_id).getIn_stock()-1);
        }
    }
}
