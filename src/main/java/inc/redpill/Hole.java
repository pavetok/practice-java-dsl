package inc.redpill;

public class Hole {
    private String type;

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
