package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6191 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21087;

    public /* synthetic */ C6191(int i) {
        this.f21087 = i;
    }

    public /* synthetic */ C6191(C0224 c0224) {
        this.f21087 = 0;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f21087) {
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
        switch (this.f21087) {
            case 0:
                return C0224.m1681((InterfaceC16454) obj);
            case 1:
                return ((AbstractC22664) obj).f73596.m29562();
            case 2:
                return ((AbstractC22664) obj).mo40454();
            default:
                EnumC7466 enumC7466 = (EnumC7466) obj;
                return enumC7466 == EnumC7466.f24655 || enumC7466 == EnumC7466.f24632 || enumC7466 == EnumC7466.f24642 || enumC7466 == EnumC7466.f24600;
        }
    }
}
