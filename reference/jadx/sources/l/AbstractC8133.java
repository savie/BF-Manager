package l;

/* JADX INFO: renamed from: l.۟᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7Y0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8133 extends AbstractC12519 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f26825;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f26826;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f26827;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f26828;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C14010 f26829;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f26830;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f26831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2300 f26832;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f26833;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f26834;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9866 f26835;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f26836;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26837;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC20724 f26838;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f26839;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f26840;

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۙ */
    public final void mo2919(C15723 c15723, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C2079 {
        this.f26834 = bArr;
        this.f26840 = bArr2;
        this.f26825 = bArr3;
        this.f26828 = bArr4;
        try {
            InterfaceC1421 interfaceC1421 = (InterfaceC1421) Class.forName(c15723.m37607(this.f26839)).asSubclass(InterfaceC1421.class).getDeclaredConstructor(null).newInstance(null);
            this.f40187 = interfaceC1421;
            interfaceC1421.init();
            C9866 c9866 = new C9866();
            this.f26835 = c9866;
            C14010 c14010 = new C14010(c9866);
            this.f26829 = c14010;
            c14010.m34100();
            this.f26835.m25652(this.f26831 + 5 + this.f26837);
            this.f26835.m25651((byte) 30);
            try {
                InterfaceC20724 interfaceC20724 = (InterfaceC20724) Class.forName(c15723.m37607(this.f26836)).asSubclass(InterfaceC20724.class).getDeclaredConstructor(null).newInstance(null);
                this.f26838 = interfaceC20724;
                interfaceC20724.init();
                InterfaceC2300 interfaceC2300 = (InterfaceC2300) Class.forName(c15723.m37607("xdh")).asSubclass(InterfaceC2300.class).getDeclaredConstructor(null).newInstance(null);
                this.f26832 = interfaceC2300;
                interfaceC2300.mo1840(this.f26837, this.f26833);
                byte[] publicKey = this.f26838.getPublicKey();
                byte[] q = this.f26832.getQ();
                int i = this.f26831;
                byte[] bArr5 = new byte[this.f26837 + i];
                this.f26830 = bArr5;
                System.arraycopy(publicKey, 0, bArr5, 0, i);
                System.arraycopy(q, 0, this.f26830, this.f26831, this.f26837);
                this.f26835.m25673(this.f26830);
                if (bArr == null) {
                    return;
                }
                c15723.m37627(this.f26829);
                c15723.f51127.m45899().getClass();
                this.f26827 = 31;
            } catch (Exception | LinkageError e) {
                throw new C2079(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C2079(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2920(C9866 c9866) throws C2079 {
        if (this.f26827 == 31) {
            c9866.m25658();
            c9866.m25650();
            if (c9866.m25650() != 31) {
                this.f40188.f51127.m45899().getClass();
                return false;
            }
            this.f40185 = c9866.m25649();
            byte[] bArrM25649 = c9866.m25649();
            int length = bArrM25649.length;
            int i = this.f26826;
            int i2 = this.f26837;
            if (length == i + i2) {
                byte[] bArr = new byte[i];
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrM25649, 0, bArr, 0, i);
                System.arraycopy(bArrM25649, this.f26826, bArr2, 0, this.f26837);
                if (this.f26832.mo1842(bArr2)) {
                    byte[] bArrMo6228 = null;
                    try {
                        bArrMo6228 = this.f26838.mo6228(bArr);
                        this.f40187.mo5157(bArrMo6228.length, bArrMo6228);
                        C9011.m24062(bArrMo6228);
                        try {
                            bArrMo6228 = this.f26832.mo1841(bArr2);
                            this.f40187.mo5157(bArrMo6228.length, bArrMo6228);
                            C9011.m24062(bArrMo6228);
                            this.f40189 = AbstractC12519.m31077(this.f40187.mo5158(), true);
                            byte[] bArrM256410 = c9866.m25649();
                            byte[] bArrM31077 = AbstractC12519.m31077(this.f26840, false);
                            this.f40187.mo5157(bArrM31077.length, bArrM31077);
                            byte[] bArrM31078 = AbstractC12519.m31077(this.f26834, false);
                            this.f40187.mo5157(bArrM31078.length, bArrM31078);
                            byte[] bArrM31079 = AbstractC12519.m31077(this.f26828, false);
                            this.f40187.mo5157(bArrM31079.length, bArrM31079);
                            byte[] bArrM310710 = AbstractC12519.m31077(this.f26825, false);
                            this.f40187.mo5157(bArrM310710.length, bArrM310710);
                            byte[] bArrM310711 = AbstractC12519.m31077(this.f40185, false);
                            this.f40187.mo5157(bArrM310711.length, bArrM310711);
                            byte[] bArrM310712 = AbstractC12519.m31077(this.f26830, false);
                            this.f40187.mo5157(bArrM310712.length, bArrM310712);
                            byte[] bArrM310713 = AbstractC12519.m31077(bArrM25649, false);
                            this.f40187.mo5157(bArrM310713.length, bArrM310713);
                            InterfaceC1421 interfaceC1421 = this.f40187;
                            byte[] bArr3 = this.f40189;
                            interfaceC1421.mo5157(bArr3.length, bArr3);
                            this.f40184 = this.f40187.mo5158();
                            byte[] bArr4 = this.f40185;
                            int i3 = ((bArr4[0] << 24) & (-16777216)) | ((bArr4[1] << 16) & 16711680) | ((bArr4[2] << 8) & 65280) | (bArr4[3] & 255);
                            boolean zM31079 = m31079(C9011.m24048(4, i3, bArr4), this.f40185, bArrM256410, i3 + 4);
                            this.f26827 = 0;
                            return zM31079;
                        } catch (Throwable th) {
                            C9011.m24062(bArrMo6228);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        C9011.m24062(bArrMo6228);
                        throw th2;
                    }
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۤ */
    public final int mo2921() {
        return this.f26827;
    }
}
