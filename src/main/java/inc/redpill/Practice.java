package inc.redpill;

public class Practice {
    private String resultType;
    private String inputType;

    public static final class PracticeBuilder {
        private String resultType;
        private String inputType;

        private PracticeBuilder() {
        }

        public static PracticeBuilder aPractice() {
            return new PracticeBuilder();
        }

        public PracticeBuilder withResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        public PracticeBuilder withInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }

        public Practice build() {
            Practice practice = new Practice();
            practice.resultType = this.resultType;
            practice.inputType = this.inputType;
            return practice;
        }
    }
}
