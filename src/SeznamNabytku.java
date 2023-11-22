import java.util.ArrayList;

public class SeznamNabytku {
   private List<Nabytek> seznamNabytku =  new ArrayList<>();
   public void zaplaceniNabytku(Nabytek nabytek){
        seznamNabytku.add(nabytek);
    }
    public void odstanitNabytek(Nabytek nabytek){//chcene odstranit nabytek
       seznam.remove(nabytek);

    }
    public double hmotnostNabytku(Nabytek nabytek){//chci celkovou hmotnost nábytku
       double celkovaHmotnost = 0.0;//velké D u seznamu musíš
        for(Nabytek nabytek: seznamNabytku )//pomoucná proměná která postupně vkládá prvky seznamu a prochází je
        celkovaHmotnost += seznamNabytku.getHmotnost();
        //System.out.println("Celkova hmotnost nabytku:"+celkovaHmotnost);
    }
     return celkovaHmotnost();
}
