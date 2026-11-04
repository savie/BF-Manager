package l;

import java.util.Enumeration;

/* JADX INFO: renamed from: l.ۢ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9XX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10461 extends AbstractC3971 implements Enumeration {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f33281;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f33282;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f33283;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f33284;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public int f33285;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f33286;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f33287;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public String f33288;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f33289;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f33290;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f33291;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public int f33292;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f33293;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public byte f33294;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f33295;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f33296;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f33297;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f33298;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f33299;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public int f33300;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public byte[] f33301;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f33302;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo3142(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۚ */
    public abstract int mo3143(int i, byte[] bArr);

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo3144(byte[] bArr);

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        nextElement();
        return this;
    }

    public AbstractC10461(InterfaceC5878 interfaceC5878, byte b, byte b2) {
        super(interfaceC5878, b);
        this.f33297 = 0;
        this.f33291 = 0;
        this.f33284 = true;
        this.f33295 = true;
        this.f33285 = 0;
        this.f33287 = 1;
        this.f33288 = "";
        this.f33294 = b2;
        this.f33296 = ((C14826) interfaceC5878).m35717() - 512;
        this.f33281 = 1024;
        this.f33289 = 61;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26882(int i) {
        this.f33299 = i;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m26884() {
        this.f33296 = 1024;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26886(byte[] bArr) {
        this.f33301 = bArr;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m26883() {
        byte[] bArr = this.f33301;
        this.f33301 = null;
        return bArr;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final byte m26887() {
        return this.f33294;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26885(byte b) {
        this.f33294 = (byte) -41;
    }

    @Override // l.AbstractC3971, l.InterfaceC14585, l.InterfaceC17965
    public final void reset() {
        super.reset();
        this.f33284 = true;
        this.f33295 = true;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f33284;
    }

    @Override // java.util.Enumeration
    public final void nextElement() {
        if (this.f33295) {
            this.f33295 = false;
            this.f33283 = C12669.m31436(this.f33287, 2, this.f33289, 2);
            if (mo10330() == 37 && !m12773()) {
                int i = this.f33283;
                this.f33283 = m12757(i, this.f33288) + i;
            }
            int i2 = this.f33283;
            int i3 = i2 % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.f33297 = i4;
            this.f33283 = i2 + i4;
            int iMo3144 = mo3144(this.f33301);
            this.f33292 = iMo3144;
            this.f33298 = iMo3144;
            int i5 = this.f33299 - this.f33283;
            int iMin = Math.min(iMo3144, i5);
            this.f33282 = iMin;
            int i6 = i5 - iMin;
            int i7 = this.f33283 + iMin;
            this.f33302 = i7;
            int i8 = i7 % 4;
            int i9 = i8 == 0 ? 0 : 4 - i8;
            this.f33291 = i9;
            this.f33302 = i7 + i9;
            int iMo3143 = mo3143(this.f33298, this.f33301);
            this.f33300 = iMo3143;
            this.f33293 = Math.min(iMo3143, i6);
        } else {
            if (mo10330() != -96) {
                mo10331(38);
            } else {
                mo10331(-95);
            }
            this.f33283 = 51;
            int i10 = this.f33292;
            int i11 = this.f33290;
            if (i10 - i11 > 0) {
                this.f33297 = 1;
                this.f33283 = 51 + 1;
            }
            int i12 = i11 + this.f33282;
            this.f33290 = i12;
            int i13 = (this.f33299 - this.f33283) - this.f33297;
            int iMin2 = Math.min(i10 - i12, i13);
            this.f33282 = iMin2;
            int i14 = i13 - iMin2;
            int i15 = this.f33283 + iMin2;
            this.f33302 = i15;
            int i16 = i15 % 4;
            int i17 = i16 == 0 ? 0 : 4 - i16;
            this.f33291 = i17;
            this.f33302 = i15 + i17;
            int i18 = this.f33286 + this.f33293;
            this.f33286 = i18;
            this.f33293 = Math.min(this.f33300 - i18, i14 - i17);
        }
        if (this.f33290 + this.f33282 < this.f33292 || this.f33286 + this.f33293 < this.f33300) {
            return;
        }
        this.f33284 = false;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        int iMo3142;
        C0481.m2319(this.f33292, i, bArr);
        C0481.m2319(this.f33300, i + 2, bArr);
        int i2 = i + 4;
        if (mo10330() != 38) {
            C0481.m2319(this.f33281, i2, bArr);
            C0481.m2319(this.f33296, i + 6, bArr);
            bArr[i + 8] = 0;
            bArr[i + 9] = 0;
            C0481.m2319(0, i + 10, bArr);
            C0481.m2323(this.f33285, i + 12, bArr);
            bArr[i + 16] = 0;
            i2 = i + 18;
            bArr[i + 17] = 0;
        }
        C0481.m2319(this.f33282, i2, bArr);
        C0481.m2319(this.f33283, i2 + 2, bArr);
        int i3 = i2 + 4;
        if (mo10330() == 38) {
            C0481.m2319(this.f33290, i3, bArr);
            i3 = i2 + 6;
        }
        C0481.m2319(this.f33293, i3, bArr);
        C0481.m2319(this.f33293 == 0 ? 0 : this.f33302, i3 + 2, bArr);
        int i4 = i3 + 4;
        if (mo10330() == 38) {
            C0481.m2319(this.f33286, i4, bArr);
            iMo3142 = i3 + 6;
        } else {
            int i5 = i3 + 5;
            bArr[i4] = (byte) this.f33287;
            int i6 = i3 + 6;
            bArr[i5] = 0;
            iMo3142 = i6 + mo3142(i6, bArr);
        }
        return iMo3142 - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int iM12758 = ((mo10330() != 37 || m12773()) ? i : m12758(this.f33288, i, bArr) + i) + this.f33297;
        int i2 = this.f33282;
        if (i2 > 0) {
            System.arraycopy(this.f33301, 0, bArr, this.f13597 + this.f33283, i2);
            iM12758 = Math.max(iM12758, this.f13597 + this.f33283 + this.f33282 + this.f33291);
        }
        int i3 = this.f33293;
        if (i3 > 0) {
            System.arraycopy(this.f33301, this.f33298, bArr, this.f13597 + this.f33302, i3);
            int i4 = this.f33298;
            int i5 = this.f33293;
            this.f33298 = i4 + i5;
            iM12758 = Math.max(iM12758, this.f13597 + this.f33302 + i5);
        }
        return iM12758 - i;
    }

    @Override // l.AbstractC3971
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f33292 + ",totalDataCount=" + this.f33300 + ",maxParameterCount=" + this.f33281 + ",maxDataCount=" + this.f33296 + ",maxSetupCount=0,flags=0x" + C6033.m17503(0, 2) + ",timeout=" + this.f33285 + ",parameterCount=" + this.f33282 + ",parameterOffset=" + this.f33283 + ",parameterDisplacement=" + this.f33290 + ",dataCount=" + this.f33293 + ",dataOffset=" + this.f33302 + ",dataDisplacement=" + this.f33286 + ",setupCount=" + this.f33287 + ",pad=" + this.f33297 + ",pad1=" + this.f33291);
    }
}
