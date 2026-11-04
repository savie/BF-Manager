package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L6E6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1995 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6656;

    public /* synthetic */ C1995(int i) {
        this.f6656 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f6656) {
            case 0:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f6656) {
            case 0:
                return ((InterfaceC20640) obj).getType().m5569();
            default:
                return true;
        }
    }
}
