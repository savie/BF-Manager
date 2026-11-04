package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17546 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57022;

    public /* synthetic */ C17546(int i) {
        this.f57022 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f57022) {
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
        switch (this.f57022) {
            case 0:
                AbstractC22044 abstractC22044 = (AbstractC22044) obj;
                return abstractC22044.getName().endsWith(".mtsx") && abstractC22044.mo4304();
            case 1:
                return !((InterfaceC11851) ((Map.Entry) obj).getValue()).mo1794();
            default:
                return ((C8274) obj).m22338() != null;
        }
    }
}
