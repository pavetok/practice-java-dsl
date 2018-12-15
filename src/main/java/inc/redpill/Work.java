package inc.redpill;

import java.util.List;

public class Work {
    private Hole hole;
    private Practice practice;
    private List<Resource> resources;
    private List<Work> works;

    public static final class WorkBuilder {
        private Hole hole;
        private Practice practice;
        private List<Resource> resources;
        private List<Work> works;

        private WorkBuilder() {
        }

        public static WorkBuilder aWork() {
            return new WorkBuilder();
        }

        public WorkBuilder withHole(Hole hole) {
            this.hole = hole;
            return this;
        }

        public WorkBuilder withPractice(Practice practice) {
            this.practice = practice;
            return this;
        }

        public WorkBuilder withResources(List<Resource> resources) {
            this.resources = resources;
            return this;
        }

        public WorkBuilder withWorks(List<Work> works) {
            this.works = works;
            return this;
        }

        public Work build() {
            Work work = new Work();
            work.resources = this.resources;
            work.practice = this.practice;
            work.hole = this.hole;
            work.works = this.works;
            return work;
        }
    }
}
