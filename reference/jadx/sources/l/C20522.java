package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20522 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66499;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66500;

    public /* synthetic */ C20522(int i, Object obj) {
        this.f66499 = i;
        this.f66500 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f66499) {
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
        switch (this.f66499) {
            case 0:
                return ((AbstractC16579) obj).f53222 == ((C22492) this.f66500);
            case 1:
                return !((C20234) this.f66500).mo26254(Integer.valueOf(((InterfaceC20608) obj).getPosition()));
            case 2:
                return ((String) obj).contains(((EnumC15934) this.f66500).m37893());
            default:
                AbstractC8774 abstractC8774 = (AbstractC8774) obj;
                return C3128.m9466(abstractC8774) && abstractC8774 != ((AbstractC8774) this.f66500);
        }
    }
}
