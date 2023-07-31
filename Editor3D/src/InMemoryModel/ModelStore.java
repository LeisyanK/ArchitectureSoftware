package InMemoryModel;

import java.util.List;

public class ModelStore {
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangeObserver> changeObservers;
}
