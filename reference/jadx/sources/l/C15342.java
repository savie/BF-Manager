package l;

import android.content.pm.PackageInfo;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66FP */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15342 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50097;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f50097) {
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
        switch (this.f50097) {
            case 0:
                PackageInfo packageInfo = (PackageInfo) obj;
                return packageInfo == null || packageInfo.packageName == null;
            case 1:
                return ((int[]) ((Map.Entry) obj).getValue())[0] != -1;
            default:
                return ((Integer) ((Map.Entry) obj).getValue()).intValue() > 1;
        }
    }
}
