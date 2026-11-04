package l;

/* JADX INFO: renamed from: l.᩷᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77Y0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22304 extends AbstractC12519 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f72201;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14010 f72202;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f72203;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f72204;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f72205;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC19320 f72206;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f72207;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9866 f72208;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f72209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72210;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f72211;

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۙ */
    public final void mo2919(C15723 c15723, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C2079 {
        this.f72207 = bArr;
        this.f72211 = bArr2;
        this.f72201 = bArr3;
        this.f72203 = bArr4;
        try {
            InterfaceC1421 interfaceC1421 = (InterfaceC1421) Class.forName(c15723.m37607(this.f72209)).asSubclass(InterfaceC1421.class).getDeclaredConstructor(null).newInstance(null);
            this.f40187 = interfaceC1421;
            interfaceC1421.init();
            C9866 c9866 = new C9866();
            this.f72208 = c9866;
            C14010 c14010 = new C14010(c9866);
            this.f72202 = c14010;
            c14010.m34100();
            this.f72208.m25651((byte) 30);
            try {
                InterfaceC19320 interfaceC19320 = (InterfaceC19320) Class.forName(c15723.m37607("ecdh-sha2-nistp")).asSubclass(InterfaceC19320.class).getDeclaredConstructor(null).newInstance(null);
                this.f72206 = interfaceC19320;
                interfaceC19320.mo7269(this.f72210);
                byte[] q = this.f72206.getQ();
                this.f72204 = q;
                this.f72208.m25673(q);
                if (bArr == null) {
                    return;
                }
                c15723.m37627(this.f72202);
                c15723.f51127.m45899().getClass();
                this.f72205 = 31;
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
        if (this.f72205 == 31) {
            c9866.m25658();
            c9866.m25650();
            if (c9866.m25650() != 31) {
                this.f40188.f51127.m45899().getClass();
                return false;
            }
            this.f40185 = c9866.m25649();
            byte[] bArrM25649 = c9866.m25649();
            byte[][] bArrM35440 = C14756.m35440(bArrM25649);
            if (this.f72206.mo7271(bArrM35440[0], bArrM35440[1])) {
                this.f40189 = AbstractC12519.m31076(AbstractC12519.m31075(this.f72206.mo7270(bArrM35440[0], bArrM35440[1])), true);
                byte[] bArrM256410 = c9866.m25649();
                byte[] bArrM31077 = AbstractC12519.m31077(this.f72211, false);
                this.f40187.mo5157(bArrM31077.length, bArrM31077);
                byte[] bArrM31078 = AbstractC12519.m31077(this.f72207, false);
                this.f40187.mo5157(bArrM31078.length, bArrM31078);
                byte[] bArrM31079 = AbstractC12519.m31077(this.f72203, false);
                this.f40187.mo5157(bArrM31079.length, bArrM31079);
                byte[] bArrM310710 = AbstractC12519.m31077(this.f72201, false);
                this.f40187.mo5157(bArrM310710.length, bArrM310710);
                byte[] bArrM310711 = AbstractC12519.m31077(this.f40185, false);
                this.f40187.mo5157(bArrM310711.length, bArrM310711);
                byte[] bArrM310712 = AbstractC12519.m31077(this.f72204, false);
                this.f40187.mo5157(bArrM310712.length, bArrM310712);
                byte[] bArrM310713 = AbstractC12519.m31077(bArrM25649, false);
                this.f40187.mo5157(bArrM310713.length, bArrM310713);
                InterfaceC1421 interfaceC1421 = this.f40187;
                byte[] bArr = this.f40189;
                interfaceC1421.mo5157(bArr.length, bArr);
                this.f40184 = this.f40187.mo5158();
                byte[] bArr2 = this.f40185;
                int i = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
                boolean zM31079 = m31079(C9011.m24048(4, i, bArr2), this.f40185, bArrM256410, i + 4);
                this.f72205 = 0;
                return zM31079;
            }
        }
        return false;
    }

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۤ */
    public final int mo2921() {
        return this.f72205;
    }
}
