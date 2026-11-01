package l;

/* JADX INFO: renamed from: l.ۗۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3158 implements InterfaceC9510 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f11890;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f11891;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f11892;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f11893 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4382 f11894;

    public C3158(C4382 c4382, int i, int i2) {
        this.f11894 = c4382;
        this.f11891 = i;
        this.f11890 = i2;
        this.f11892 = c4382.f15623.m41166().mo9809(i);
    }

    @Override // l.InterfaceC9510
    public final int seekTo(int i) {
        int i2;
        int i3;
        C4382 c4382;
        while (true) {
            i2 = this.f11892;
            i3 = this.f11891;
            c4382 = this.f11894;
            if (i2 >= i) {
                break;
            }
            int i4 = this.f11893;
            if (i4 + 1 >= this.f11890) {
                break;
            }
            this.f11893 = i4 + 1;
            this.f11892 = c4382.f15623.m41166().mo9809((this.f11893 * 8) + i3);
        }
        if (i2 == i) {
            return c4382.f15623.m41166().mo9809((this.f11893 * 8) + i3 + 4);
        }
        return 0;
    }
}
