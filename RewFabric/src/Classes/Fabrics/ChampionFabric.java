package Classes.Fabrics;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Classes.Rewards.Champion;

public class ChampionFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Champion();
    }
    
}
