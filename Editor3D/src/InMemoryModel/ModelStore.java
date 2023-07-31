package InMemoryModel;

import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.Poligon;
import ModelElements.Scene;

public class ModelStore implements iModelChanger{
    public List<Poligon> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangeObserver> changeObservers;

    public Scene getScena(int var1){
        return new Scene();
    }

    @Override
    public void notifyChange(iModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }

}
