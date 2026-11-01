package l;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.֡᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0749 implements IntPredicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntPredicate b;
    public final /* synthetic */ IntPredicate c;

    public /* synthetic */ C0749(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
        this.a = i;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return C23329.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return C23329.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return C23329.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        switch (this.a) {
            case 0:
                return this.b.test(i) || this.c.test(i);
            default:
                return this.b.test(i) && this.c.test(i);
        }
    }
}
