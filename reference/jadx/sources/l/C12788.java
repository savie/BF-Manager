package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T6GT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12788 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40903;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16678 f40904;

    public /* synthetic */ C12788(AbstractC16678 abstractC16678, int i) {
        this.f40903 = i;
        this.f40904 = abstractC16678;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f40903) {
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
        switch (this.f40903) {
            case 0:
                return C23231.m52193(((C19684) obj).m45368(), (C21943) this.f40904);
            default:
                return ((AbstractC16481) obj) != ((AbstractC16481) this.f40904);
        }
    }
}
