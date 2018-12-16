package inc.redpill.works;

import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WorkValidator implements ConstraintValidator<AWork, Work> {

    @Override
    public void initialize(AWork constraintAnnotation) {

    }

    @Override
    public boolean isValid(Work work, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        HibernateConstraintValidatorContext hibernateContext = context.unwrap(HibernateConstraintValidatorContext.class);
        return isTypesMatches(work, hibernateContext);
    }

    private boolean isTypesMatches(Work work, HibernateConstraintValidatorContext context) {
        if (!work.getHole().getType().equals(work.getPractice().getResultType())) {
            context.addMessageParameter("holeType", work.getHole().getType())
                    .addMessageParameter("practiceResultType", work.getPractice().getResultType())
                    .buildConstraintViolationWithTemplate(
                            "work hole type \"{holeType}\" must match to " +
                                    "practice result type \"{practiceResultType}\"")
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
