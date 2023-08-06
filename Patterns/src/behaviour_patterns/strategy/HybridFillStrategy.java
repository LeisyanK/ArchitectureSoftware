package behaviour_patterns.strategy;

/**
 * стратегия поведения для гибридов реализует отдельный алгоритм заправки
 */
public class HybridFillStrategy implements FillStrategy{
    
    @Override
   public void fill() {
       System.out.println("Заправляем бензином или электричеством на выбор!");
   }
}
