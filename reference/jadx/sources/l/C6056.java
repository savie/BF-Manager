package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6056 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20556;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20557;

    public /* synthetic */ C6056(int i, Object obj) {
        this.f20556 = i;
        this.f20557 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f20556) {
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
        switch (this.f20556) {
            case 0:
                return C21017.m47231((C21017) this.f20557, (AbstractC11242) obj);
            default:
                return ((C6656) obj).f22478 == ((C6656) this.f20557).f22478;
        }
    }
}
