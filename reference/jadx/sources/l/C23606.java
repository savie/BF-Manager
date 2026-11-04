package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹ܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23606 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76633;

    public /* synthetic */ C23606(int i, Object obj) {
        this.f76632 = i;
        this.f76633 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f76632) {
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
        switch (this.f76632) {
            case 0:
                return ((AbstractC11781) obj) == ((AbstractC11781) this.f76633);
            default:
                return C15616.m37358((C21943) obj, (C2551) this.f76633);
        }
    }
}
