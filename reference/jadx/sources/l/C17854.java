package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 46D8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17854 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58546;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58547;

    public /* synthetic */ C17854(int i, Object obj) {
        this.f58546 = i;
        this.f58547 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f58546) {
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
        switch (this.f58546) {
            case 0:
                return ((C0599) obj).m2702() == ((C21943) this.f58547);
            default:
                return ((InterfaceC3058) this.f58547).mo9945((String) obj);
        }
    }
}
