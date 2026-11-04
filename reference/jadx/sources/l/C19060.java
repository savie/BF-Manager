package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19060 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61752;

    public /* synthetic */ C19060(int i) {
        this.f61752 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f61752) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f61752) {
            case 0:
                return true;
            case 1:
                return ((C21943) obj).mo17865(EnumC1763.EXC_TOP_SPLITTER);
            case 2:
                return ((C18959) obj).getType() == EnumC24203.PHI;
            case 3:
                return ((InterfaceC12582) obj) == EnumC21533.OVERRIDE_READ_ONLY;
            default:
                return C17359.nonNull((AbstractC3152) obj);
        }
    }
}
