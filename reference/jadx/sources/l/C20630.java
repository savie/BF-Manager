package l;

/* JADX INFO: renamed from: l.᩵ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20630 implements InterfaceC3476 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f66157;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12425 f66158;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f66159;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f66160 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f66161;

    public C20630(C12425 c12425, int i, int i2) {
        this.f66158 = c12425;
        this.f66159 = i;
        this.f66161 = i2;
        this.f66157 = c12425.f39952.m55818().mo8719(i);
    }

    @Override // l.InterfaceC3476
    public final int seekTo(int i) {
        int i2;
        int i3;
        C12425 c12425;
        while (true) {
            i2 = this.f66157;
            i3 = this.f66159;
            c12425 = this.f66158;
            if (i2 >= i) {
                break;
            }
            int i4 = this.f66160;
            if (i4 + 1 >= this.f66161) {
                break;
            }
            this.f66160 = i4 + 1;
            this.f66157 = c12425.f39952.m55818().mo8719((this.f66160 * 8) + i3);
        }
        if (i2 == i) {
            return c12425.f39952.m55818().mo8719((this.f66160 * 8) + i3 + 4);
        }
        return 0;
    }
}
