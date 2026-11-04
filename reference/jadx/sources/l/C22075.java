package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: AIYD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22075 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71169;

    public /* synthetic */ C22075(int i) {
        this.f71169 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f71169) {
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
        switch (this.f71169) {
            case 0:
                return C17359.nonNull((AbstractC1566) obj);
            case 1:
                return ((Integer) ((Map.Entry) obj).getValue()).intValue() > 3;
            default:
                return ((AbstractC18367) obj).m21911(EnumC21461.f68552);
        }
    }
}
