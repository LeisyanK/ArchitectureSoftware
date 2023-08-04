package Classes;
// прототип фабрики

public abstract class ItemGenerator {
    /**
     * Выдача награды
     */
    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    /**
     * Создание награды
     * @return
     */
    public abstract iGameItem createItem();
}
