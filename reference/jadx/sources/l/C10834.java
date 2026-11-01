package l;

/* JADX INFO: renamed from: l.ۧۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C10834 implements InterfaceC0249 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f36874;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f36875;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f36876;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f36877;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f36878;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f36879;

    @Override // l.InterfaceC0249
    public final int getType() {
        return 1752331379;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10834 m27155(C2460 c2460) {
        int iM7502 = c2460.m7502();
        c2460.m7535(12);
        c2460.m7502();
        int iM7503 = c2460.m7502();
        int iM7504 = c2460.m7502();
        c2460.m7535(4);
        int iM7505 = c2460.m7502();
        int iM7506 = c2460.m7502();
        c2460.m7535(4);
        return new C10834(iM7502, iM7503, iM7504, iM7505, iM7506, c2460.m7502());
    }

    public C10834(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f36876 = i;
        this.f36874 = i2;
        this.f36878 = i3;
        this.f36875 = i4;
        this.f36879 = i5;
        this.f36877 = i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27156() {
        int i = this.f36876;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        C0303.m1848("Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }
}
