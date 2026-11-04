package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6HJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5273 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18574;

    public /* synthetic */ C5273(int i) {
        this.f18574 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f18574) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f18574) {
            case 0:
                return ((C2551) obj).m8516().getState().m19341();
            case 1:
                return C8314.m22411(((C6041) obj).m39118(), EnumC24203.IF);
            case 2:
                return C0503.class.isInstance((InterfaceC20640) obj);
            default:
                return C11239.m28351((AbstractC8036) ((C21351) obj).f68007.f48335);
        }
    }
}
