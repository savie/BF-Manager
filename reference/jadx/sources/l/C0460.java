package l;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.֡ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0460 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f2080;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23683 f2081;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte f2082;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short f2083;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f2084;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2085;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C0460(InterfaceC23683 interfaceC23683) {
        this.f2081 = interfaceC23683;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f2085;
            InterfaceC23683 interfaceC23683 = this.f2081;
            if (i3 == 0) {
                interfaceC23683.skip(this.f2083);
                this.f2083 = (short) 0;
                if ((this.f2082 & 4) == 0) {
                    i = this.f2084;
                    int iM39155 = C16689.m39155(interfaceC23683);
                    this.f2085 = iM39155;
                    this.f2080 = iM39155;
                    byte b = (byte) (interfaceC23683.readByte() & 255);
                    this.f2082 = (byte) (interfaceC23683.readByte() & 255);
                    Logger logger = C16689.f53464;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C2576.m8028(true, this.f2084, this.f2080, b, this.f2082));
                    }
                    i2 = interfaceC23683.readInt() & Integer.MAX_VALUE;
                    this.f2084 = i2;
                    if (b != 9) {
                        C2576.m8030("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                        throw null;
                    }
                }
            } else {
                long jMo2293 = interfaceC23683.mo2293(c6043, Math.min(8192L, i3));
                if (jMo2293 != -1) {
                    this.f2085 = (int) (((long) this.f2085) - jMo2293);
                    return jMo2293;
                }
            }
            return -1L;
        } while (i2 == i);
        C2576.m8030("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20591 mo2292() {
        return this.f2081.mo2292();
    }
}
