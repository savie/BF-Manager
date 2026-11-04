package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24727 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f80041;

    public /* synthetic */ C24727(int i) {
        this.f80041 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f80041) {
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
        switch (this.f80041) {
            case 0:
                return ((AbstractC20997) obj).mo19009();
            case 1:
                String str = (String) obj;
                return C14584.m35214(str) || C14584.m35210(str);
            default:
                return ((AbstractC22044) obj).mo2934();
        }
    }
}
