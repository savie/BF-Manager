package l;

/* JADX INFO: renamed from: l.ۤ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47V7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11115 extends AbstractC12519 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f35046;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f35047;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C14010 f35048;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f35049;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f35050;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f35051;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f35052;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f35053;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC19320 f35054;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f35055;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9866 f35056;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC20724 f35057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f35058;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35059;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f35060;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f35061;

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۙ */
    public final void mo2919(C15723 c15723, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C2079 {
        this.f35055 = bArr;
        this.f35061 = bArr2;
        this.f35051 = bArr3;
        this.f35046 = bArr4;
        try {
            InterfaceC1421 interfaceC1421 = (InterfaceC1421) Class.forName(c15723.m37607(this.f35053)).asSubclass(InterfaceC1421.class).getDeclaredConstructor(null).newInstance(null);
            this.f40187 = interfaceC1421;
            interfaceC1421.init();
            C9866 c9866 = new C9866();
            this.f35056 = c9866;
            C14010 c14010 = new C14010(c9866);
            this.f35048 = c14010;
            c14010.m34100();
            this.f35056.m25652(this.f35060 + 5 + this.f35059);
            this.f35056.m25651((byte) 30);
            try {
                InterfaceC20724 interfaceC20724 = (InterfaceC20724) Class.forName(c15723.m37607(this.f35050)).asSubclass(InterfaceC20724.class).getDeclaredConstructor(null).newInstance(null);
                this.f35057 = interfaceC20724;
                interfaceC20724.init();
                InterfaceC19320 interfaceC19320 = (InterfaceC19320) Class.forName(c15723.m37607("ecdh-sha2-nistp")).asSubclass(InterfaceC19320.class).getDeclaredConstructor(null).newInstance(null);
                this.f35054 = interfaceC19320;
                interfaceC19320.mo7269(this.f35047);
                byte[] publicKey = this.f35057.getPublicKey();
                byte[] q = this.f35054.getQ();
                int i = this.f35060;
                byte[] bArr5 = new byte[this.f35059 + i];
                this.f35049 = bArr5;
                System.arraycopy(publicKey, 0, bArr5, 0, i);
                System.arraycopy(q, 0, this.f35049, this.f35060, this.f35059);
                this.f35056.m25673(this.f35049);
                if (bArr == null) {
                    return;
                }
                c15723.m37627(this.f35048);
                c15723.f51127.m45899().getClass();
                this.f35058 = 31;
            } catch (Exception e) {
                throw new C2079(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C2079(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2920(C9866 c9866) throws C2079 {
        if (this.f35058 == 31) {
            c9866.m25658();
            c9866.m25650();
            if (c9866.m25650() != 31) {
                this.f40188.f51127.m45899().getClass();
                return false;
            }
            this.f40185 = c9866.m25649();
            byte[] bArrM25649 = c9866.m25649();
            int length = bArrM25649.length;
            int i = this.f35052;
            int i2 = this.f35059;
            if (length == i + i2) {
                byte[] bArr = new byte[i];
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrM25649, 0, bArr, 0, i);
                System.arraycopy(bArrM25649, this.f35052, bArr2, 0, this.f35059);
                byte[][] bArrM35440 = C14756.m35440(bArr2);
                if (this.f35054.mo7271(bArrM35440[0], bArrM35440[1])) {
                    byte[] bArrMo6228 = null;
                    try {
                        bArrMo6228 = this.f35057.mo6228(bArr);
                        this.f40187.mo5157(bArrMo6228.length, bArrMo6228);
                        C9011.m24062(bArrMo6228);
                        try {
                            bArrMo6228 = this.f35054.mo7270(bArrM35440[0], bArrM35440[1]);
                            this.f40187.mo5157(bArrMo6228.length, bArrMo6228);
                            C9011.m24062(bArrMo6228);
                            this.f40189 = AbstractC12519.m31077(this.f40187.mo5158(), true);
                            byte[] bArrM256410 = c9866.m25649();
                            byte[] bArrM31077 = AbstractC12519.m31077(this.f35061, false);
                            this.f40187.mo5157(bArrM31077.length, bArrM31077);
                            byte[] bArrM31078 = AbstractC12519.m31077(this.f35055, false);
                            this.f40187.mo5157(bArrM31078.length, bArrM31078);
                            byte[] bArrM31079 = AbstractC12519.m31077(this.f35046, false);
                            this.f40187.mo5157(bArrM31079.length, bArrM31079);
                            byte[] bArrM310710 = AbstractC12519.m31077(this.f35051, false);
                            this.f40187.mo5157(bArrM310710.length, bArrM310710);
                            byte[] bArrM310711 = AbstractC12519.m31077(this.f40185, false);
                            this.f40187.mo5157(bArrM310711.length, bArrM310711);
                            byte[] bArrM310712 = AbstractC12519.m31077(this.f35049, false);
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
                            this.f35058 = 0;
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
        return this.f35058;
    }
}
