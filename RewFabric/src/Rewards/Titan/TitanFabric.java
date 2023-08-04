package Rewards.Titan;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class TitanFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Titan();
    }
    
}
