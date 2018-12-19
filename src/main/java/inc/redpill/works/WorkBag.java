package inc.redpill.works;

import inc.redpill.works.Work.WorkBuilder;

import static inc.redpill.holes.HoleBag.hole;
import static inc.redpill.practices.PracticeBag.practice;
import static inc.redpill.resources.ResourceBag.resource;
import static inc.redpill.works.Work.WorkBuilder.aWork;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class WorkBag {
    static WorkBuilder work() {
        return work(0);
    }

    static WorkBuilder work(int i) {
        return aWork()
                .withHole(hole(i).build())
                .withPractice(practice(i).build())
                .withResources(singletonList(resource(i).build()))
                .withWorks(emptyList());
    }
}
