package inc.redpill;

import inc.redpill.some_work.SomeResource;
import inc.redpill.some_work.SomeWork;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WorkTest {

    @Test
    void shouldBuildWork() {
        // given
        SomeResource someResource = new SomeResource();
        SomeWork work = new SomeWork();
        // and
        work.withResource(someResource);
        // when
        SomeResource actualResource = work.make();
        // then
        assertThat(actualResource).isEqualTo(someResource);
    }
}
