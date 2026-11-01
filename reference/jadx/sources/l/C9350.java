package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 150C */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9350 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31698;

    public /* synthetic */ C9350(int i) {
        this.f31698 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f31698) {
            case 0:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f31698) {
            case 0:
                AbstractC20745 abstractC20745 = (AbstractC20745) obj;
                return abstractC20745.mo33971() && abstractC20745.getName().toLowerCase().endsWith(".mtd");
            default:
                return C13638.nonNull((C11086) obj);
        }
    }
}
