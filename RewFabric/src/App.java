import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Fabrics.BronzeFabric;
import Classes.Fabrics.ChampionFabric;
import Classes.Fabrics.CrystalFabric;
import Classes.Fabrics.GemFabric;
import Classes.Fabrics.GoldFabric;
import Classes.Fabrics.MasterFabric;
import Classes.Fabrics.SilverFabric;
import Classes.Fabrics.TitanFabric;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();  // полиморфизм
        fab1.openReward();
        ItemGenerator fab2 = new GemFabric();  
        fab2.openReward();
        ItemGenerator fab3 = new BronzeFabric();  
        fab3.openReward();
        ItemGenerator fab4 = new ChampionFabric(); 
        fab4.openReward();
        ItemGenerator fab5 = new CrystalFabric();  
        fab5.openReward();
        ItemGenerator fab6 = new MasterFabric();  
        fab6.openReward();
        ItemGenerator fab7 = new SilverFabric();  
        fab7.openReward();
        ItemGenerator fab8 = new TitanFabric();  
        fab8.openReward();

        // System.out.println("Hello, World!");
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);
        fabricList.add(fab7);
        fabricList.add(fab8);

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt(fabricList.size()));
            fabricList.get(index).openReward();
        }
    }
}
