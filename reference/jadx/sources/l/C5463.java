package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۚۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SA1S */
/* JADX INFO: loaded from: classes3.dex */
public final class C5463 implements InterfaceC12920 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f19058;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f19059;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19060;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f19061;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f19062 = 0;

    @Override // l.InterfaceC1162
    public final long getSize() {
        throw null;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        return 40;
    }

    @Override // l.InterfaceC17395
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo10574() {
        return (byte) 4;
    }

    public C5463(int i, long j, long j2, long j3) {
        this.f19061 = j;
        this.f19058 = j2;
        this.f19059 = j3;
        this.f19060 = i;
    }

    @Override // l.InterfaceC1162
    public final int getAttributes() {
        return this.f19060;
    }

    @Override // l.InterfaceC1162
    /* JADX INFO: renamed from: ۡ */
    public final long mo4305() {
        return this.f19059;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f19061 = C0481.m2324(i, bArr);
        this.f19058 = C0481.m2324(i + 8, bArr);
        this.f19059 = C0481.m2324(i + 16, bArr);
        this.f19062 = C0481.m2324(i + 24, bArr);
        this.f19060 = C0481.m2322(i + 32, bArr);
        return (i + 36) - i;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        C0481.m2325(this.f19061, i, bArr);
        C0481.m2325(this.f19058, i + 8, bArr);
        C0481.m2325(this.f19059, i + 16, bArr);
        C0481.m2325(this.f19062, i + 24, bArr);
        C0481.m2323(this.f19060, i + 32, bArr);
        return (i + 40) - i;
    }

    public final String toString() {
        return new String("SmbQueryFileBasicInfo[createTime=" + new Date(this.f19061) + ",lastAccessTime=" + new Date(this.f19058) + ",lastWriteTime=" + new Date(this.f19059) + ",changeTime=" + new Date(this.f19062) + ",attributes=0x" + C6033.m17503(this.f19060, 4) + "]");
    }
}
