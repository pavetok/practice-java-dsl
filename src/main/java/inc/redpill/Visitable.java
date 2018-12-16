package inc.redpill;

public interface Visitable {
    Context visit(Visitor visitor, Context context);
}
