package inc.redpill.works;

import inc.redpill.practices.PracticeCheck;
import inc.redpill.resources.ResourceCheck;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({Default.class, PracticeCheck.class, ResourceCheck.class})
public interface WorkCheck {
    //    public interface WorkCheck extends InferenceCheck {
}
