package l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;

/* JADX INFO: renamed from: l.֡۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8A0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0302 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2037 f1632;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13223 f1633;

    public C0302(ByteArrayInputStream byteArrayInputStream) {
        C13223 c13223 = new C13223(byteArrayInputStream);
        this.f1633 = c13223;
        this.f1632 = new C2037(c13223);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1882(EnumC18947 enumC18947) {
        if (enumC18947 == EnumC18947.ONE) {
            return;
        }
        long jM43975 = enumC18947.m43975();
        C13223 c13223 = this.f1633;
        long jM32768 = (((long) (~enumC18947.m43975())) & (c13223.m32768() + jM43975)) - c13223.m32768();
        while (true) {
            long j = jM32768 - 1;
            if (jM32768 <= 0) {
                return;
            }
            m1879();
            jM32768 = j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1881(InterfaceC9996 interfaceC9996) {
        interfaceC9996.mo12848(this);
        interfaceC9996.mo10601(this);
        interfaceC9996.mo10598(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1883(byte[] bArr) {
        this.f1632.readFully(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1880(int i) throws EOFException {
        if (i != this.f1632.skipBytes(i)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m1879() {
        return (byte) this.f1632.readUnsignedByte();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short m1887() {
        return (short) this.f1632.readUnsignedShort();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char m1886() {
        return (char) this.f1632.readUnsignedShort();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m1884() {
        return this.f1632.readInt();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m1885() {
        return ((long) this.f1632.readInt()) & 4294967295L;
    }
}
