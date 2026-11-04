package l;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0980 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3571;

    public /* synthetic */ C0980(int i, Object obj) {
        this.f3570 = i;
        this.f3571 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f3570) {
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
        switch (this.f3570) {
            case 0:
                String str = (String) obj;
                Iterator it = ((List) this.f3571).iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                return ((Boolean) ((C22688) this.f3571).invoke(obj)).booleanValue();
            default:
                C17467 c17467 = (C17467) obj;
                return c17467.mo8547().m26533(1, 8, 16) && c17467.mo13008().m34149().equals(((C24927) this.f3571).m55571().getType());
        }
    }
}
