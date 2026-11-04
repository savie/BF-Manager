package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12928 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41407;

    public /* synthetic */ C12928(int i) {
        this.f41407 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f41407) {
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
        switch (this.f41407) {
            case 0:
                return ((C17467) obj).getName().equals("$VALUES");
            case 1:
                return ((AbstractC22664) obj).m51067(EnumC21172.UNDETVAR);
            default:
                return ((C24047) obj).f77786 == null;
        }
    }
}
