package l;

/* JADX INFO: renamed from: l.ۢۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9496 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13542 f32131;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3144 f32133;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f32134;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f32135;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32136;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f32137 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14435 f32132 = new C14435();

    public C9496(C13542 c13542) {
        this.f32131 = c13542;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14435 m24325(int i) {
        int i2;
        int i3;
        C13542 c13542 = this.f32131;
        c13542.m33104(i);
        if (this.f32137 != c13542.f44700 || i < (i3 = this.f32135) || i >= i3 + this.f32133.f11872) {
            C3144 c3144 = c13542.f44699;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                C3144 c3145 = c3144.f11858;
                int i7 = c3145 == null ? 0 : c3145.f11868;
                i2 = i4 + i7;
                if (i < i2) {
                    i5 += c3144.f11862;
                    i6 += c3144.f11874;
                    c3144 = c3145;
                } else {
                    int i8 = c3144.f11872;
                    if (i < i2 + i8) {
                        break;
                    }
                    i4 += i7 + i8;
                    i5 += c3144.f11862;
                    i6 += c3144.f11874;
                    c3144 = c3144.f11870;
                }
            }
            this.f32133 = c3144;
            this.f32135 = i2;
            this.f32136 = i5 + c3144.f11861;
            this.f32134 = i6 + c3144.f11860;
            this.f32137 = c13542.f44700;
        }
        int i9 = i - this.f32135;
        int iM9528 = this.f32133.m9528(i9) + this.f32136;
        C3144 c3146 = this.f32133;
        char[] cArr = c3146.f11867;
        int i10 = cArr != null ? cArr[i9] : c3146.f11865[i9];
        int iM9536 = c3146.m9536(i9) + this.f32134;
        C14435 c14435 = this.f32132;
        c14435.m34709(iM9528, i10 + iM9528, iM9536);
        c14435.m34711(this.f32133.m9539(i9));
        return c14435;
    }
}
