package l;

/* JADX INFO: renamed from: l.۫֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71QY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12779 implements InterfaceC19492 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12779 f40883 = new C12779();

    @Override // l.InterfaceC19492
    /* JADX INFO: renamed from: ۙ */
    public final int mo5605(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 255 && i3 == 254 && (i4 != 0 || i5 != 0)) {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC19492
    /* JADX INFO: renamed from: ۙ */
    public final int mo5604() {
        return C2448.f7859;
    }
}
