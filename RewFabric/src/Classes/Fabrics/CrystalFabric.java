package Classes.Fabrics;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Classes.Rewards.Crystal;

public class CrystalFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Crystal();
    }
    
}
