package inc.redpill.works;

import inc.redpill.holes.Hole;
import inc.redpill.holes.Hole.HoleBuilder;
import inc.redpill.practices.Practice;
import inc.redpill.practices.Practice.PracticeBuilder;
import inc.redpill.resources.Resource;
import inc.redpill.resources.Resource.ResourceBuilder;
import inc.redpill.works.Work.WorkBuilder;
import org.hibernate.validator.HibernateValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class WorkTest {
    private static Validator validator;

    @BeforeAll
    static void setUpValidator() {
        validator = Validation.byProvider(HibernateValidator.class)
                .configure()
                .failFast(true)
                .buildValidatorFactory()
                .getValidator();
    }

    @Test
    void shouldBuildWork() {
        Hole someHole = HoleBuilder.aHole()
                .withType("Foo")
                .build();

        Practice somePractice = PracticeBuilder.aPractice()
                .withName("SomePractice")
                .withResultType("Foo")
                .withResourceTypes(asList("Bar"))
                .build();

        Resource someResource = ResourceBuilder.aResource()
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

        assertThat(validator.validate(anotherWork)).isEmpty();
    }
}
