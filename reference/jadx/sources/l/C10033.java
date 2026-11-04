package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10033 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9287 f32163;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9287 f32164;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        C9287 c9287M22864 = C8542.m22864((byte[]) obj);
        if (c9287M22864.m24500() != EnumC2576.SUCCESS) {
            this.f32163 = c9287M22864;
            return false;
        }
        this.f32164 = c9287M22864;
        return true;
    }
}
