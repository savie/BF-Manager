package l;

import java.util.Date;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۙ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5242 extends AbstractC3971 implements InterfaceC8619 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f18447 = C16980.m40037(C5242.class);

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18448;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f18449;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f18450;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f18451;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C21125 f18452;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f18453;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f18454;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f18455;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f18456;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        return 0;
    }

    public C5242(InterfaceC23032 interfaceC23032) {
        super(interfaceC23032.mo2875());
        this.f18452 = new C21125();
        this.f18454 = ((C14826) interfaceC23032.mo2875()).m35738();
        this.f18456 = ((C14826) interfaceC23032.mo2875()).m35721();
        this.f18450 = ((C14826) interfaceC23032.mo2875()).m35727();
        this.f18455 = ((C14826) interfaceC23032.mo2875()).m35711();
        this.f18449 = ((C14826) interfaceC23032.mo2875()).m35714();
        this.f18453 = ((C14826) interfaceC23032.mo2875()).m35717();
        this.f18448 = ((C14826) interfaceC23032.mo2875()).m35743();
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۫ */
    public final EnumC25270 mo11409() {
        return EnumC25270.SMB1;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۢ */
    public final int mo11405() {
        return this.f18453;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11401(InterfaceC23032 interfaceC23032) {
        return m12793().equals(interfaceC23032.mo2875());
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11402(InterfaceC23032 interfaceC23032, InterfaceC2653 interfaceC2653) {
        if (this.f18451 > 10) {
            return false;
        }
        C21125 c21125 = this.f18452;
        int i = c21125.f67480 & Integer.MIN_VALUE;
        InterfaceC25186 interfaceC25186 = f18447;
        if (i != Integer.MIN_VALUE && c21125.f67484 != 8 && ((C14826) interfaceC23032.mo2875()).m35718() == 0) {
            interfaceC25186.mo13729("Unexpected encryption key length: " + c21125.f67484);
            return false;
        }
        if (interfaceC2653.mo8797() || c21125.f67481) {
            this.f18456 |= 4;
            if (interfaceC2653.mo8797() || c21125.f67481) {
                this.f18456 |= 16;
            }
        } else {
            if (c21125.f67495) {
                interfaceC23032.mo2875().getClass();
            }
            this.f18456 &= 65515;
        }
        if (interfaceC25186.mo13707()) {
            StringBuilder sb = new StringBuilder("Signing ");
            sb.append((this.f18456 & 4) != 0 ? "enabled " : "not-enabled ");
            sb.append((this.f18456 & 16) != 0 ? AnnotationHandler.REQUIRED : "not-required");
            interfaceC25186.mo13721(sb.toString());
        }
        int iMin = Math.min(this.f18450, c21125.f67492);
        this.f18450 = iMin;
        if (iMin < 1) {
            this.f18450 = 1;
        }
        this.f18455 = Math.min(this.f18455, c21125.f67491);
        this.f18449 = Math.min(this.f18449, c21125.f67491);
        this.f18453 = Math.min(this.f18453, c21125.f67491);
        int i2 = this.f18454;
        int i3 = c21125.f67480;
        int i4 = i2 & i3;
        this.f18454 = i4;
        if ((i3 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f18454 = i4 | Integer.MIN_VALUE;
        }
        if (((C14826) interfaceC23032.mo2875()).m35743()) {
            this.f18454 |= 4;
        } else {
            interfaceC23032.mo2875().getClass();
        }
        if ((this.f18454 & 4) == 0) {
            interfaceC23032.mo2875().getClass();
            this.f18448 = false;
            this.f18456 &= EnumC6121.f20881;
        } else {
            this.f18448 = ((C14826) interfaceC23032.mo2875()).m35743();
        }
        if (this.f18448) {
            interfaceC25186.mo13721("Unicode is enabled");
            return true;
        }
        interfaceC25186.mo13721("Unicode is disabled");
        return true;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final int m15752() {
        return this.f18454;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final int m15754() {
        return this.f18455;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m15751() {
        return this.f18450;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int m15755() {
        return this.f18450;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ܺ */
    public final int mo11412() {
        return this.f18449;
    }

    @Override // l.InterfaceC8619
    public final int getSendBufferSize() {
        return this.f18455;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final int m15753() {
        return this.f18456;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo11406(int i) {
        return (this.f18454 & i) == i;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo11404() {
        m12793().getClass();
        return mo11406(4096);
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo11410() {
        return (this.f18456 & 4) == 4;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11415(InterfaceC21299 interfaceC21299) {
        if (interfaceC21299 instanceof AbstractC3971) {
            AbstractC3971 abstractC3971 = (AbstractC3971) interfaceC21299;
            abstractC3971.m12785(this.f18456);
            abstractC3971.m12792(abstractC3971.mo12783() || this.f18448);
            if (abstractC3971.m12781()) {
                abstractC3971.m12785(32768);
            }
            if (abstractC3971 instanceof AbstractC10461) {
                ((AbstractC10461) abstractC3971).m26882(this.f18455);
            }
        }
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۙ */
    public final void mo11400(InterfaceC17965 interfaceC17965) {
        if (interfaceC17965 instanceof AbstractC3971) {
            ((AbstractC3971) interfaceC17965).m12792(this.f18448);
        }
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo11407() {
        C21125 c21125 = this.f18452;
        return c21125.f67495 || c21125.f67481;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo11413() {
        return this.f18452.f67481;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final C21125 m15750() {
        return this.f18452;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        int iM2318 = C0481.m2318(i, bArr);
        this.f18451 = iM2318;
        int i2 = i + 2;
        if (iM2318 > 10) {
            return i2 - i;
        }
        int i3 = i + 3;
        byte b = bArr[i2];
        C21125 c21125 = this.f18452;
        c21125.f67496 = b & 255;
        c21125.f67485 = b & 1;
        c21125.f67482 = (b & 2) == 2;
        c21125.f67495 = (b & 4) == 4;
        c21125.f67481 = (b & 8) == 8;
        c21125.f67492 = C0481.m2318(i3, bArr);
        c21125.f67487 = C0481.m2318(i + 5, bArr);
        c21125.f67491 = C0481.m2322(i + 7, bArr);
        c21125.f67486 = C0481.m2322(i + 11, bArr);
        c21125.f67488 = C0481.m2322(i + 15, bArr);
        c21125.f67480 = C0481.m2322(i + 19, bArr);
        c21125.f67489 = C0481.m2324(i + 23, bArr);
        int iM2319 = C0481.m2318(i + 31, bArr);
        if (iM2319 > 32767) {
            iM2319 = (65536 - iM2319) * (-1);
        }
        c21125.f67490 = iM2319;
        c21125.f67484 = bArr[i + 33] & 255;
        return (i + 34) - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        int i2;
        int iM53449;
        C21125 c21125 = this.f18452;
        if ((c21125.f67480 & Integer.MIN_VALUE) == 0) {
            int i3 = c21125.f67484;
            byte[] bArr2 = new byte[i3];
            c21125.f67493 = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i3);
            int i4 = c21125.f67484;
            i2 = i + i4;
            if (this.f13598 > i4) {
                if ((this.f18456 & 32768) == 32768) {
                    iM53449 = C23933.m53454(i2, 256, bArr);
                    c21125.f67483 = C23933.m53453(i2, iM53449, bArr);
                } else {
                    iM53449 = C23933.m53449(i2, 256, bArr);
                    c21125.f67483 = C23933.m53450(bArr, i2, iM53449, m12793());
                }
                i2 += iM53449;
            } else {
                c21125.f67483 = new String();
            }
        } else {
            byte[] bArr3 = new byte[16];
            c21125.f67494 = bArr3;
            System.arraycopy(bArr, i, bArr3, 0, 16);
            int length = c21125.f67494.length + i;
            c21125.f67483 = new String();
            int i5 = this.f13598;
            if (i5 > 16) {
                int i6 = i5 - 16;
                c21125.f67484 = i6;
                byte[] bArr4 = new byte[i6];
                c21125.f67493 = bArr4;
                System.arraycopy(bArr, length, bArr4, 0, i6);
                InterfaceC25186 interfaceC25186 = f18447;
                if (interfaceC25186.mo13707()) {
                    interfaceC25186.mo13721("Have initial token ".concat(C6033.m17504(c21125.f67493, 0, c21125.f67484)));
                }
            }
            i2 = length;
        }
        return i2 - i;
    }

    @Override // l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNegotiateResponse[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        sb.append(this.f13609);
        sb.append(",dialectIndex=");
        sb.append(this.f18451);
        sb.append(",securityMode=0x");
        C21125 c21125 = this.f18452;
        C8008.m21876(c21125.f67496, 1, ",security=", sb);
        sb.append(c21125.f67485 == 0 ? "share" : "user");
        sb.append(",encryptedPasswords=");
        sb.append(c21125.f67482);
        sb.append(",maxMpxCount=");
        sb.append(c21125.f67492);
        sb.append(",maxNumberVcs=");
        sb.append(c21125.f67487);
        sb.append(",maxBufferSize=");
        sb.append(c21125.f67491);
        sb.append(",maxRawSize=");
        sb.append(c21125.f67486);
        sb.append(",sessionKey=0x");
        C8008.m21876(c21125.f67488, 8, ",capabilities=0x", sb);
        sb.append(C6033.m17503(c21125.f67480, 8));
        sb.append(",serverTime=");
        sb.append(new Date(c21125.f67489));
        sb.append(",serverTimeZone=");
        sb.append(c21125.f67490);
        sb.append(",encryptionKeyLength=");
        sb.append(c21125.f67484);
        sb.append(",byteCount=");
        sb.append(this.f13598);
        sb.append(",oemDomainName=");
        return new String(C8947.m23910(sb, c21125.f67483, "]"));
    }
}
