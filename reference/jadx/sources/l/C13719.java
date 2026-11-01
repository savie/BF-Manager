package l;

/* JADX INFO: renamed from: l.ܰۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13719 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6694 f45231;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f45232;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f45233;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f45234;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11634 f45235 = new C11634(new byte[64], 64);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15440 f45236;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f45237;

    public C13719(InterfaceC15440 interfaceC15440, C6694 c6694) {
        this.f45236 = interfaceC15440;
        this.f45231 = c6694;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33424() {
        this.f45234 = false;
        this.f45236.mo2887();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33425(C2460 c2460) {
        C11634 c11634 = this.f45235;
        c2460.m7507(0, 3, c11634.f39082);
        c11634.m29029(0);
        c11634.m29034(8);
        this.f45232 = c11634.m29035();
        this.f45233 = c11634.m29035();
        c11634.m29034(6);
        c2460.m7507(0, c11634.m29039(8), c11634.f39082);
        c11634.m29029(0);
        this.f45237 = 0L;
        if (this.f45232) {
            c11634.m29034(4);
            long jM29039 = ((long) c11634.m29039(3)) << 30;
            c11634.m29034(1);
            long jM290310 = jM29039 | ((long) (c11634.m29039(15) << 15));
            c11634.m29034(1);
            long jM290311 = jM290310 | ((long) c11634.m29039(15));
            c11634.m29034(1);
            boolean z = this.f45234;
            C6694 c6694 = this.f45231;
            if (!z && this.f45233) {
                c11634.m29034(4);
                long jM290312 = ((long) c11634.m29039(3)) << 30;
                c11634.m29034(1);
                long jM290313 = jM290312 | ((long) (c11634.m29039(15) << 15));
                c11634.m29034(1);
                long jM290314 = ((long) c11634.m29039(15)) | jM290313;
                c11634.m29034(1);
                c6694.m18077(jM290314);
                this.f45234 = true;
            }
            this.f45237 = c6694.m18077(jM290311);
        }
        long j = this.f45237;
        InterfaceC15440 interfaceC15440 = this.f45236;
        interfaceC15440.mo2888(4, j);
        interfaceC15440.mo2889(c2460);
        interfaceC15440.mo2891(false);
    }
}
