package ir.javastudio.astar;

import ir.javastudio.astar.pathfinding.AStarPathFinder;
import ir.javastudio.astar.pathfinding.Mover;
import ir.javastudio.astar.pathfinding.Path;
import ir.javastudio.astar.pathfinding.PathFindingContext;
import ir.javastudio.astar.pathfinding.TileBasedMap;


public class AStarTest {

    //test112
    private static final int MAX_PATH_LENGTH = 100;

    private static final int START_X = 1;
    private static final int START_Y = 1;

    private static final int GOAL_X = 1;
    private static final int GOAL_Y = 6;

    public static void main(String[] args) {

        SimpleMap map = new SimpleMap();

        AStarPathFinder pathFinder = new AStarPathFinder(map, MAX_PATH_LENGTH, false);
        Path path = pathFinder.findPath(null, START_X, START_Y, GOAL_X, GOAL_Y);

        int length = path.getLength();
        System.out.println("Found path of length: " + length + ".");

        for(int i = 0; i < length; i++) {
            System.out.println("Move to: " + path.getX(i) + "," + path.getY(i) + ".");
        }

    }

}

