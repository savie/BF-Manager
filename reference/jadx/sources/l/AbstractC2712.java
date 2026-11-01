package l;

import java.util.Enumeration;

/* JADX INFO: renamed from: l.ۖᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J9XX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2712 extends AbstractC14792 implements Enumeration {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f10424;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f10425;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public byte[] f10426;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public byte f10427;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public int f10428;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f10429;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f10430;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f10431;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f10432;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f10433;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f10434;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public int f10435;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public String f10436;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public int f10437;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int f10438;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f10439;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f10440;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f10441;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f10442;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f10443;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f10444;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f10445;

    /* JADX INFO: renamed from: ۘ */
    public abstract int mo6397(int i, byte[] bArr);

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo6398(byte[] bArr);

    /* JADX INFO: renamed from: ۬ */
    public abstract int mo6399(int i, byte[] bArr);

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    @Override // java.util.Enumeration
    public final /* bridge */ /* synthetic */ Object nextElement() {
        nextElement();
        return this;
    }

    public AbstractC2712(InterfaceC10601 interfaceC10601, byte b, byte b2) {
        super(interfaceC10601, b);
        this.f10441 = 0;
        this.f10429 = 0;
        this.f10444 = true;
        this.f10439 = true;
        this.f10428 = 0;
        this.f10432 = 1;
        this.f10436 = "";
        this.f10427 = b2;
        this.f10424 = ((C9895) interfaceC10601).m25063() - 512;
        this.f10440 = 1024;
        this.f10425 = 61;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m8262(int i) {
        this.f10443 = i;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m8266() {
        this.f10424 = 1024;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8264(byte[] bArr) {
        this.f10426 = bArr;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m8265() {
        byte[] bArr = this.f10426;
        this.f10426 = null;
        return bArr;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final byte m8267() {
        return this.f10427;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m8263(byte b) {
        this.f10427 = (byte) -41;
    }

    @Override // l.AbstractC14792, l.InterfaceC9666, l.InterfaceC9522
    public final void reset() {
        super.reset();
        this.f10444 = true;
        this.f10439 = true;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f10444;
    }

    @Override // java.util.Enumeration
    public final void nextElement() {
        if (this.f10439) {
            this.f10439 = false;
            this.f10438 = C1694.m5620(this.f10432, 2, this.f10425, 2);
            if (mo24564() == 37 && !m35452()) {
                int i = this.f10438;
                this.f10438 = m35439(i, this.f10436) + i;
            }
            int i2 = this.f10438;
            int i3 = i2 % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.f10441 = i4;
            this.f10438 = i2 + i4;
            int iMo6398 = mo6398(this.f10426);
            this.f10435 = iMo6398;
            this.f10442 = iMo6398;
            int i5 = this.f10443 - this.f10438;
            int iMin = Math.min(iMo6398, i5);
            this.f10434 = iMin;
            int i6 = i5 - iMin;
            int i7 = this.f10438 + iMin;
            this.f10430 = i7;
            int i8 = i7 % 4;
            int i9 = i8 == 0 ? 0 : 4 - i8;
            this.f10429 = i9;
            this.f10430 = i7 + i9;
            int iMo6399 = mo6399(this.f10442, this.f10426);
            this.f10437 = iMo6399;
            this.f10431 = Math.min(iMo6399, i6);
        } else {
            if (mo24564() != -96) {
                mo24570(38);
            } else {
                mo24570(-95);
            }
            this.f10438 = 51;
            int i10 = this.f10435;
            int i11 = this.f10445;
            if (i10 - i11 > 0) {
                this.f10441 = 1;
                this.f10438 = 51 + 1;
            }
            int i12 = i11 + this.f10434;
            this.f10445 = i12;
            int i13 = (this.f10443 - this.f10438) - this.f10441;
            int iMin2 = Math.min(i10 - i12, i13);
            this.f10434 = iMin2;
            int i14 = i13 - iMin2;
            int i15 = this.f10438 + iMin2;
            this.f10430 = i15;
            int i16 = i15 % 4;
            int i17 = i16 == 0 ? 0 : 4 - i16;
            this.f10429 = i17;
            this.f10430 = i15 + i17;
            int i18 = this.f10433 + this.f10431;
            this.f10433 = i18;
            this.f10431 = Math.min(this.f10437 - i18, i14 - i17);
        }
        if (this.f10445 + this.f10434 < this.f10435 || this.f10433 + this.f10431 < this.f10437) {
            return;
        }
        this.f10444 = false;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        int iMo6397;
        C4850.m13546(this.f10435, i, bArr);
        C4850.m13546(this.f10437, i + 2, bArr);
        int i2 = i + 4;
        if (mo24564() != 38) {
            C4850.m13546(this.f10440, i2, bArr);
            C4850.m13546(this.f10424, i + 6, bArr);
            bArr[i + 8] = 0;
            bArr[i + 9] = 0;
            C4850.m13546(0, i + 10, bArr);
            C4850.m13550(this.f10428, i + 12, bArr);
            bArr[i + 16] = 0;
            i2 = i + 18;
            bArr[i + 17] = 0;
        }
        C4850.m13546(this.f10434, i2, bArr);
        C4850.m13546(this.f10438, i2 + 2, bArr);
        int i3 = i2 + 4;
        if (mo24564() == 38) {
            C4850.m13546(this.f10445, i3, bArr);
            i3 = i2 + 6;
        }
        C4850.m13546(this.f10431, i3, bArr);
        C4850.m13546(this.f10431 == 0 ? 0 : this.f10430, i3 + 2, bArr);
        int i4 = i3 + 4;
        if (mo24564() == 38) {
            C4850.m13546(this.f10433, i4, bArr);
            iMo6397 = i3 + 6;
        } else {
            int i5 = i3 + 5;
            bArr[i4] = (byte) this.f10432;
            int i6 = i3 + 6;
            bArr[i5] = 0;
            iMo6397 = i6 + mo6397(i6, bArr);
        }
        return iMo6397 - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int iM35440 = ((mo24564() != 37 || m35452()) ? i : m35440(this.f10436, i, bArr) + i) + this.f10441;
        int i2 = this.f10434;
        if (i2 > 0) {
            System.arraycopy(this.f10426, 0, bArr, this.f48358 + this.f10438, i2);
            iM35440 = Math.max(iM35440, this.f48358 + this.f10438 + this.f10434 + this.f10429);
        }
        int i3 = this.f10431;
        if (i3 > 0) {
            System.arraycopy(this.f10426, this.f10442, bArr, this.f48358 + this.f10430, i3);
            int i4 = this.f10442;
            int i5 = this.f10431;
            this.f10442 = i4 + i5;
            iM35440 = Math.max(iM35440, this.f48358 + this.f10430 + i5);
        }
        return iM35440 - i;
    }

    @Override // l.AbstractC14792
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f10435 + ",totalDataCount=" + this.f10437 + ",maxParameterCount=" + this.f10440 + ",maxDataCount=" + this.f10424 + ",maxSetupCount=0,flags=0x" + C5993.m16280(0, 2) + ",timeout=" + this.f10428 + ",parameterCount=" + this.f10434 + ",parameterOffset=" + this.f10438 + ",parameterDisplacement=" + this.f10445 + ",dataCount=" + this.f10431 + ",dataOffset=" + this.f10430 + ",dataDisplacement=" + this.f10433 + ",setupCount=" + this.f10432 + ",pad=" + this.f10441 + ",pad1=" + this.f10429);
    }
}
