package inc.redpill.practices;

import inc.redpill.practices.Practice.PracticeBuilder;

import static inc.redpill.practices.Practice.PracticeBuilder.aPractice;
import static java.lang.String.format;
import static java.util.Collections.singletonList;

public class PracticeBag {
    public static PracticeBuilder practice() {
        return practice(0);
    }

    public static PracticeBuilder practice(int i) {
        return aPractice()
                .withName(format("practice-name-%s", i))
                .withResultType(format("result-type-%s", i))
                .withResourceTypes(singletonList(format("resource-type-%s", i)));
    }
}
