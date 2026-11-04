package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۤܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34615;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f34616;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f34617;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27773() {
        CRC32 crc32 = new CRC32();
        crc32.update(this.f34616 & 255);
        crc32.update((this.f34616 >>> 8) & 255);
        crc32.update((this.f34616 >>> 16) & 255);
        crc32.update((this.f34616 >>> 24) & 255);
        crc32.update(this.f34617);
        this.f34615 = (int) crc32.getValue();
    }

    public final String toString() {
        byte[] bArr = new byte[4];
        C6929.m19210(0, this.f34616, bArr);
        return new String(bArr) + " dataLen=" + this.f34617.length;
    }
}
