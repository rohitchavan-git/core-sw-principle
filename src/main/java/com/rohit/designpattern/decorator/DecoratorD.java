package com.rohit.designpattern.decorator;
// eg : new BufferReader(new DataStramReader(new DATAStramReader()))

import java.awt.*;
import java.util.Arrays;
import java.util.function.Function;

class Camera{
    private final Function<Color,Color> filters;

    Camera(Function <Color, Color> ... filters) {
        this.filters = Arrays.stream(filters)
                .reduce(Function.identity(), Function::andThen);
    }
    public Color snap(Color color){
        return this.filters.apply(color);
    }
}
public class DecoratorD {

    public static void main(String[] args) {
        Camera camera = new Camera(Color::brighter,Color::darker);
        System.out.println(camera.snap(new Color(123 , 123 , 234)));
    }

}
