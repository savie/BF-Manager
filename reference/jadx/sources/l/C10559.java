package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۤ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M9V7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10559 implements InterfaceC22180, InterfaceC7778 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC10601 f36141;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f36142;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f36143;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f36144;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f36145;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f36146;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f36147;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f36148;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f36149;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f36150;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f36151;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f36152;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f36153;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f36154;

    @Override // l.InterfaceC22180
    public final int getType() {
        return 1;
    }

    public C10559(InterfaceC10601 interfaceC10601, boolean z) {
        this.f36141 = interfaceC10601;
        this.f36144 = z;
    }

    @Override // l.InterfaceC22180
    public final String getName() {
        return this.f36154;
    }

    @Override // l.InterfaceC22180
    /* JADX INFO: renamed from: ۨ */
    public final int mo24728() {
        return this.f36147;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m26711() {
        return this.f36154;
    }

    @Override // l.InterfaceC22180
    public final int getAttributes() {
        return this.f36145;
    }

    @Override // l.InterfaceC22180
    /* JADX INFO: renamed from: ۡ */
    public final long mo24727() {
        return this.f36142;
    }

    @Override // l.InterfaceC22180
    public final long length() {
        return this.f36152;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m26712() {
        return this.f36146;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        String strM27416;
        this.f36146 = C4850.m13549(i, bArr);
        this.f36147 = C4850.m13549(i + 4, bArr);
        this.f36151 = C4850.m13543(i + 8, bArr);
        this.f36149 = C4850.m13543(i + 16, bArr);
        this.f36142 = C4850.m13543(i + 24, bArr);
        this.f36153 = C4850.m13543(i + 32, bArr);
        this.f36152 = C4850.m13547(i + 40, bArr);
        this.f36150 = C4850.m13547(i + 48, bArr);
        this.f36145 = C4850.m13549(i + 56, bArr);
        int iM13549 = C4850.m13549(i + 60, bArr);
        this.f36148 = C4850.m13549(i + 64, bArr);
        this.f36143 = C10933.m27419(i + 70, bArr[i + 68] & 255, bArr);
        int i3 = i + 94;
        if (this.f36144) {
            if (iM13549 > 0) {
                int i4 = i3 + iM13549;
                if (bArr[i4 - 1] == 0 && bArr[i4 - 2] == 0) {
                    iM13549 -= 2;
                }
            }
            strM27416 = C10933.m27419(i3, iM13549, bArr);
        } else {
            if (iM13549 > 0 && bArr[(i3 + iM13549) - 1] == 0) {
                iM13549--;
            }
            strM27416 = C10933.m27416(bArr, i3, iM13549, this.f36141);
        }
        this.f36154 = strM27416;
        return i - (i3 + iM13549);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbFindFileBothDirectoryInfo[nextEntryOffset=");
        sb.append(this.f36146);
        sb.append(",fileIndex=");
        sb.append(this.f36147);
        sb.append(",creationTime=");
        sb.append(new Date(this.f36151));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f36149));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f36142));
        sb.append(",changeTime=");
        sb.append(new Date(this.f36153));
        sb.append(",endOfFile=");
        sb.append(this.f36152);
        sb.append(",allocationSize=");
        sb.append(this.f36150);
        sb.append(",extFileAttributes=");
        sb.append(this.f36145);
        sb.append(",eaSize=");
        sb.append(this.f36148);
        sb.append(",shortName=");
        sb.append(this.f36143);
        sb.append(",filename=");
        return new String(C22697.m50267(sb, this.f36154, "]"));
    }
}
