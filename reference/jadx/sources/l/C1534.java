package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1534 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6234;

    public /* synthetic */ C1534(int i) {
        this.f6234 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f6234) {
            case 0:
                break;
            case 1:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f6234) {
            case 0:
                return C13638.nonNull((C15606) obj);
            case 1:
                return C18328.f58465.matcher((String) obj).matches();
            default:
                return ((AbstractC8047) obj).m22847(EnumC18651.f60465);
        }
    }
}
