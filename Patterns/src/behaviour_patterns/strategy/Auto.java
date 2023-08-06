package behaviour_patterns.strategy;

public class Auto {

    FillStrategy fillStrategy;

    /**
     * Мы используем наш интерфейс FillStrategy в качестве поля в родительском классе Auto. Обрати внимание: мы не указываем конкретную реализацию, а используем именно интерфейс.
     */
    public void fill(){
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println("Едем вперед");
    }
 
    public void stop() {
 
        System.out.println("Тормозим!");
    }

    /**
     * Что касается взаимозаменяемости, то для ее достижения нам достаточно добавить один метод-сеттер в наш класс
     * @param fillStrategy
     */
    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }
}
