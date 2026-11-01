package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16513 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f53041;

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
        boolean z;
        long j = this.f53041;
        C4848 c4848 = (C4848) ((Map.Entry) obj).getValue();
        synchronized (c4848) {
            z = c4848.f17056 && j - c4848.f17073 > 300000;
        }
        return z;
    }
}
