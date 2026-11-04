package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22511 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72820;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72821;

    public /* synthetic */ C22511(int i, Object obj) {
        this.f72820 = i;
        this.f72821 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f72820) {
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
        switch (this.f72820) {
            case 0:
                C6633 c6633 = (C6633) this.f72821;
                C10377 c10377 = ((C22224) obj).f71601;
                return c10377 == c6633.f22152 && (c10377.f38071 & 16777216) == 0;
            default:
                return ((AbstractC15340) obj).test((AbstractC22664) this.f72821);
        }
    }
}
