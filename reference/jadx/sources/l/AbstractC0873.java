package l;

import java.math.BigInteger;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֨ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7YF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0873 extends AbstractC11541 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f3548;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f3549;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C7307 f3550;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f3551;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f3552;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f3553;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f3554;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C14904 f3555;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f3556;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f3557;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f3558;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f3559;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f3560;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC18076 f3561;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f3562;

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3494(C3073 c3073, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C5813 {
        int i;
        this.f3562 = bArr;
        this.f3549 = bArr2;
        this.f3548 = bArr3;
        this.f3554 = bArr4;
        try {
            InterfaceC21335 interfaceC21335 = (InterfaceC21335) Class.forName(c3073.m9231(this.f3551)).asSubclass(InterfaceC21335.class).getDeclaredConstructor(null).newInstance(null);
            this.f38781 = interfaceC21335;
            interfaceC21335.init();
            C14904 c14904 = new C14904();
            this.f3555 = c14904;
            this.f3550 = new C7307(c14904);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(c3073.m9231("dh")).asSubclass(InterfaceC18076.class);
                this.f3552 = Integer.parseInt(c3073.m9231("dhgex_min"));
                this.f3559 = Integer.parseInt(c3073.m9231("dhgex_max"));
                int i2 = Integer.parseInt(c3073.m9231("dhgex_preferred"));
                this.f3560 = i2;
                int i3 = this.f3552;
                if (i3 <= 0 || (i = this.f3559) <= 0 || i2 <= 0 || i2 < i3 || i2 > i) {
                    throw new C5813("Invalid DHGEX sizes: min=" + this.f3552 + " max=" + this.f3559 + " preferred=" + this.f3560);
                }
                InterfaceC18076 interfaceC18076 = (InterfaceC18076) clsAsSubclass.getDeclaredConstructor(null).newInstance(null);
                this.f3561 = interfaceC18076;
                interfaceC18076.init();
                this.f3550.m19501();
                this.f3555.m35630((byte) 34);
                this.f3555.m35644(this.f3552);
                this.f3555.m35644(this.f3560);
                this.f3555.m35644(this.f3559);
                c3073.m9249(this.f3550);
                c3073.f11634.m1333().getClass();
                this.f3556 = 31;
            } catch (Exception e) {
                throw new C5813(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C5813(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3495(C14904 c14904) throws C5813 {
        int i = this.f3556;
        if (i == 31) {
            c14904.m35638();
            c14904.m35629();
            if (c14904.m35629() != 31) {
                this.f38778.f11634.m1333().getClass();
                return false;
            }
            this.f3553 = c14904.m35636();
            this.f3558 = c14904.m35636();
            int iBitLength = new BigInteger(1, this.f3553).bitLength();
            if (iBitLength >= this.f3552 && iBitLength <= this.f3559) {
                this.f3561.mo17132(this.f3553);
                this.f3561.mo17130(this.f3558);
                this.f3557 = this.f3561.mo17131();
                this.f3550.m19501();
                this.f3555.m35630(UTF8.S_CS3);
                this.f3555.m35641(this.f3557);
                this.f38778.m9249(this.f3550);
                this.f38778.f11634.m1333().getClass();
                this.f3556 = 33;
                return true;
            }
        } else if (i == 33) {
            c14904.m35638();
            c14904.m35629();
            if (c14904.m35629() != 33) {
                this.f38778.f11634.m1333().getClass();
                return false;
            }
            this.f38779 = c14904.m35628();
            byte[] bArrM35636 = c14904.m35636();
            byte[] bArrM35628 = c14904.m35628();
            this.f3561.mo17133(bArrM35636);
            this.f3561.getClass();
            this.f38780 = AbstractC11541.m28716(AbstractC11541.m28715(this.f3561.mo17134()), true);
            byte[] bArrM28717 = AbstractC11541.m28717(this.f3549, false);
            this.f38781.mo3065(bArrM28717.length, bArrM28717);
            byte[] bArrM28718 = AbstractC11541.m28717(this.f3562, false);
            this.f38781.mo3065(bArrM28718.length, bArrM28718);
            byte[] bArrM28719 = AbstractC11541.m28717(this.f3554, false);
            this.f38781.mo3065(bArrM28719.length, bArrM28719);
            byte[] bArrM287110 = AbstractC11541.m28717(this.f3548, false);
            this.f38781.mo3065(bArrM287110.length, bArrM287110);
            byte[] bArrM287111 = AbstractC11541.m28717(this.f38779, false);
            this.f38781.mo3065(bArrM287111.length, bArrM287111);
            this.f38781.mo3065(4, AbstractC11541.m28714(this.f3552));
            this.f38781.mo3065(4, AbstractC11541.m28714(this.f3560));
            this.f38781.mo3065(4, AbstractC11541.m28714(this.f3559));
            byte[] bArrM28716 = AbstractC11541.m28716(this.f3553, false);
            this.f38781.mo3065(bArrM28716.length, bArrM28716);
            byte[] bArrM287112 = AbstractC11541.m28716(this.f3558, false);
            this.f38781.mo3065(bArrM287112.length, bArrM287112);
            byte[] bArrM287113 = AbstractC11541.m28716(this.f3557, false);
            this.f38781.mo3065(bArrM287113.length, bArrM287113);
            byte[] bArrM287114 = AbstractC11541.m28716(bArrM35636, false);
            this.f38781.mo3065(bArrM287114.length, bArrM287114);
            InterfaceC21335 interfaceC21335 = this.f38781;
            byte[] bArr = this.f38780;
            interfaceC21335.mo3065(bArr.length, bArr);
            this.f38777 = this.f38781.mo3066();
            byte[] bArr2 = this.f38779;
            int i2 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
            boolean zM28719 = m28719(C8491.m22168(4, i2, bArr2), this.f38779, bArrM35628, i2 + 4);
            this.f3556 = 0;
            return zM28719;
        }
        return false;
    }

    @Override // l.AbstractC11541
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo3496() {
        return this.f3556;
    }
}
