package Rewards.Crystal;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class CrystalFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Crystal();
    }
    
}
