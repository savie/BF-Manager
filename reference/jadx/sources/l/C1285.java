package l;

/* JADX INFO: renamed from: l.֨ᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8I0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1285 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f5530;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18594 f5531;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f5532;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f5533;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f5534;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    public C1285(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        C2023.m6507((i == 0) ^ (bArr2 == null));
        this.f5533 = z;
        this.f5532 = str;
        this.f5530 = i;
        this.f5534 = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    C0303.m1848("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f5531 = new C18594(i4, bArr, i2, i3);
    }
}
