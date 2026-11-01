package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۡ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: SA1S */
/* JADX INFO: loaded from: classes4.dex */
public final class C9148 implements InterfaceC19731 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f31093;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f31094;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f31095;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f31096;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f31097 = 0;

    @Override // l.InterfaceC22553
    public final long getSize() {
        throw null;
    }

    @Override // l.InterfaceC20478
    public final int size() {
        return 40;
    }

    @Override // l.InterfaceC20436
    /* JADX INFO: renamed from: ܰ */
    public final byte mo3043() {
        return (byte) 4;
    }

    public C9148(int i, long j, long j2, long j3) {
        this.f31093 = j;
        this.f31096 = j2;
        this.f31094 = j3;
        this.f31095 = i;
    }

    @Override // l.InterfaceC22553
    public final int getAttributes() {
        return this.f31095;
    }

    @Override // l.InterfaceC22553
    /* JADX INFO: renamed from: ᩻ */
    public final long mo10132() {
        return this.f31094;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f31093 = C4850.m13543(i, bArr);
        this.f31096 = C4850.m13543(i + 8, bArr);
        this.f31094 = C4850.m13543(i + 16, bArr);
        this.f31097 = C4850.m13543(i + 24, bArr);
        this.f31095 = C4850.m13549(i + 32, bArr);
        return (i + 36) - i;
    }

    @Override // l.InterfaceC20478
    /* JADX INFO: renamed from: ۙ */
    public final int mo1806(int i, byte[] bArr) {
        C4850.m13544(this.f31093, i, bArr);
        C4850.m13544(this.f31096, i + 8, bArr);
        C4850.m13544(this.f31094, i + 16, bArr);
        C4850.m13544(this.f31097, i + 24, bArr);
        C4850.m13550(this.f31095, i + 32, bArr);
        return (i + 40) - i;
    }

    public final String toString() {
        return new String("SmbQueryFileBasicInfo[createTime=" + new Date(this.f31093) + ",lastAccessTime=" + new Date(this.f31096) + ",lastWriteTime=" + new Date(this.f31094) + ",changeTime=" + new Date(this.f31097) + ",attributes=0x" + C5993.m16280(this.f31095, 4) + "]");
    }
}
