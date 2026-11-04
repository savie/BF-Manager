package l;

import java.util.Date;

/* JADX INFO: renamed from: l.֫ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9V7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1734 implements InterfaceC9627, InterfaceC2149 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f5920;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f5921;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f5922;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f5923;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f5924;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f5925;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f5926;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f5927;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f5928;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f5929;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f5930;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5878 f5931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f5932;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f5933;

    @Override // l.InterfaceC9627
    public final int getType() {
        return 1;
    }

    public C1734(InterfaceC5878 interfaceC5878, boolean z) {
        this.f5931 = interfaceC5878;
        this.f5923 = z;
    }

    @Override // l.InterfaceC9627
    public final String getName() {
        return this.f5927;
    }

    @Override // l.InterfaceC9627
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo6139() {
        return this.f5921;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m6142() {
        return this.f5927;
    }

    @Override // l.InterfaceC9627
    public final int getAttributes() {
        return this.f5928;
    }

    @Override // l.InterfaceC9627
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo6140() {
        return this.f5926;
    }

    @Override // l.InterfaceC9627
    public final long length() {
        return this.f5932;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m6141() {
        return this.f5924;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo6138(int i, int i2, byte[] bArr) {
        String strM53450;
        this.f5924 = C0481.m2322(i, bArr);
        this.f5921 = C0481.m2322(i + 4, bArr);
        this.f5920 = C0481.m2324(i + 8, bArr);
        this.f5922 = C0481.m2324(i + 16, bArr);
        this.f5926 = C0481.m2324(i + 24, bArr);
        this.f5933 = C0481.m2324(i + 32, bArr);
        this.f5932 = C0481.m2320(i + 40, bArr);
        this.f5930 = C0481.m2320(i + 48, bArr);
        this.f5928 = C0481.m2322(i + 56, bArr);
        int iM2322 = C0481.m2322(i + 60, bArr);
        this.f5925 = C0481.m2322(i + 64, bArr);
        this.f5929 = C23933.m53453(i + 70, bArr[i + 68] & 255, bArr);
        int i3 = i + 94;
        if (this.f5923) {
            if (iM2322 > 0) {
                int i4 = i3 + iM2322;
                if (bArr[i4 - 1] == 0 && bArr[i4 - 2] == 0) {
                    iM2322 -= 2;
                }
            }
            strM53450 = C23933.m53453(i3, iM2322, bArr);
        } else {
            if (iM2322 > 0 && bArr[(i3 + iM2322) - 1] == 0) {
                iM2322--;
            }
            strM53450 = C23933.m53450(bArr, i3, iM2322, this.f5931);
        }
        this.f5927 = strM53450;
        return i - (i3 + iM2322);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbFindFileBothDirectoryInfo[nextEntryOffset=");
        sb.append(this.f5924);
        sb.append(",fileIndex=");
        sb.append(this.f5921);
        sb.append(",creationTime=");
        sb.append(new Date(this.f5920));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f5922));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f5926));
        sb.append(",changeTime=");
        sb.append(new Date(this.f5933));
        sb.append(",endOfFile=");
        sb.append(this.f5932);
        sb.append(",allocationSize=");
        sb.append(this.f5930);
        sb.append(",extFileAttributes=");
        sb.append(this.f5928);
        sb.append(",eaSize=");
        sb.append(this.f5925);
        sb.append(",shortName=");
        sb.append(this.f5929);
        sb.append(",filename=");
        return new String(C8947.m23910(sb, this.f5927, "]"));
    }
}
