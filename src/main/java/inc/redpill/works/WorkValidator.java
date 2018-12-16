package inc.redpill.works;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WorkValidator implements ConstraintValidator<AWork, Work> {

    @Override
    public void initialize(AWork constraintAnnotation) {

    }

    @Override
    public boolean isValid(Work work, ConstraintValidatorContext context) {
        // context.disableDefaultConstraintViolation();
        return true;
    }
}
