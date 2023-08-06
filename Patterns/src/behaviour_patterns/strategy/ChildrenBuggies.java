package behaviour_patterns.strategy;

public class ChildrenBuggies extends Auto{
    
    @Override
   public void fill() {
       System.out.println("Игрушечную машину нельзя заправить!");
   }
}
