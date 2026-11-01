package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11827 implements Predicate {
    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC20745 abstractC20745 = (AbstractC20745) obj;
        if (!abstractC20745.mo33971()) {
            return false;
        }
        String name = abstractC20745.getName();
        return name.endsWith(".jks") || name.endsWith(".bks") || name.endsWith(".keystore");
    }
}
