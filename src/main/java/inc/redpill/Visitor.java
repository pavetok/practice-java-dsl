package inc.redpill;

import inc.redpill.holes.Hole;
import inc.redpill.practices.Practice;
import inc.redpill.resources.Resource;
import inc.redpill.works.Work;

public interface Visitor {

    Context apply(Hole hole, Context context);

    Context apply(Practice practice, Context context);

    Context apply(Resource resource, Context context);

    Context apply(Work work, Context context);
}
