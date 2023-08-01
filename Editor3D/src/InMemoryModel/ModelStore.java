package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements iModelChanger{
    public List<PoligonalModel> models;  
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;  

    /**
     * конструктор
     * 
     * @param texture
     * @throws Exception
     */
    public ModelStore(iModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;  

        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
        
        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0,models,flashes,cameras));
    }

    /**
     * Возвращает scena по ID
     * @param ID
     * @return
     */
    public Scene getScena(int ID){
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).ID == ID) {
                return scenes.get(i);
            }
        }
        return null;
    }

    /**
     * Регистрация изменений
     */
    @Override
    public void notifyChange(iModelChanger sender) {
        //
    }

}
