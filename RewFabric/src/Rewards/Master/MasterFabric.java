package Rewards.Master;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class MasterFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Master();
    }
    
}
