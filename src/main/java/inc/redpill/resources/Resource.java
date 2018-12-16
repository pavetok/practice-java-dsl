package inc.redpill.resources;

import inc.redpill.Visitable;
import inc.redpill.Visitor;

import javax.validation.constraints.NotBlank;

public class Resource implements Visitable {
    @NotBlank
    private String type;

    @Override
    public void visit(Visitor visitor) {
        visitor.apply(this);
    }

    public static final class ResourceBuilder {
        private String type;

        private ResourceBuilder() {
        }

        public static ResourceBuilder aResource() {
            return new ResourceBuilder();
        }

        public ResourceBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public Resource build() {
            Resource resource = new Resource();
            resource.type = this.type;
            return resource;
        }
    }
}
