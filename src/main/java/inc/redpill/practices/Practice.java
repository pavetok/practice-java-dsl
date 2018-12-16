package inc.redpill.practices;

import inc.redpill.Visitable;
import inc.redpill.Visitor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Practice implements Visitable {
    @NotBlank
    private String name;
    @NotBlank
    private String resultType;
    @Size(min = 1)
    @NotNull
    private List<String> resourceTypes;

    @Override
    public void visit(Visitor visitor) {
        visitor.apply(this);
    }

    public static final class PracticeBuilder {
        private String name;
        private String resultType;
        private List<String> resourceTypes;

        private PracticeBuilder() {
        }

        public static PracticeBuilder aPractice() {
            return new PracticeBuilder();
        }

        public PracticeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PracticeBuilder withResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        public PracticeBuilder withResourceTypes(List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Practice build() {
            Practice practice = new Practice();
            practice.resultType = this.resultType;
            practice.name = this.name;
            practice.resourceTypes = this.resourceTypes;
            return practice;
        }
    }
}
