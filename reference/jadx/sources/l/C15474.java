package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15474 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50423;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50424;

    public /* synthetic */ C15474(String str, int i) {
        this.f50423 = i;
        this.f50424 = str;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f50423) {
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
        switch (this.f50423) {
            case 0:
                return ((C18295) obj).f58374.equals(this.f50424);
            default:
                return C5553.m15319((String) obj, this.f50424);
        }
    }
}
