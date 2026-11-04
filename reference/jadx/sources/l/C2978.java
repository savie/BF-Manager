package l;

/* JADX INFO: renamed from: l.ۖ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9CQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2978 implements InterfaceC5216 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f9672 = new byte[64];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f9673 = new byte[64];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1487 f9674;

    public C2978(C1487 c1487) {
        this.f9674 = c1487;
    }

    @Override // l.InterfaceC5216
    public final void init(byte[] bArr) throws C11181 {
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            throw new C11181("Missing key data");
        }
        int iMin = Math.min(bArr.length, 64);
        int i = 0;
        while (true) {
            bArr2 = this.f9673;
            bArr3 = this.f9672;
            if (i >= iMin) {
                break;
            }
            bArr3[i] = (byte) (54 ^ bArr[i]);
            bArr2[i] = (byte) (92 ^ bArr[i]);
            i++;
        }
        while (iMin < 64) {
            bArr3[iMin] = 54;
            bArr2[iMin] = 92;
            iMin++;
        }
        m9697();
    }

    @Override // l.InterfaceC5216
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo9696() {
        C1487 c1487 = this.f9674;
        try {
            byte[] bArrM5311 = c1487.m5311();
            c1487.m5309(this.f9673);
            c1487.m5309(bArrM5311);
            return c1487.m5311();
        } finally {
            m9697();
        }
    }

    @Override // l.InterfaceC5216
    public final void update(byte[] bArr) {
        this.f9674.m5309(bArr);
    }

    @Override // l.InterfaceC5216
    public final void update(byte[] bArr, int i, int i2) {
        this.f9674.m5310(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9697() {
        C1487 c1487 = this.f9674;
        c1487.m5312();
        byte[] bArr = this.f9672;
        c1487.m5310(bArr, 0, bArr.length);
    }
}
