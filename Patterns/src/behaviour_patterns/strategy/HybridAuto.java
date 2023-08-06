package behaviour_patterns.strategy;

public class HybridAuto extends Auto{
    
    public HybridAuto() {
        this.fillStrategy = new HybridFillStrategy();
    }
}
