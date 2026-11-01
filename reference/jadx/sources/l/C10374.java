package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۤܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I13O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10374 implements InterfaceC20957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CRC32 f35543 = new CRC32();

    public final String toString() {
        return "CRC32";
    }

    @Override // l.InterfaceC20957
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo26268() {
        CRC32 crc32 = this.f35543;
        int value = (int) crc32.getValue();
        crc32.reset();
        return new byte[]{(byte) ((value >>> 24) & 255), (byte) ((value >>> 16) & 255), (byte) ((value >>> 8) & 255), (byte) (value & 255)};
    }

    @Override // l.InterfaceC20957
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26267(C18840 c18840) {
        this.f35543.update(c18840.m43470(), 0, c18840.m43472());
    }
}
