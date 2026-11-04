package l;

import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4110 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13976;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13977;

    public /* synthetic */ C4110(int i, Object obj) {
        this.f13976 = i;
        this.f13977 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f13976) {
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
        switch (this.f13976) {
            case 0:
                return C11239.m28319(((C20605) obj).f66030) == ((AbstractC19728) this.f13977);
            default:
                return ((HashSet) this.f13977).contains((C9636) obj);
        }
    }
}
