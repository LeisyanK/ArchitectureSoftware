package Classes.Fabrics;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Classes.Rewards.Gem;

public class GemFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Gem();
    }
    
}
