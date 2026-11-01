package l;

/* JADX INFO: renamed from: l.۟ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9KT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7307 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20008 f24277;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f24278 = new byte[4];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14904 f24279;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19500(InterfaceC20008 interfaceC20008) {
        f24277 = interfaceC20008;
    }

    public C7307(C14904 c14904) {
        this.f24279 = c14904;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19501() {
        this.f24279.f48681 = 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19502(int i, boolean z) {
        C14904 c14904 = this.f24279;
        int i2 = c14904.f48681;
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
        byte[] bArr = this.f24278;
        bArr[0] = (byte) (i4 >>> 24);
        bArr[1] = (byte) (i4 >>> 16);
        bArr[2] = (byte) (i4 >>> 8);
        bArr[3] = (byte) i4;
        System.arraycopy(bArr, 0, c14904.f48679, 0, 4);
        this.f24279.f48679[4] = (byte) i3;
        synchronized (f24277) {
            InterfaceC20008 interfaceC20008 = f24277;
            C14904 c14905 = this.f24279;
            interfaceC20008.mo26724(c14905.f48681, i3, c14905.f48679);
        }
        this.f24279.m35639(i3);
    }
}
