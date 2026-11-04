package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24316 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f78713;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f78714;

    public /* synthetic */ C24316(int i, Object obj) {
        this.f78713 = i;
        this.f78714 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f78713) {
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
        switch (this.f78713) {
            case 0:
                C7660 c7660 = (C7660) obj;
                return c7660.m20873() == EnumC3185.f10346 && c7660.f25232.f61224.equals((C7660) this.f78714);
            default:
                return EnumC5202.m15632((String) this.f78714, (EnumC5202) obj);
        }
    }
}
