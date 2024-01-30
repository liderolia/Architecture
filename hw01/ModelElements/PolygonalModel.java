package arch.HW1.ModelElements;

import arch.HW1.stuff.Point3D;
import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    public List<Polygon> polygons;
    public List<Texture> textures;
    public PolygonalModel(List<Texture> textures) {
        this.textures = textures;

        this.polygons = new ArrayList<>();
        ArrayList<Point3D> points = new ArrayList<>();
        points.add(new Point3D());
        this.polygons.add(new Polygon(points));
    }
}