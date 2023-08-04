package Classes.Fabrics;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Classes.Rewards.Titan;

public class TitanFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Titan();
    }
    
}
