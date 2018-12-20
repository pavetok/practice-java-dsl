package inc.redpill.practices;

import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashMap;
import java.util.Map;

public class PracticeValidator implements ConstraintValidator<APractice, Practice> {
    @Override
    public boolean isValid(Practice value, ConstraintValidatorContext context) {
        System.out.println("PracticeValidator");
        Map<String, Object> payload = context
                .unwrap( HibernateConstraintValidatorContext.class )
                .getConstraintValidatorPayload(HashMap.class);
        System.out.println(payload);
        return true;
    }
}
