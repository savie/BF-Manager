package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܺܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I13O */
/* JADX INFO: loaded from: classes5.dex */
public final class C16945 implements InterfaceC16199 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CRC32 f55355 = new CRC32();

    public final String toString() {
        return "CRC32";
    }

    @Override // l.InterfaceC16199
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo38425() {
        CRC32 crc32 = this.f55355;
        int value = (int) crc32.getValue();
        crc32.reset();
        return new byte[]{(byte) ((value >>> 24) & 255), (byte) ((value >>> 16) & 255), (byte) ((value >>> 8) & 255), (byte) (value & 255)};
    }

    @Override // l.InterfaceC16199
    /* JADX INFO: renamed from: ۙ */
    public final void mo38424(C5759 c5759) {
        this.f55355.update(c5759.m16831(), 0, c5759.m16833());
    }
}
