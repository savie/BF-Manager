package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6964 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23401;

    public /* synthetic */ C6964(int i) {
        this.f23401 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f23401) {
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
        switch (this.f23401) {
            case 0:
                return true;
            case 1:
                return !((AbstractC8047) obj).m21179();
            default:
                return C7735.m20385((AbstractC23903) obj);
        }
    }
}
