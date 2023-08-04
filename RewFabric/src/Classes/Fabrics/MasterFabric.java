package Classes.Fabrics;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Classes.Rewards.Master;

public class MasterFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Master();
    }
    
}
