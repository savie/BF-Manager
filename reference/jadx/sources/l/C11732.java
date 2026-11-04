package l;

/* JADX INFO: renamed from: l.ۧܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V702 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11732 implements InterfaceC11930 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4245 f37955;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17677 f37956;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f37957;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16207 f37958;

    public C11732(C16207 c16207, C17677 c17677, C4245 c4245, int i) {
        this.f37958 = c16207;
        this.f37956 = c17677;
        this.f37955 = c4245;
        this.f37957 = i;
    }

    @Override // l.InterfaceC11930
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo29465() {
        C16207 c16207 = this.f37958;
        C13224 c13224 = c16207.f52639;
        c13224.f42244 = this.f37957;
        C4245 c4245 = this.f37955;
        c13224.f42232 = c4245.start();
        c13224.f42212 = c4245.end();
        c13224.f42248 = -1;
        c13224.f42216 = -1;
        c16207.m38460(c13224, this.f37956, c4245);
        return c13224.f42216;
    }
}
