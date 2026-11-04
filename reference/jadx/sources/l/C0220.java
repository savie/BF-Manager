package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6H9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0220 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1426;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1427;

    public /* synthetic */ C0220(int i, Object obj) {
        this.f1426 = i;
        this.f1427 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f1426) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1426) {
            case 0:
                String str = (String) this.f1427;
                ((C2457) obj).m8286();
                return "dex-input".equals(str);
            case 1:
                return !((C14769) this.f1427).contains((AbstractC22664) obj);
            default:
                return ((C24047) obj).f77785 == ((C14106) this.f1427);
        }
    }
}
