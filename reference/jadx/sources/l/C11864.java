package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11864 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38242;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38243;

    public /* synthetic */ C11864(int i, Object obj) {
        this.f38242 = i;
        this.f38243 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f38242) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f38242) {
            case 0:
                return ((C25291) obj).f81684.equals((String) this.f38243);
            case 1:
                return ((AbstractC11781) obj) == ((AbstractC11781) this.f38243);
            default:
                AbstractC11781 abstractC11781 = (AbstractC11781) obj;
                return abstractC11781.f38066 == EnumC13603.f43213 && abstractC11781.mo29575() == ((AbstractC19728) this.f38243);
        }
    }
}
