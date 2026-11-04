package l;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4593 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16312;

    public /* synthetic */ C4593(int i) {
        this.f16312 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f16312) {
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
        switch (this.f16312) {
            case 0:
                return ((List) ((Map.Entry) obj).getValue()).size() > 1;
            default:
                return ((C17467) obj).getType().m5554();
        }
    }
}
