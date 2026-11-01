package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩹ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22050 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f71468;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f71469;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f71470;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48993() {
        CRC32 crc32 = new CRC32();
        crc32.update(this.f71469 & 255);
        crc32.update((this.f71469 >>> 8) & 255);
        crc32.update((this.f71469 >>> 16) & 255);
        crc32.update((this.f71469 >>> 24) & 255);
        crc32.update(this.f71470);
        this.f71468 = (int) crc32.getValue();
    }

    public final String toString() {
        byte[] bArr = new byte[4];
        C15157.m36338(0, this.f71469, bArr);
        return new String(bArr) + " dataLen=" + this.f71470.length;
    }
}
