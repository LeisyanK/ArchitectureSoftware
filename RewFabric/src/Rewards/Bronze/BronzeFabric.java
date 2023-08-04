package Rewards.Bronze;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class BronzeFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Bronze();
    }
    
}
