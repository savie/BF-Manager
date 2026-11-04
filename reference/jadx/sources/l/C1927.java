package l;

/* JADX INFO: renamed from: l.֫۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1UY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1927 implements InterfaceC11621 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11621 f6472;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f6473 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f6474;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f6475;

    public C1927(int i, int i2, InterfaceC11621 interfaceC11621) {
        this.f6475 = i2;
        this.f6474 = i & 7;
        this.f6472 = interfaceC11621;
    }

    @Override // l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6610(C21383 c21383, C18399 c18399) {
        int iM35294 = c18399.m35294();
        if ((this.f6473 & (~iM35294)) == 0 && (this.f6475 & iM35294) == 0) {
            int i = this.f6474;
            if (i == 0 || (iM35294 & i) != 0) {
                this.f6472.mo6610(c21383, c18399);
            }
        }
    }

    @Override // l.InterfaceC11621
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6609(C21383 c21383, C7958 c7958) {
        int iM35294 = c7958.m35294();
        if ((this.f6473 & (~iM35294)) == 0 && (this.f6475 & iM35294) == 0) {
            int i = this.f6474;
            if (i == 0 || (iM35294 & i) != 0) {
                this.f6472.mo6609(c21383, c7958);
            }
        }
    }
}
