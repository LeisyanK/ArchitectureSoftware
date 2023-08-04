package Classes.Fabrics;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Classes.Rewards.Silver;

public class SilverFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Silver();
    }
    
}
