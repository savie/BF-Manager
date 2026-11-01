package l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;

/* JADX INFO: renamed from: l.ܶۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8A0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15132 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14923 f49447;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6455 f49448;

    public C15132(ByteArrayInputStream byteArrayInputStream) {
        C6455 c6455 = new C6455(byteArrayInputStream);
        this.f49448 = c6455;
        this.f49447 = new C14923(c6455);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36284(EnumC17953 enumC17953) {
        if (enumC17953 == EnumC17953.ONE) {
            return;
        }
        long jM41778 = enumC17953.m41778();
        C6455 c6455 = this.f49448;
        long jM17643 = (((long) (~enumC17953.m41778())) & (c6455.m17643() + jM41778)) - c6455.m17643();
        while (true) {
            long j = jM17643 - 1;
            if (jM17643 <= 0) {
                return;
            }
            m36282();
            jM17643 = j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36285(InterfaceC18659 interfaceC18659) {
        interfaceC18659.mo7579(this);
        interfaceC18659.mo7580(this);
        interfaceC18659.mo7578(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36286(byte[] bArr) {
        this.f49447.readFully(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36283(int i) throws EOFException {
        if (i != this.f49447.skipBytes(i)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m36282() {
        return (byte) this.f49447.readUnsignedByte();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final short m36281() {
        return (short) this.f49447.readUnsignedShort();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char m36289() {
        return (char) this.f49447.readUnsignedShort();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m36287() {
        return ((long) this.f49447.readInt()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m36288() {
        return this.f49447.readInt();
    }
}
