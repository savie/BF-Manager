package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18798 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60929;

    public /* synthetic */ C18798(int i) {
        this.f60929 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f60929) {
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
        switch (this.f60929) {
            case 0:
                return C13638.nonNull((AbstractC12449) obj);
            default:
                return ((AbstractC23903) obj).f77452 == EnumC10477.f35865;
        }
    }
}
