package l;

/* JADX INFO: renamed from: l.۬ܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14010 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10502 f44377;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f44378 = new byte[4];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C9866 f44379;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34099(InterfaceC10502 interfaceC10502) {
        f44377 = interfaceC10502;
    }

    public C14010(C9866 c9866) {
        this.f44379 = c9866;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34100() {
        this.f44379.f31752 = 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34101(int i, boolean z) {
        C9866 c9866 = this.f44379;
        int i2 = c9866.f31752;
        if (!z) {
            i2 -= 4;
        }
        int i3 = (-i2) & (i - 1);
        if (i3 < i) {
            i3 += i;
        }
        int i4 = i2 + i3;
        if (z) {
            i4 -= 4;
        }
        byte[] bArr = this.f44378;
        bArr[0] = (byte) (i4 >>> 24);
        bArr[1] = (byte) (i4 >>> 16);
        bArr[2] = (byte) (i4 >>> 8);
        bArr[3] = (byte) i4;
        System.arraycopy(bArr, 0, c9866.f31750, 0, 4);
        this.f44379.f31750[4] = (byte) i3;
        synchronized (f44377) {
            InterfaceC10502 interfaceC10502 = f44377;
            C9866 c9867 = this.f44379;
            interfaceC10502.mo20077(c9867.f31752, i3, c9867.f31750);
        }
        this.f44379.m25659(i3);
    }
}
