package inc.redpill.works;

import inc.redpill.groups.PracticeCheck;
import inc.redpill.groups.ResourceCheck;
import inc.redpill.groups.WorkCheck;
import inc.redpill.holes.Hole;
import inc.redpill.practices.Practice;
import inc.redpill.resources.Resource;

import javax.validation.GroupSequence;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@AWork(groups = WorkCheck.class)
@GroupSequence({PracticeCheck.class, ResourceCheck.class, Work.class})
public class Work {

    @NotNull
    @Valid
    private Hole hole;

    @NotNull
    @Valid
    private Practice practice;

    @NotNull
    @Valid
    private List<Resource> resources;

    @NotNull
    @Valid
    private List<Work> works;

    public Hole getHole() {
        return hole;
    }

    public Practice getPractice() {
        return practice;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public List<Work> getWorks() {
        return works;
    }

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
