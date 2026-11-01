package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15147 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49483;

    public /* synthetic */ C15147(int i) {
        this.f49483 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f49483) {
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
        switch (this.f49483) {
            case 0:
                return (((C19670) obj).f77447 & 4503599627370496L) != 0;
            default:
                return ((C10229) obj).m26017() == null;
        }
    }
}
