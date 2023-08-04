import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Rewards.Bronze.BronzeFabric;
import Rewards.Champion.ChampionFabric;
import Rewards.Crystal.CrystalFabric;
import Rewards.Gem.GemFabric;
import Rewards.Gold.GoldFabric;
import Rewards.Master.MasterFabric;
import Rewards.Silver.SilverFabric;
import Rewards.Titan.TitanFabric;

public class App {
    /**
     * Генерация фабрик по созданию наград.
     * Выдача наград, сгенерированных случайным образом.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();  // полиморфизм
        ItemGenerator fab2 = new GemFabric();  
        ItemGenerator fab3 = new BronzeFabric();  
        ItemGenerator fab4 = new ChampionFabric(); 
        ItemGenerator fab5 = new CrystalFabric();  
        ItemGenerator fab6 = new MasterFabric();  
        ItemGenerator fab7 = new SilverFabric();  
        ItemGenerator fab8 = new TitanFabric();  

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

        // второй вариант заполнения списка:
        List<ItemGenerator> fabricList2 = new ArrayList<>(
            Arrays.asList(fab1, fab2, fab3, fab4, fab5, fab6, fab7, fab8)
        );

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt(fabricList.size()));
            fabricList.get(index).openReward();
        }
    }
}
