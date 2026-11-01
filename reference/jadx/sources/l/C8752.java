package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8752 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7340 f30084;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f30085;

    public /* synthetic */ C8752(C7340 c7340, long j) {
        this.f30084 = c7340;
        this.f30085 = j;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return C7340.m19611(this.f30084, this.f30085, (Map.Entry) obj);
    }
}
