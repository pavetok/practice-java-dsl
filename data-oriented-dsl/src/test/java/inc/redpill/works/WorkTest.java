package inc.redpill.works;

import inc.redpill.holes.HoleCheck;
import inc.redpill.practices.PracticeCheck;
import inc.redpill.resources.ResourceCheck;
import org.hibernate.validator.HibernateValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.validation.ConstraintViolation;
import javax.validation.Path;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static inc.redpill.holes.HoleBag.hole;
import static inc.redpill.works.WorkBag.work;
import static org.assertj.core.api.Assertions.assertThat;

public class WorkTest {

    private static Validator validator;

    @BeforeAll
    public static void setUpValidator() {
        Map<String, Object> context = new HashMap<>();
        context.put("foo", "bar");
        validator = Validation.byProvider(HibernateValidator.class)
                .configure()
                .failFast(true)
                .constraintValidatorPayload(context)
                .buildValidatorFactory()
                .getValidator();
    }

    @ParameterizedTest
    @MethodSource("workProvider")
    public void shouldValidateWork(String path, String message, Work work) {
        // when
        Set<ConstraintViolation<Work>> violations = validator.validate(work, Default.class, WorkCheck.class, HoleCheck.class, PracticeCheck.class, ResourceCheck.class);
        // then
        assertThat(violations)
                .extracting(ConstraintViolation::getPropertyPath)
                .extracting(Path::toString)
                .containsOnly(path);
        // and
        assertThat(violations)
                .extracting(ConstraintViolation::getMessage)
                .containsOnly(message);
    }

    static Stream<Arguments> workProvider() {
        return Stream.of(
                Arguments.of("hole", "must not be null",
                        work().withHole(null).withPractice(null).build()),
                Arguments.of("hole.type", "must not be blank",
                        work().withHole(hole().withType(null).build()).withPractice(null).build())
        );
    }
}
