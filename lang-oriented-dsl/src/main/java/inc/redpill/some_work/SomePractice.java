package inc.redpill.some_work;

import inc.redpill.core.Practice;

public interface SomePractice extends Practice<SomeResource> {

    SomePractice withResource(SomeResource resource);

    SomePractice withResource(SomeCompetence competence);
}
