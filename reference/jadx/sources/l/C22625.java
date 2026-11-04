package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22625 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73219;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f73219) {
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
        switch (this.f73219) {
            case 0:
                return ((C17467) obj).mo8547().m26540();
            default:
                AbstractC11781 abstractC11781 = (AbstractC11781) obj;
                return abstractC11781.m29588() && abstractC11781.f38066 == EnumC13603.f43205;
        }
    }
}
