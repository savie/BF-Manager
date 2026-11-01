package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19LE */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3704 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13502;

    public /* synthetic */ C3704(int i) {
        this.f13502 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f13502) {
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
        switch (this.f13502) {
            case 0:
                return ((C22050) obj).f71469 == 1649176686;
            default:
                return ((AbstractC23903) obj).f77452 == EnumC10477.f35879;
        }
    }
}
