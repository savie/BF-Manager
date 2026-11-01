package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21496 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69851;

    public /* synthetic */ C21496(int i) {
        this.f69851 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f69851) {
            case 0:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f69851) {
            case 0:
                return ((C5537) obj).f18987 == null;
            default:
                C11948 c11948 = (C11948) obj;
                return (c11948.mo29759() == EnumC23921.ERROR && c11948.m29760(EnumC0264.RECOVERABLE) && !c11948.m29760(EnumC0264.API)) ? false : true;
        }
    }
}
