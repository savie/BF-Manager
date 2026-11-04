package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ᩳܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N1T0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19174 extends AbstractC1275 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CRC32 f62030 = new CRC32();

    public C19174() {
        this.f4589 = 4;
        this.f4588 = "CRC32";
    }

    @Override // l.AbstractC1275
    /* JADX INFO: renamed from: ۙ */
    public final void mo4663(byte[] bArr, int i, int i2) {
        this.f62030.update(bArr, i, i2);
    }

    @Override // l.AbstractC1275
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo4664() {
        byte[] bArr = new byte[4];
        CRC32 crc32 = this.f62030;
        C21338.m48570(0, (int) crc32.getValue(), bArr);
        crc32.reset();
        return bArr;
    }
}
