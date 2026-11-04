package l;

import android.app.ActivityManager;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18297 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59659;

    public /* synthetic */ C18297(int i) {
        this.f59659 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f59659) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f59659) {
            case 0:
                return ((Set) ((Map.Entry) obj).getValue()).isEmpty();
            case 1:
                return ActivityC23324.m52477((ActivityManager.AppTask) obj);
            case 2:
                return ((AbstractC1566) obj).mo5564();
            default:
                C12971 c12971 = (C12971) obj;
                return c12971.m32368().isEmpty() || c12971.m32377().isEmpty();
        }
    }
}
