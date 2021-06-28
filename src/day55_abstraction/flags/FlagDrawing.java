package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.setColor(0,0, Color.RED);
        //grid.kill(); to close it after

        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        UkrainianFlag ukraine = new UkrainianFlag();
        ukraine.draw();

        FrenchFlag france = new FrenchFlag();
        france.draw();

    }
}
