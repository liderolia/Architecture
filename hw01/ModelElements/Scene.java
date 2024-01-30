package arch.HW1.ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
        if (this.models.size() < 1) {
            throw new RuntimeException("Models must not be empty");
        }
        if (this.cameras.size() < 1) {
            throw new RuntimeException("Cameras must not be empty");
        }
    }
}