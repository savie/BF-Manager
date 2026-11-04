package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R98O */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16541 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53544;

    public /* synthetic */ C16541(int i) {
        this.f53544 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f53544) {
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
        switch (this.f53544) {
            case 0:
                int i = C23255.f75338;
                String strMo31674 = ((AbstractC22484) obj).mo31674();
                return (C17359.equals(strMo31674, "builtin:selectAll") || C17359.equals(strMo31674, "builtin:selectText") || C17359.equals(strMo31674, "builtin:paste") || C17359.equals(strMo31674, "builtin:delete")) ? false : true;
            case 1:
                return ((C2551) obj).m8529();
            default:
                return ((InterfaceC5075) obj) != null;
        }
    }
}
