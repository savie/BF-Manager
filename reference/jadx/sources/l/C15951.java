package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15951 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51659;

    public /* synthetic */ C15951(int i) {
        this.f51659 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f51659) {
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
        switch (this.f51659) {
            case 0:
                AbstractC20745 abstractC20745 = (AbstractC20745) obj;
                return abstractC20745.getName().endsWith(".mtsx") && abstractC20745.mo33971();
            case 1:
                return !((String) obj).isEmpty();
            case 2:
                return ((AbstractC16579) obj).m39001(EnumC6617.WILDCARD);
            default:
                return true;
        }
    }
}
