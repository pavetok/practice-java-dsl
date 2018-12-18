package inc.redpill.practices;

import inc.redpill.groups.PracticeCheck;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@APractice(groups = PracticeCheck.class)
//@APractice
public class Practice {

    @NotBlank
    private String name;

    @NotBlank
    private String resultType;

    @NotEmpty
    private List<String> resourceTypes;

    public String getName() {
        return name;
    }

    public String getResultType() {
        return resultType;
    }

    public List<String> getResourceTypes() {
        return resourceTypes;
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
