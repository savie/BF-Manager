package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4725 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16647;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f16647) {
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
        switch (this.f16647) {
            case 0:
                return ((C18959) obj).m44039() == 1;
            case 1:
                return ((C13164) obj).m32686();
            default:
                return ((AbstractC18367) obj) instanceof AbstractC22295;
        }
    }
}
