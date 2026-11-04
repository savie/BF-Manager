package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6803 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22663;

    public /* synthetic */ C6803(int i) {
        this.f22663 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f22663) {
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
        switch (this.f22663) {
            case 0:
                InterfaceC8966 interfaceC8966 = (InterfaceC8966) obj;
                return interfaceC8966.mo9807() == interfaceC8966.mo9796() && interfaceC8966.mo9803() == interfaceC8966.mo9801() && interfaceC8966.mo20528() == interfaceC8966.mo20522() && interfaceC8966.mo20524() == interfaceC8966.mo20518();
            case 1:
                return ((AbstractC18367) obj).m21911(EnumC21461.f68552);
            default:
                return ((AbstractC18367) obj).m42832();
        }
    }
}
