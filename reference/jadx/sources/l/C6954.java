package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۜۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6954 extends AbstractC6209 implements InterfaceC1162 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f22962;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f22963;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f22964;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f22965;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public long f22966;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22967;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public long f22968;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f22969;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f22970;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public byte f22971;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public long f22972;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public long f22973;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f22974;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f22975;

    @Override // l.InterfaceC1162
    public final long getSize() {
        throw null;
    }

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

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C6954(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m19252() {
        return this.f22969;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19255() {
        return this.f22964;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final void m19251() {
        this.f22964 = true;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final int m19254() {
        return this.f22963;
    }

    @Override // l.InterfaceC1162
    public final int getAttributes() {
        return this.f22970;
    }

    @Override // l.InterfaceC1162
    /* JADX INFO: renamed from: ۡ */
    public final long mo4305() {
        return this.f22966;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final long m19253() {
        return this.f22974;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        this.f22971 = bArr[i];
        this.f22963 = C0481.m2318(i + 1, bArr);
        this.f22975 = C0481.m2322(i + 3, bArr);
        this.f22973 = C0481.m2324(i + 7, bArr);
        this.f22968 = C0481.m2324(i + 15, bArr);
        this.f22966 = C0481.m2324(i + 23, bArr);
        this.f22972 = C0481.m2324(i + 31, bArr);
        this.f22970 = C0481.m2322(i + 39, bArr);
        this.f22965 = C0481.m2320(i + 43, bArr);
        this.f22974 = C0481.m2320(i + 51, bArr);
        this.f22969 = C0481.m2318(i + 59, bArr);
        this.f22962 = C0481.m2318(i + 61, bArr);
        int i2 = i + 64;
        this.f22967 = (bArr[i + 63] & 255) > 0;
        return i2 - i;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNTCreateAndXResponse[");
        sb.append(super.toString());
        sb.append(",oplockLevel=");
        sb.append((int) this.f22971);
        sb.append(",fid=");
        sb.append(this.f22963);
        sb.append(",createAction=0x");
        sb.append(C6033.m17503(this.f22975, 4));
        sb.append(",creationTime=");
        sb.append(new Date(this.f22973));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f22968));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f22966));
        sb.append(",changeTime=");
        sb.append(new Date(this.f22972));
        sb.append(",extFileAttributes=0x");
        C8008.m21876(this.f22970, 4, ",allocationSize=", sb);
        sb.append(this.f22965);
        sb.append(",endOfFile=");
        sb.append(this.f22974);
        sb.append(",fileType=");
        sb.append(this.f22969);
        sb.append(",deviceState=");
        sb.append(this.f22962);
        sb.append(",directory=");
        sb.append(this.f22967);
        sb.append("]");
        return new String(sb.toString());
    }
}
