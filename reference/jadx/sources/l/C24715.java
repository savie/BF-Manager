package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24715 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f79992;

    public /* synthetic */ C24715(int i) {
        this.f79992 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f79992) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f79992) {
            case 0:
                return ((AbstractC9051) obj) instanceof C2776;
            case 1:
                return !((C15169) obj).f49463.isEmpty();
            case 2:
                return C12510.class.isInstance((InterfaceC19637) obj);
            default:
                return ((C18959) obj).mo17865(EnumC1763.FORCE_ASSIGN_INLINE);
        }
    }
}
