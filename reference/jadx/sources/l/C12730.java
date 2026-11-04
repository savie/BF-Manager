package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6HJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12730 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40757;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40758;

    public /* synthetic */ C12730(int i, Object obj) {
        this.f40757 = i;
        this.f40758 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f40757) {
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
        switch (this.f40757) {
            case 0:
                return C11984.m30093((C11984) this.f40758, (AbstractC12531) obj);
            default:
                return ((String) obj).startsWith((String) this.f40758);
        }
    }
}
