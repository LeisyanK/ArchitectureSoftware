package behaviour_patterns.strategy;

/**
 * стратегия поведения для болидов Формулы-1 реализует отдельный алгоритм заправки
 */
public class F1PitstopStrategy implements FillStrategy{
    
    @Override
   public void fill() {
       System.out.println("Заправляем бензин только после всех остальных процедур пит-стопа!");
   }
}
