package Rewards.Champion;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class ChampionFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Champion();
    }
    
}
