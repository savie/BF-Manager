package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18035 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59055;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f59056;

    public /* synthetic */ C18035(int i, Object obj) {
        this.f59055 = i;
        this.f59056 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f59055) {
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
        switch (this.f59055) {
            case 0:
                return ((AbstractC22664) obj).m51073(((C2596) this.f59056).f8340);
            default:
                C17929 c17929 = ((C5997) this.f59056).f20519;
                return C17929.m41842(c17929, c17929.f58739.f48286.f73596, ((C12510) obj).f40164, C14769.m35543()) == null;
        }
    }
}
