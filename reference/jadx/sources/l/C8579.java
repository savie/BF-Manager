package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8579 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28016;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28017;

    public /* synthetic */ C8579(int i, Object obj) {
        this.f28016 = i;
        this.f28017 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f28016) {
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
        switch (this.f28016) {
            case 0:
                return EnumC5202.m15634((EnumC22356) this.f28017, (EnumC5202) obj);
            default:
                return ((C22763) this.f28017).m51341((AbstractC22044) obj);
        }
    }
}
