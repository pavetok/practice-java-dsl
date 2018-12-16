package inc.redpill.holes;

import inc.redpill.Context;
import inc.redpill.Visitable;
import inc.redpill.Visitor;

import javax.validation.constraints.NotBlank;

public class Hole implements Visitable {
    @NotBlank
    private String type;

    @Override
    public Context visit(Visitor visitor, Context context) {
        return visitor.apply(this, context);
    }

    public static final class HoleBuilder {
        private String type;

        private HoleBuilder() {
        }

        public static HoleBuilder aHole() {
            return new HoleBuilder();
        }

        public HoleBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public Hole build() {
            Hole hole = new Hole();
            hole.type = this.type;
            return hole;
        }
    }
}
