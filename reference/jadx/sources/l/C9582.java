package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W18B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9582 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31012;

    public /* synthetic */ C9582(int i) {
        this.f31012 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f31012) {
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
        switch (this.f31012) {
            case 0:
                return ((EnumC2536) obj).m8462();
            case 1:
                return EnumC21533.m48978((InterfaceC12582) obj);
            default:
                return ((AbstractC11781) obj).f38066 == EnumC13603.f43218;
        }
    }
}
