package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21386 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69534;

    public /* synthetic */ C21386(int i) {
        this.f69534 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f69534) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f69534) {
            case 0:
                int i = ActivityC5677.f19358;
                return ((AbstractC22611) obj) instanceof C11613;
            case 1:
                return false;
            case 2:
                return ((int[]) ((Map.Entry) obj).getValue())[0] != -1;
            default:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
        }
    }
}
