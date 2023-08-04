package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;

    public List<Camera> Cameras = new ArrayList<Camera>();  // добавили сами исходя из зависимостей, на диаграмме нет

    // public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) { // здесь cameras добавили сами, хотя в схеме не было
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {  // это по UML-диаграмме
        this.ID = id;
        if (models.size() > 0) {  // пользуясь инкапсуляцией, требуем, чтобы в момент создания сцены в моделях и камерах что-то уже был,
                                    // чтобы выполнилось условие 1..*
            this.Models = models;
        } else {
            // throw new Exception("Должна быть хотя бы одна модель");
        }
        this.Flashes = flashes;
        // на диаграмме камеры нет. но если ее добавить, то будет следующим образом:
        // if (cameras.size() > 0) {  // пользуясь инкапсуляцией, требуем, чтобы в момент создания сцены в моделях и камерах что-то уже был
        //     this.Cameras = cameras;
        // } else {
        //     throw new Exception("Должна быть хотя бы одна камера");
        // }
    }

    // добавляем дженерики, т.к. не указаны типы
    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
    // либо добавляем заглушки
    // тогда добавляется класс для типа Type1 в Staff
    // /**
    //  * заглушка
    //  */
    // public Type1 method1(Type1 t) {
    //     return t;
    // }
    
    // /**
    //  * заглушка
    //  */
    // public Type1 method1(Type1 t1, Type2 t2) {
    //     return t1;
    // }
}
