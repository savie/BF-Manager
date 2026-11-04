package l;

import android.text.TextWatcher;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: DBK8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14740 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48155;

    public /* synthetic */ C14740(int i) {
        this.f48155 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f48155) {
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
        C21943 c21943M2702;
        C21943 c21943M2704;
        switch (this.f48155) {
            case 0:
                return ((TextWatcher) obj) instanceof C21454;
            case 1:
                C0599 c0599 = (C0599) obj;
                return (c0599.m2703() != EnumC18498.BACK_EDGE || (c21943M2702 = c0599.m2702()) == (c21943M2704 = c0599.m2704()) || c21943M2704.m49651().get(c21943M2702.getId())) ? false : true;
            default:
                return ((C8274) obj).m22338() == null;
        }
    }
}
