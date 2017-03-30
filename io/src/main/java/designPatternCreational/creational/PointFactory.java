package designPatternCreational.creational;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by RENT on 2017-03-27.
 */
public class PointFactory {

    private static Set<Point> points = new HashSet<>();

    public static Point createm(int x, int y) {
        Optional<Point> existingPoint = points.stream().filter(p -> p.getX() == x && p.getY() == y).findFirst();

        if (existingPoint.isPresent()) {
            return existingPoint.get();
        }
        Point point = new Point(x, y);
        points.add(point);
        return point;

    }
}
