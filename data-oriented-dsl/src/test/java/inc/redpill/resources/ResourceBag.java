package inc.redpill.resources;

import inc.redpill.resources.Resource.ResourceBuilder;

import static inc.redpill.resources.Resource.ResourceBuilder.aResource;
import static java.lang.String.format;

public class ResourceBag {
    public static ResourceBuilder resource(int i) {
        return aResource()
                .withType(format("resource-type-%s", i));
    }
}
