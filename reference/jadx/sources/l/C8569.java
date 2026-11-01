package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8569 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29626;

    public /* synthetic */ C8569(int i, Object obj) {
        this.f29625 = i;
        this.f29626 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f29625) {
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
        switch (this.f29625) {
            case 0:
                return ((C6656) obj).f22478 == ((C6263) this.f29626).f77453;
            default:
                C6990 c6990 = (C6990) this.f29626;
                c6990.getClass();
                if (((C11948) obj).m29767() == EnumC17198.ERROR) {
                    c6990.f23516 = true;
                }
                return true;
        }
    }
}
