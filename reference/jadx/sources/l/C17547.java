package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W856 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17547 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57023;

    public /* synthetic */ C17547(int i) {
        this.f57023 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f57023) {
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
        switch (this.f57023) {
            case 0:
                return C17359.nonNull((InterfaceC6281) obj);
            case 1:
                return ((C7518) obj).f24837.endsWith("$");
            default:
                return C20174.m46409(((InterfaceC2386) obj).getPath());
        }
    }
}
