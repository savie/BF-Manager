package l;

import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3914 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13373;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13374;

    public /* synthetic */ C3914(int i, Object obj) {
        this.f13373 = i;
        this.f13374 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f13373) {
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
        switch (this.f13373) {
            case 0:
                return ((HashSet) this.f13374).contains((AbstractC11781) obj);
            default:
                C0092 c0092 = (C0092) this.f13374;
                c0092.getClass();
                if (((C17007) obj).m40089() == EnumC22229.ERROR) {
                    c0092.f1002 = true;
                }
                return true;
        }
    }
}
