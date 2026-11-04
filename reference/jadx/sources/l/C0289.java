package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0289 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1602;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1603;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1604;

    public /* synthetic */ C0289(int i, Object obj, Object obj2) {
        this.f1602 = i;
        this.f1604 = obj;
        this.f1603 = obj2;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f1602) {
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
        switch (this.f1602) {
            case 0:
                return ((C24705) this.f1604).m55070((C24550) ((AbstractC11781) obj), (C24550) this.f1603);
            default:
                String str = (String) obj;
                return str.equals((String) this.f1604) || str.startsWith((String) this.f1603);
        }
    }
}
