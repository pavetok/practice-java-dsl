package inc.redpill;

import inc.redpill.Hole.HoleBuilder;
import inc.redpill.Practice.PracticeBuilder;
import inc.redpill.Work.WorkBuilder;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;

class WorkTest {

    @Test
    void shouldBuildWork() {
        Hole someHole = HoleBuilder.aHole()
                .withType("Foo")
                .build();

        Practice somePractice = PracticeBuilder.aPractice()
                .withResultType("Foo")
                .withInputType("Bar")
                .build();

        Resource someResource = Resource.ResourceBuilder.aResource()
                .withType("Bar")
                .build();

        Work someWork = WorkBuilder.aWork()
                .build();

        Work anotherWork = WorkBuilder.aWork()
                .withHole(someHole)
                .withPractice(somePractice)
                .withResources(asList(someResource))
                .withWorks(asList(someWork))
                .build();
    }
}
