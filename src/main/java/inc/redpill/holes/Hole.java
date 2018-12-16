package inc.redpill.holes;

import javax.validation.constraints.NotBlank;

public class Hole {

    @NotBlank
    private String type;

    public String getType() {
        return type;
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
