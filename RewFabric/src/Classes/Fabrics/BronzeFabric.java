package Classes.Fabrics;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Classes.Rewards.Bronze;

public class BronzeFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Bronze();
    }
    
}
