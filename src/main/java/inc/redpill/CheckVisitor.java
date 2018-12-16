package inc.redpill;

import inc.redpill.holes.Hole;
import inc.redpill.practices.Practice;
import inc.redpill.resources.Resource;
import inc.redpill.works.Work;

public class CheckVisitor implements Visitor {

    @Override
    public Context apply(Hole hole, Context context) {
        return null;
    }

    @Override
    public Context apply(Practice practice, Context context) {
        return null;
    }

    @Override
    public Context apply(Resource resource, Context context) {
        return null;
    }

    @Override
    public Context apply(Work work, Context context) {
        Context context1 = apply(work.getHole(), context);
        Context context2 = apply(work.getPractice(), context1);
        Context context3 = context2;
        for (Resource resource : work.getResources()) {
            context3 = apply(resource, context3);
        }
        Context context4 = context3;
        for (Work w : work.getWorks()) {
            context4 = apply(w, context3);
        }
        return context4;
    }
}
