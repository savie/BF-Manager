package l;

/* JADX INFO: renamed from: l.ᩴۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1RZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18509 implements InterfaceC17803 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C18509 f58954 = new C18509();

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3481(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 254 && i3 == 255 && (i4 != 0 || i5 != 0)) {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3480() {
        return C22037.f71428;
    }
}
