package inc.redpill.holes;

import inc.redpill.holes.Hole.HoleBuilder;

import static inc.redpill.holes.Hole.HoleBuilder.aHole;
import static java.lang.String.format;

public class HoleBag {
    public static HoleBuilder hole() {
        return hole(0);
    }

    public static HoleBuilder hole(int i) {
        return aHole().withType(format("hole-type-%s", i));
    }
}
