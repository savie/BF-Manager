package l;

/* JADX INFO: renamed from: l.ܿ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7V1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18574 extends AbstractC12519 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f60344;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f60345;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f60346;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f60347;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f60348;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9866 f60349;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC9425 f60350;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14010 f60351;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f60352;

    /* JADX INFO: renamed from: ܳ */
    public abstract String mo7456();

    /* JADX INFO: renamed from: ᩴ */
    public abstract byte[] mo11853();

    /* JADX INFO: renamed from: ᩸ */
    public abstract byte[] mo11854();

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۙ */
    public final void mo2919(C15723 c15723, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C2079 {
        this.f60352 = bArr;
        this.f60347 = bArr2;
        this.f60344 = bArr3;
        this.f60346 = bArr4;
        try {
            InterfaceC1421 interfaceC1421 = (InterfaceC1421) Class.forName(c15723.m37607(mo7456())).asSubclass(InterfaceC1421.class).getDeclaredConstructor(null).newInstance(null);
            this.f40187 = interfaceC1421;
            interfaceC1421.init();
            C9866 c9866 = new C9866();
            this.f60349 = c9866;
            this.f60351 = new C14010(c9866);
            try {
                InterfaceC9425 interfaceC9425 = (InterfaceC9425) Class.forName(c15723.m37607("dh")).asSubclass(InterfaceC9425.class).getDeclaredConstructor(null).newInstance(null);
                this.f60350 = interfaceC9425;
                interfaceC9425.init();
                this.f60350.mo17016(mo11853());
                this.f60350.mo17014(mo11854());
                this.f60348 = this.f60350.mo17015();
                this.f60351.m34100();
                this.f60349.m25651((byte) 30);
                this.f60349.m25661(this.f60348);
                if (bArr == null) {
                    return;
                }
                c15723.m37627(this.f60351);
                c15723.f51127.m45899().getClass();
                this.f60345 = 31;
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
        if (this.f60345 != 31) {
            return false;
        }
        c9866.m25658();
        c9866.m25650();
        if (c9866.m25650() != 31) {
            this.f40188.f51127.m45899().getClass();
            return false;
        }
        this.f40185 = c9866.m25649();
        byte[] bArrM25667 = c9866.m25667();
        byte[] bArrM25649 = c9866.m25649();
        this.f60350.mo17017(bArrM25667);
        this.f60350.getClass();
        this.f40189 = AbstractC12519.m31076(AbstractC12519.m31075(this.f60350.mo17018()), true);
        byte[] bArrM31077 = AbstractC12519.m31077(this.f60347, false);
        this.f40187.mo5157(bArrM31077.length, bArrM31077);
        byte[] bArrM31078 = AbstractC12519.m31077(this.f60352, false);
        this.f40187.mo5157(bArrM31078.length, bArrM31078);
        byte[] bArrM31079 = AbstractC12519.m31077(this.f60346, false);
        this.f40187.mo5157(bArrM31079.length, bArrM31079);
        byte[] bArrM310710 = AbstractC12519.m31077(this.f60344, false);
        this.f40187.mo5157(bArrM310710.length, bArrM310710);
        byte[] bArrM310711 = AbstractC12519.m31077(this.f40185, false);
        this.f40187.mo5157(bArrM310711.length, bArrM310711);
        byte[] bArrM31076 = AbstractC12519.m31076(this.f60348, false);
        this.f40187.mo5157(bArrM31076.length, bArrM31076);
        byte[] bArrM310712 = AbstractC12519.m31076(bArrM25667, false);
        this.f40187.mo5157(bArrM310712.length, bArrM310712);
        InterfaceC1421 interfaceC1421 = this.f40187;
        byte[] bArr = this.f40189;
        interfaceC1421.mo5157(bArr.length, bArr);
        this.f40184 = this.f40187.mo5158();
        byte[] bArr2 = this.f40185;
        int i = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        boolean zM31079 = m31079(C9011.m24048(4, i, bArr2), this.f40185, bArrM25649, i + 4);
        this.f60345 = 0;
        return zM31079;
    }

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۤ */
    public final int mo2921() {
        return this.f60345;
    }
}
