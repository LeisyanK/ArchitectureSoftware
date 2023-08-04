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
    private iModelChangeObserver[] changeObservers;  // это для 0..n используется массив, т.к. длина определенная
                                                    // переменная changeObservers будет использоваться только для вызова метода интерфейса

    /**
     * конструктор
     * 
     * @param texture
     * @throws Exception
     */
    // это в UML-диаграмме обозначено неокрашенным ромбиком 0..n (слева)
    public ModelStore(iModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;  // это для незакрашенных ромбиков

        this.models = new ArrayList<PoligonalModel>();  // это для закрашенных ромбиков
        this.scenes = new ArrayList<Scene>();  // это для закрашенных ромбиков
        this.flashes = new ArrayList<Flash>();  // это для закрашенных ромбиков
        this.cameras = new ArrayList<Camera>();  // это для закрашенных ромбиков. На диаграмме этого нет
        // здесь мы должны добавить по одному элементу models, scenes, flashes, cameras, т.к. в схеме 1..* и закрашенный ромбик
        models.add(new PoligonalModel(null));
        flashes.add(new Flash()); // у Flash не было конструктора, поэтому мы можем создать пустой объект (без полей класса Flash)
        cameras.add(new Camera()); // на диаграмме нет камеры
        // scenes.add(new Scene(0,models,flashes,cameras));    // это по семинару 2
        scenes.add(new Scene(0,models,flashes)); //  это по UML-диаграмме
    }

    /**
     * Возвращает scena по ID
     * @param ID
     * @return
     */
    public Scene getScena(int ID){
        // return new Scene(); // это был мой вариант
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
        // оставляем заглушку
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }

}
