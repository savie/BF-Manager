package l;

import android.text.TextWatcher;
import com.alipay.sdk.m.t.e;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2340 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7556;

    public /* synthetic */ C2340(int i) {
        this.f7556 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f7556) {
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
        switch (this.f7556) {
            case 0:
                AbstractC22044 abstractC22044 = (AbstractC22044) obj;
                if (abstractC22044.mo4281()) {
                    AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("dex");
                    if (!abstractC22044M49876.mo4281() || !abstractC22044M49876.m49876(e.m).mo4281()) {
                        AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("arsc");
                        if (!abstractC22044M49877.mo4281() || !abstractC22044M49877.m49876(e.m).mo4281()) {
                        }
                    }
                    return true;
                }
                return false;
            case 1:
                return ((TextWatcher) obj) instanceof C21454;
            default:
                int i = ActivityC0848.f3169;
                return ((AbstractC9051) obj) instanceof C2776;
        }
    }
}
