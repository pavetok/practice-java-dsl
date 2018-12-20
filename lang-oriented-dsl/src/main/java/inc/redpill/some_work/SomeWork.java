package inc.redpill.some_work;


public class SomeWork implements SomePractice {

    private SomeResource someResource;
    private SomeCompetence someCompetence;

    @Override
    public SomeWork withResource(SomeResource resource) {
        this.someResource = resource;
        return this;
    }

    @Override
    public SomeWork withResource(SomeCompetence competence) {
        this.someCompetence = competence;
        return this;
    }

    @Override
    public SomeResource make() {
        return someResource;
    }
}
