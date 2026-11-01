package l;

/* JADX INFO: renamed from: l.᩵ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1PS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19215 implements InterfaceC17803 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C19215 f62054 = new C19215();

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3481(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 0 && i3 == 0 && i4 == 254 && i5 == 255) {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3480() {
        return C22037.f71429;
    }
}
