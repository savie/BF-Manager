package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ܶᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: WA10 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15393 extends AbstractC11264 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f50103;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f50104;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f50105;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f50106;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C15393(int i, int i2, int i3, int i4, String str, InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, (byte) 45, str);
        this.f50104 = i4;
        int i5 = i & 3;
        this.f50106 = i5;
        if (i5 == 3) {
            this.f50106 = 2;
        }
        int i6 = i2 & 1;
        if (i6 != 0 && (i2 & 2) != 0) {
            this.f50106 |= 64;
        } else if (i2 == 0) {
            this.f50106 |= 16;
        } else if ((i2 & 2) == 0) {
            this.f50106 |= 32;
        } else if (i6 == 0) {
            this.f50106 |= 48;
        } else {
            this.f50106 |= 16;
        }
        this.f50106 &= -2;
        this.f50103 = 22;
        if ((i3 & 64) == 64) {
            if ((i3 & 16) == 16) {
                this.f50105 = 18;
                return;
            } else {
                this.f50105 = 2;
                return;
            }
        }
        if ((i3 & 16) != 16) {
            this.f50105 = 1;
        } else if ((i3 & 32) == 32) {
            this.f50105 = 16;
        } else {
            this.f50105 = 17;
        }
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        long j = 0;
        C4850.m13546(j, i, bArr);
        C4850.m13546(this.f50106, i + 2, bArr);
        C4850.m13546(this.f50103, i + 4, bArr);
        C4850.m13546(this.f50104, i + 6, bArr);
        C4850.m13550(j, i + 8, bArr);
        C4850.m13546(this.f50105, i + 12, bArr);
        C4850.m13550(j, i + 14, bArr);
        int i2 = i + 18;
        int i3 = 0;
        while (i3 < 8) {
            bArr[i2] = 0;
            i3++;
            i2++;
        }
        return i2 - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int i2;
        if (m35449()) {
            i2 = i + 1;
            bArr[i] = 0;
        } else {
            i2 = i;
        }
        return (i2 + m35440(this.f48357, i2, bArr)) - i;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComOpenAndX[");
        sb.append(super.toString());
        sb.append(",flags=0x");
        sb.append(C5993.m16280(0, 2));
        sb.append(",desiredAccess=0x");
        C18855.m43491(this.f50106, 4, ",searchAttributes=0x", sb);
        C18855.m43491(this.f50103, 4, ",fileAttributes=0x", sb);
        sb.append(C5993.m16280(this.f50104, 4));
        sb.append(",creationTime=");
        sb.append(new Date(0));
        sb.append(",openFunction=0x");
        C18855.m43491(this.f50105, 2, ",allocationSize=0,fileName=", sb);
        return new String(C22697.m50267(sb, this.f48357, "]"));
    }
}
