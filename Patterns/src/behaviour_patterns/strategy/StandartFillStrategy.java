package behaviour_patterns.strategy;

/**
 * стратегия поведения для обычных машин реализует отдельный алгоритм заправки
 */
public class StandartFillStrategy implements FillStrategy{
    
    @Override
   public void fill() {
       System.out.println("Просто заправляем бензин!");
   }
}
