package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7E3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10693 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33931;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33932;

    public /* synthetic */ C10693(int i, Object obj) {
        this.f33931 = i;
        this.f33932 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f33931) {
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
        switch (this.f33931) {
            case 0:
                return ((String) obj).contains(((EnumC19644) this.f33932).m45289());
            default:
                return ((C11273) this.f33932).m28527(C11293.m28558((String) obj));
        }
    }
}
