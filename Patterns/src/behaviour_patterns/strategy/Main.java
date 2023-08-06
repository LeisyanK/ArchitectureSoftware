package behaviour_patterns.strategy;

public class Main {
    
    public static void main(String[] args) {
        
        Auto sedan = new Sedan();
        Auto hybrid = new HybridAuto();
        Auto f1car = new F1Car();

        sedan.fill();
        hybrid.fill();
        f1car.fill();

        //мы можем менять стратегии на ходу
        //Если вдруг детские машины-багги начнут заправлять бензином, наша программа будет готова к такому варианту развития событий
        ChildrenBuggies buggies = new ChildrenBuggies();
        buggies.setFillStrategy(new StandartFillStrategy());

        buggies.fill();
    }
}
