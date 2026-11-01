package l;

/* JADX INFO: renamed from: l.ܺۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V702 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15765 implements InterfaceC16905 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12237 f51069;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6222 f51070;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6134 f51071;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f51072;

    public C15765(C12237 c12237, C6134 c6134, C6222 c6222, int i) {
        this.f51069 = c12237;
        this.f51071 = c6134;
        this.f51070 = c6222;
        this.f51072 = i;
    }

    @Override // l.InterfaceC16905
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo37512() {
        C12237 c12237 = this.f51069;
        C10120 c10120 = c12237.f40901;
        c10120.f34556 = this.f51072;
        C6222 c6222 = this.f51070;
        c10120.f34566 = c6222.start();
        c10120.f34578 = c6222.end();
        c10120.f34540 = -1;
        c10120.f34542 = -1;
        c12237.m30375(c10120, this.f51071, c6222);
        return c10120.f34542;
    }
}
