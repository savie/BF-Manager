package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DT */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19641 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63272;

    public /* synthetic */ C19641(int i, Object obj) {
        this.f63271 = i;
        this.f63272 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f63271) {
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
        switch (this.f63271) {
            case 0:
                return C17359.equals(((C17467) obj).getType().mo5555(), (AbstractC1566) this.f63272);
            default:
                return ((C13015) this.f63272).m32433((EnumC7687) obj);
        }
    }
}
