package l;

import java.util.Date;

/* JADX INFO: renamed from: l.᩷᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WA10 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22396 extends AbstractC6209 {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f72500;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f72501;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f72502;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f72503;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C22396(int i, int i2, int i3, int i4, String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 45, str);
        this.f72501 = i4;
        int i5 = i & 3;
        this.f72500 = i5;
        if (i5 == 3) {
            this.f72500 = 2;
        }
        int i6 = i2 & 1;
        if (i6 != 0 && (i2 & 2) != 0) {
            this.f72500 |= 64;
        } else if (i2 == 0) {
            this.f72500 |= 16;
        } else if ((i2 & 2) == 0) {
            this.f72500 |= 32;
        } else if (i6 == 0) {
            this.f72500 |= 48;
        } else {
            this.f72500 |= 16;
        }
        this.f72500 &= -2;
        this.f72502 = 22;
        if ((i3 & 64) == 64) {
            if ((i3 & 16) == 16) {
                this.f72503 = 18;
                return;
            } else {
                this.f72503 = 2;
                return;
            }
        }
        if ((i3 & 16) != 16) {
            this.f72503 = 1;
        } else if ((i3 & 32) == 32) {
            this.f72503 = 16;
        } else {
            this.f72503 = 17;
        }
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        long j = 0;
        C0481.m2319(j, i, bArr);
        C0481.m2319(this.f72500, i + 2, bArr);
        C0481.m2319(this.f72502, i + 4, bArr);
        C0481.m2319(this.f72501, i + 6, bArr);
        C0481.m2323(j, i + 8, bArr);
        C0481.m2319(this.f72503, i + 12, bArr);
        C0481.m2323(j, i + 14, bArr);
        int i2 = i + 18;
        int i3 = 0;
        while (i3 < 8) {
            bArr[i2] = 0;
            i3++;
            i2++;
        }
        return i2 - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int i2;
        if (m12781()) {
            i2 = i + 1;
            bArr[i] = 0;
        } else {
            i2 = i;
        }
        return (i2 + m12758(this.f13608, i2, bArr)) - i;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComOpenAndX[");
        sb.append(super.toString());
        sb.append(",flags=0x");
        sb.append(C6033.m17503(0, 2));
        sb.append(",desiredAccess=0x");
        C8008.m21876(this.f72500, 4, ",searchAttributes=0x", sb);
        C8008.m21876(this.f72502, 4, ",fileAttributes=0x", sb);
        sb.append(C6033.m17503(this.f72501, 4));
        sb.append(",creationTime=");
        sb.append(new Date(0));
        sb.append(",openFunction=0x");
        C8008.m21876(this.f72503, 2, ",allocationSize=0,fileName=", sb);
        return new String(C8947.m23910(sb, this.f13608, "]"));
    }
}
