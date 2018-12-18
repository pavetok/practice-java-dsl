package inc.redpill.groups;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({Default.class, PracticeCheck.class, ResourceCheck.class})
//@GroupSequence({Default.class, ResourceCheck.class, PracticeCheck.class})
public interface WorkCheck {
    //    public interface WorkCheck extends InferenceCheck {
    //    public interface WorkCheck extends Default {
}
