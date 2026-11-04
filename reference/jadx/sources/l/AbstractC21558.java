package l;

import java.math.BigInteger;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩶᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7YF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21558 extends AbstractC12519 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f68847;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f68848;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f68849;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f68850;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f68851;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f68852;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f68853;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f68854;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public byte[] f68855;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9866 f68856;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC9425 f68857;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f68858;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f68859;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C14010 f68860;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f68861;

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۙ */
    public final void mo2919(C15723 c15723, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C2079 {
        int i;
        this.f68861 = bArr;
        this.f68852 = bArr2;
        this.f68847 = bArr3;
        this.f68850 = bArr4;
        try {
            InterfaceC1421 interfaceC1421 = (InterfaceC1421) Class.forName(c15723.m37607(this.f68848)).asSubclass(InterfaceC1421.class).getDeclaredConstructor(null).newInstance(null);
            this.f40187 = interfaceC1421;
            interfaceC1421.init();
            C9866 c9866 = new C9866();
            this.f68856 = c9866;
            this.f68860 = new C14010(c9866);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(c15723.m37607("dh")).asSubclass(InterfaceC9425.class);
                this.f68853 = Integer.parseInt(c15723.m37607("dhgex_min"));
                this.f68858 = Integer.parseInt(c15723.m37607("dhgex_max"));
                int i2 = Integer.parseInt(c15723.m37607("dhgex_preferred"));
                this.f68849 = i2;
                int i3 = this.f68853;
                if (i3 <= 0 || (i = this.f68858) <= 0 || i2 <= 0 || i2 < i3 || i2 > i) {
                    throw new C2079("Invalid DHGEX sizes: min=" + this.f68853 + " max=" + this.f68858 + " preferred=" + this.f68849);
                }
                InterfaceC9425 interfaceC9425 = (InterfaceC9425) clsAsSubclass.getDeclaredConstructor(null).newInstance(null);
                this.f68857 = interfaceC9425;
                interfaceC9425.init();
                this.f68860.m34100();
                this.f68856.m25651((byte) 34);
                this.f68856.m25669(this.f68853);
                this.f68856.m25669(this.f68849);
                this.f68856.m25669(this.f68858);
                c15723.m37627(this.f68860);
                c15723.f51127.m45899().getClass();
                this.f68854 = 31;
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
        int i = this.f68854;
        if (i == 31) {
            c9866.m25658();
            c9866.m25650();
            if (c9866.m25650() != 31) {
                this.f40188.f51127.m45899().getClass();
                return false;
            }
            this.f68851 = c9866.m25667();
            this.f68859 = c9866.m25667();
            int iBitLength = new BigInteger(1, this.f68851).bitLength();
            if (iBitLength >= this.f68853 && iBitLength <= this.f68858) {
                this.f68857.mo17016(this.f68851);
                this.f68857.mo17014(this.f68859);
                this.f68855 = this.f68857.mo17015();
                this.f68860.m34100();
                this.f68856.m25651(UTF8.S_CS3);
                this.f68856.m25661(this.f68855);
                this.f40188.m37627(this.f68860);
                this.f40188.f51127.m45899().getClass();
                this.f68854 = 33;
                return true;
            }
        } else if (i == 33) {
            c9866.m25658();
            c9866.m25650();
            if (c9866.m25650() != 33) {
                this.f40188.f51127.m45899().getClass();
                return false;
            }
            this.f40185 = c9866.m25649();
            byte[] bArrM25667 = c9866.m25667();
            byte[] bArrM25649 = c9866.m25649();
            this.f68857.mo17017(bArrM25667);
            this.f68857.getClass();
            this.f40189 = AbstractC12519.m31076(AbstractC12519.m31075(this.f68857.mo17018()), true);
            byte[] bArrM31077 = AbstractC12519.m31077(this.f68852, false);
            this.f40187.mo5157(bArrM31077.length, bArrM31077);
            byte[] bArrM31078 = AbstractC12519.m31077(this.f68861, false);
            this.f40187.mo5157(bArrM31078.length, bArrM31078);
            byte[] bArrM31079 = AbstractC12519.m31077(this.f68850, false);
            this.f40187.mo5157(bArrM31079.length, bArrM31079);
            byte[] bArrM310710 = AbstractC12519.m31077(this.f68847, false);
            this.f40187.mo5157(bArrM310710.length, bArrM310710);
            byte[] bArrM310711 = AbstractC12519.m31077(this.f40185, false);
            this.f40187.mo5157(bArrM310711.length, bArrM310711);
            this.f40187.mo5157(4, AbstractC12519.m31074(this.f68853));
            this.f40187.mo5157(4, AbstractC12519.m31074(this.f68849));
            this.f40187.mo5157(4, AbstractC12519.m31074(this.f68858));
            byte[] bArrM31076 = AbstractC12519.m31076(this.f68851, false);
            this.f40187.mo5157(bArrM31076.length, bArrM31076);
            byte[] bArrM310712 = AbstractC12519.m31076(this.f68859, false);
            this.f40187.mo5157(bArrM310712.length, bArrM310712);
            byte[] bArrM310713 = AbstractC12519.m31076(this.f68855, false);
            this.f40187.mo5157(bArrM310713.length, bArrM310713);
            byte[] bArrM310714 = AbstractC12519.m31076(bArrM25667, false);
            this.f40187.mo5157(bArrM310714.length, bArrM310714);
            InterfaceC1421 interfaceC1421 = this.f40187;
            byte[] bArr = this.f40189;
            interfaceC1421.mo5157(bArr.length, bArr);
            this.f40184 = this.f40187.mo5158();
            byte[] bArr2 = this.f40185;
            int i2 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
            boolean zM31079 = m31079(C9011.m24048(4, i2, bArr2), this.f40185, bArrM25649, i2 + 4);
            this.f68854 = 0;
            return zM31079;
        }
        return false;
    }

    @Override // l.AbstractC12519
    /* JADX INFO: renamed from: ۤ */
    public final int mo2921() {
        return this.f68854;
    }
}
