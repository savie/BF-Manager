package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20869 implements Predicate {
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
        char c;
        C18631 c18631 = (C18631) obj;
        return (c18631.f60555 == 65535 || (c = c18631.f60554) == 65535 || c <= 0) ? false : true;
    }
}
