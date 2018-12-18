package inc.redpill.practices;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PracticeValidator implements ConstraintValidator<APractice, Practice> {
    @Override
    public boolean isValid(Practice value, ConstraintValidatorContext context) {
        System.out.print("PracticeValidator");
        return false;
    }
}
