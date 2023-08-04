package Rewards.Silver;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class SilverFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Silver();
    }
    
}
