package l;

import java.util.Date;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.᩺ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9V3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23154 extends AbstractC14792 implements InterfaceC4207 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f75156 = C13488.m32997(C23154.class);

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f75157;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f75158;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f75159;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f75160;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public C9853 f75161;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f75162;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f75163;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f75164;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f75165;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        return 0;
    }

    public C23154(InterfaceC19067 interfaceC19067) {
        super(interfaceC19067.mo29449());
        this.f75161 = new C9853();
        this.f75163 = ((C9895) interfaceC19067.mo29449()).m25043();
        this.f75158 = ((C9895) interfaceC19067.mo29449()).m25040();
        this.f75160 = ((C9895) interfaceC19067.mo29449()).m25074();
        this.f75164 = ((C9895) interfaceC19067.mo29449()).m25059();
        this.f75165 = ((C9895) interfaceC19067.mo29449()).m25084();
        this.f75157 = ((C9895) interfaceC19067.mo29449()).m25063();
        this.f75162 = ((C9895) interfaceC19067.mo29449()).m25083();
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ֨ */
    public final EnumC16245 mo11862() {
        return EnumC16245.SMB1;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۛ */
    public final int mo11866() {
        return this.f75157;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11864(InterfaceC19067 interfaceC19067) {
        return m35454().equals(interfaceC19067.mo29449());
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11865(InterfaceC19067 interfaceC19067, InterfaceC13381 interfaceC13381) {
        if (this.f75159 > 10) {
            return false;
        }
        C9853 c9853 = this.f75161;
        int i = c9853.f33645 & Integer.MIN_VALUE;
        InterfaceC4314 interfaceC4314 = f75156;
        if (i != Integer.MIN_VALUE && c9853.f33650 != 8 && ((C9895) interfaceC19067.mo29449()).m25054() == 0) {
            interfaceC4314.mo12116("Unexpected encryption key length: " + c9853.f33650);
            return false;
        }
        if (interfaceC13381.mo18580() || c9853.f33649) {
            this.f75158 |= 4;
            if (interfaceC13381.mo18580() || c9853.f33649) {
                this.f75158 |= 16;
            }
        } else {
            if (c9853.f33655) {
                interfaceC19067.mo29449().getClass();
            }
            this.f75158 &= 65515;
        }
        if (interfaceC4314.mo12125()) {
            StringBuilder sb = new StringBuilder("Signing ");
            sb.append((this.f75158 & 4) != 0 ? "enabled " : "not-enabled ");
            sb.append((this.f75158 & 16) != 0 ? AnnotationHandler.REQUIRED : "not-required");
            interfaceC4314.mo12135(sb.toString());
        }
        int iMin = Math.min(this.f75160, c9853.f33656);
        this.f75160 = iMin;
        if (iMin < 1) {
            this.f75160 = 1;
        }
        this.f75164 = Math.min(this.f75164, c9853.f33647);
        this.f75165 = Math.min(this.f75165, c9853.f33647);
        this.f75157 = Math.min(this.f75157, c9853.f33647);
        int i2 = this.f75163;
        int i3 = c9853.f33645;
        int i4 = i2 & i3;
        this.f75163 = i4;
        if ((i3 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f75163 = i4 | Integer.MIN_VALUE;
        }
        if (((C9895) interfaceC19067.mo29449()).m25083()) {
            this.f75163 |= 4;
        } else {
            interfaceC19067.mo29449().getClass();
        }
        if ((this.f75163 & 4) == 0) {
            interfaceC19067.mo29449().getClass();
            this.f75162 = false;
            this.f75158 &= EnumC23529.f76192;
        } else {
            this.f75162 = ((C9895) interfaceC19067.mo29449()).m25083();
        }
        if (this.f75162) {
            interfaceC4314.mo12135("Unicode is enabled");
            return true;
        }
        interfaceC4314.mo12135("Unicode is disabled");
        return true;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m51148() {
        return this.f75163;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int m51150() {
        return this.f75164;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int m51149() {
        return this.f75160;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int m51152() {
        return this.f75160;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ܶ */
    public final int mo11871() {
        return this.f75165;
    }

    @Override // l.InterfaceC4207
    public final int getSendBufferSize() {
        return this.f75164;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int m51151() {
        return this.f75158;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo11869(int i) {
        return (this.f75163 & i) == i;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo11868() {
        m35454().getClass();
        return mo11869(4096);
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo11872() {
        return (this.f75158 & 4) == 4;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ܰ */
    public final void mo11870(InterfaceC3314 interfaceC3314) {
        if (interfaceC3314 instanceof AbstractC14792) {
            AbstractC14792 abstractC14792 = (AbstractC14792) interfaceC3314;
            abstractC14792.m35455(this.f75158);
            abstractC14792.m35453(abstractC14792.mo23399() || this.f75162);
            if (abstractC14792.m35449()) {
                abstractC14792.m35455(32768);
            }
            if (abstractC14792 instanceof AbstractC2712) {
                ((AbstractC2712) abstractC14792).m8262(this.f75164);
            }
        }
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۙ */
    public final void mo11863(InterfaceC9522 interfaceC9522) {
        if (interfaceC9522 instanceof AbstractC14792) {
            ((AbstractC14792) interfaceC9522).m35453(this.f75162);
        }
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo11867() {
        C9853 c9853 = this.f75161;
        return c9853.f33655 || c9853.f33649;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo11873() {
        return this.f75161.f33649;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final C9853 m51147() {
        return this.f75161;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        int iM13545 = C4850.m13545(i, bArr);
        this.f75159 = iM13545;
        int i2 = i + 2;
        if (iM13545 > 10) {
            return i2 - i;
        }
        int i3 = i + 3;
        byte b = bArr[i2];
        C9853 c9853 = this.f75161;
        c9853.f33659 = b & 255;
        c9853.f33648 = b & 1;
        c9853.f33646 = (b & 2) == 2;
        c9853.f33655 = (b & 4) == 4;
        c9853.f33649 = (b & 8) == 8;
        c9853.f33656 = C4850.m13545(i3, bArr);
        c9853.f33658 = C4850.m13545(i + 5, bArr);
        c9853.f33647 = C4850.m13549(i + 7, bArr);
        c9853.f33643 = C4850.m13549(i + 11, bArr);
        c9853.f33654 = C4850.m13549(i + 15, bArr);
        c9853.f33645 = C4850.m13549(i + 19, bArr);
        c9853.f33653 = C4850.m13543(i + 23, bArr);
        int iM13546 = C4850.m13545(i + 31, bArr);
        if (iM13546 > 32767) {
            iM13546 = (65536 - iM13546) * (-1);
        }
        c9853.f33657 = iM13546;
        c9853.f33650 = bArr[i + 33] & 255;
        return (i + 34) - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        int i2;
        int iM27415;
        C9853 c9853 = this.f75161;
        if ((c9853.f33645 & Integer.MIN_VALUE) == 0) {
            int i3 = c9853.f33650;
            byte[] bArr2 = new byte[i3];
            c9853.f33652 = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i3);
            int i4 = c9853.f33650;
            i2 = i + i4;
            if (this.f48372 > i4) {
                if ((this.f75158 & 32768) == 32768) {
                    iM27415 = C10933.m27420(i2, 256, bArr);
                    c9853.f33651 = C10933.m27419(i2, iM27415, bArr);
                } else {
                    iM27415 = C10933.m27415(i2, 256, bArr);
                    c9853.f33651 = C10933.m27416(bArr, i2, iM27415, m35454());
                }
                i2 += iM27415;
            } else {
                c9853.f33651 = new String();
            }
        } else {
            byte[] bArr3 = new byte[16];
            c9853.f33644 = bArr3;
            System.arraycopy(bArr, i, bArr3, 0, 16);
            int length = c9853.f33644.length + i;
            c9853.f33651 = new String();
            int i5 = this.f48372;
            if (i5 > 16) {
                int i6 = i5 - 16;
                c9853.f33650 = i6;
                byte[] bArr4 = new byte[i6];
                c9853.f33652 = bArr4;
                System.arraycopy(bArr, length, bArr4, 0, i6);
                InterfaceC4314 interfaceC4314 = f75156;
                if (interfaceC4314.mo12125()) {
                    interfaceC4314.mo12135("Have initial token ".concat(C5993.m16281(c9853.f33652, 0, c9853.f33650)));
                }
            }
            i2 = length;
        }
        return i2 - i;
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNegotiateResponse[");
        sb.append(super.toString());
        sb.append(",wordCount=");
        sb.append(this.f48376);
        sb.append(",dialectIndex=");
        sb.append(this.f75159);
        sb.append(",securityMode=0x");
        C9853 c9853 = this.f75161;
        C18855.m43491(c9853.f33659, 1, ",security=", sb);
        sb.append(c9853.f33648 == 0 ? "share" : "user");
        sb.append(",encryptedPasswords=");
        sb.append(c9853.f33646);
        sb.append(",maxMpxCount=");
        sb.append(c9853.f33656);
        sb.append(",maxNumberVcs=");
        sb.append(c9853.f33658);
        sb.append(",maxBufferSize=");
        sb.append(c9853.f33647);
        sb.append(",maxRawSize=");
        sb.append(c9853.f33643);
        sb.append(",sessionKey=0x");
        C18855.m43491(c9853.f33654, 8, ",capabilities=0x", sb);
        sb.append(C5993.m16280(c9853.f33645, 8));
        sb.append(",serverTime=");
        sb.append(new Date(c9853.f33653));
        sb.append(",serverTimeZone=");
        sb.append(c9853.f33657);
        sb.append(",encryptionKeyLength=");
        sb.append(c9853.f33650);
        sb.append(",byteCount=");
        sb.append(this.f48372);
        sb.append(",oemDomainName=");
        return new String(C22697.m50267(sb, c9853.f33651, "]"));
    }
}
