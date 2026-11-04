package l;

import java.util.HashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰ֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6I0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14243 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45002;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45003;

    public /* synthetic */ C14243(int i, Object obj) {
        this.f45002 = i;
        this.f45003 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f45002) {
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
        switch (this.f45002) {
            case 0:
                return ((C6041) obj) == ((C6041) this.f45003);
            default:
                return C19518.m45052((HashMap) this.f45003, (InterfaceC18078) obj);
        }
    }
}
