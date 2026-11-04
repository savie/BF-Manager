package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA06 */
/* JADX INFO: loaded from: classes.dex */
public final class C22617 implements InterfaceC2149 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f73083;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f73084;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f73085;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f73086;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f73087;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f73088;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f73089;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f73090;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f73091;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f73092;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String[] f73093;

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        int iM2318 = C0481.m2318(i, bArr);
        this.f73087 = iM2318;
        if (iM2318 != 3 && iM2318 != 1) {
            throw new C3640(C12669.m31437(this.f73087, " referral not supported. Please report this to jcifs at samba dot org.", new StringBuilder("Version ")));
        }
        this.f73084 = C0481.m2318(i + 2, bArr);
        this.f73089 = C0481.m2318(i + 4, bArr);
        this.f73086 = C0481.m2318(i + 6, bArr);
        int i3 = i + 8;
        int i4 = this.f73087;
        if (i4 == 3) {
            this.f73083 = C0481.m2318(i3, bArr);
            this.f73085 = C0481.m2318(i + 10, bArr);
            int i5 = i + 12;
            if ((this.f73086 & 2) == 0) {
                int iM2319 = C0481.m2318(i5, bArr);
                int iM23110 = C0481.m2318(i + 14, bArr);
                int iM23111 = C0481.m2318(i + 16, bArr);
                if (iM2319 > 0) {
                    this.f73092 = m50966(iM2319 + i, i2, bArr);
                }
                if (iM23111 > 0) {
                    this.f73091 = m50966(iM23111 + i, i2, bArr);
                }
                if (iM23110 > 0) {
                    this.f73090 = m50966(i + iM23110, i2, bArr);
                }
            } else {
                int iM23112 = C0481.m2318(i5, bArr);
                int iM23113 = C0481.m2318(i + 14, bArr);
                int iM23114 = C0481.m2318(i + 16, bArr);
                if (iM23112 > 0) {
                    this.f73088 = m50966(iM23112 + i, i2, bArr);
                }
                if (iM23114 > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < iM23113; i6++) {
                        String strM50966 = m50966(i + iM23114, i2, bArr);
                        arrayList.add(strM50966);
                        iM23114 += (strM50966.length() * 2) + 2;
                    }
                    this.f73093 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
            }
        } else if (i4 == 1) {
            this.f73091 = m50966(i3, i2, bArr);
        }
        return this.f73084;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m50966(int i, int i2, byte[] bArr) {
        if (i % 2 != 0) {
            i++;
        }
        return C23933.m53453(i, C23933.m53454(i, i2, bArr), bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Referral[version=");
        sb.append(this.f73087);
        sb.append(",size=");
        sb.append(this.f73084);
        sb.append(",serverType=");
        sb.append(this.f73089);
        sb.append(",flags=");
        sb.append(this.f73086);
        sb.append(",proximity=");
        sb.append(this.f73083);
        sb.append(",ttl=");
        sb.append(this.f73085);
        sb.append(",path=");
        sb.append(this.f73092);
        sb.append(",altPath=");
        sb.append(this.f73090);
        sb.append(",node=");
        return new String(C8947.m23910(sb, this.f73091, "]"));
    }
}
