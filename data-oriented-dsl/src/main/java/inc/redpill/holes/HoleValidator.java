package inc.redpill.holes;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HoleValidator implements ConstraintValidator<AHole, Hole> {
    @Override
    public boolean isValid(Hole value, ConstraintValidatorContext context) {
        System.out.println("HoleValidator");
        return true;
    }
}
