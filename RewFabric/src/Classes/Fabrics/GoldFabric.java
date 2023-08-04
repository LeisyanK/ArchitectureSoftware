package Classes.Fabrics;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Classes.Rewards.Gold;

public class GoldFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Gold();
    }
    
}
