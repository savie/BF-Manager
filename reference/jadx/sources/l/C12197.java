package l;

import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5G5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12197 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40799;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40800;

    public /* synthetic */ C12197(int i, Object obj) {
        this.f40799 = i;
        this.f40800 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f40799) {
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
        switch (this.f40799) {
            case 0:
                return ((Set) this.f40800).contains((String) obj);
            case 1:
                return C3128.m9440((AbstractC23903) this.f40800, (AbstractC5930) obj, true) != null;
            case 2:
                return C21017.m47232((C21017) this.f40800, (C11867) obj);
            default:
                return !((C21825) this.f40800).contains((AbstractC16579) obj);
        }
    }
}
