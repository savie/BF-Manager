package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.۠۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1T0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8194 extends AbstractC8900 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CRC32 f28551 = new CRC32();

    public C8194() {
        this.f30540 = 4;
        this.f30539 = "CRC32";
    }

    @Override // l.AbstractC8900
    /* JADX INFO: renamed from: ۙ */
    public final void mo19985(byte[] bArr, int i, int i2) {
        this.f28551.update(bArr, i, i2);
    }

    @Override // l.AbstractC8900
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo19986() {
        byte[] bArr = new byte[4];
        CRC32 crc32 = this.f28551;
        C2641.m8156(0, (int) crc32.getValue(), bArr);
        crc32.reset();
        return bArr;
    }
}
