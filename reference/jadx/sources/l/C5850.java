package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7D4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5850 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19819;

    public /* synthetic */ C5850(int i) {
        this.f19819 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f19819) {
            case 0:
                break;
            case 1:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f19819) {
            case 0:
                return ((Boolean) obj).booleanValue();
            case 1:
                return ((EnumC15236) obj).m36502();
            default:
                return (((C6656) obj).f22476.f70567 & 2305843009213693952L) == 2305843009213693952L;
        }
    }
}
