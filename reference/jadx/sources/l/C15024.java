package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15024 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48988;

    public /* synthetic */ C15024(int i) {
        this.f48988 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f48988) {
            case 0:
                break;
            case 1:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f48988) {
            case 0:
                return C13638.nonNull((C18551) obj);
            case 1:
                return ((C22722) obj).m50365();
            default:
                return C3128.m9470((AbstractC8774) ((C18630) obj).f60400.f70876);
        }
    }
}
