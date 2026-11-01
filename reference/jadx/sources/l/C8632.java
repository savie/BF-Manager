package l;

/* JADX INFO: renamed from: l.ۡۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8632 implements InterfaceC17803 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C8632 f29783 = new C8632();

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3481(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 255 && i3 == 254 && i4 == 0 && i5 == 0) {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3480() {
        return C22037.f71430;
    }
}
