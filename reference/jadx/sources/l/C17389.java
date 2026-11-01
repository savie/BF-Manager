package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R78D */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17389 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55351;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f55352;

    public /* synthetic */ C17389(int i, Object obj) {
        this.f55351 = i;
        this.f55352 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f55351) {
            case 0:
                break;
            case 1:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f55351) {
            case 0:
                return ((String) obj).startsWith((String) this.f55352);
            case 1:
                return ((String) this.f55352).equals(((C19485) obj).f62710);
            default:
                Predicate predicate = (Predicate) this.f55352;
                AbstractC23903 abstractC23903 = (AbstractC23903) obj;
                return !abstractC23903.f77448.m52721() && (predicate == null || predicate.test(abstractC23903));
        }
    }
}
