package l;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ᩴ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19494 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public short f62928;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC25000 f62929;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte f62930;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f62932;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62933;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C19494(InterfaceC25000 interfaceC25000) {
        this.f62929 = interfaceC25000;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f62933;
            InterfaceC25000 interfaceC25000 = this.f62929;
            if (i3 == 0) {
                interfaceC25000.skip(this.f62928);
                this.f62928 = (short) 0;
                if ((this.f62930 & 4) == 0) {
                    i = this.f62932;
                    int iM36166 = C15018.m36166(interfaceC25000);
                    this.f62933 = iM36166;
                    this.f62931 = iM36166;
                    byte b = (byte) (interfaceC25000.readByte() & 255);
                    this.f62930 = (byte) (interfaceC25000.readByte() & 255);
                    Logger logger = C15018.f49053;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C6180.m17813(true, this.f62932, this.f62931, b, this.f62930));
                    }
                    i2 = interfaceC25000.readInt() & Integer.MAX_VALUE;
                    this.f62932 = i2;
                    if (b != 9) {
                        C6180.m17815("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                        throw null;
                    }
                }
            } else {
                long jMo4186 = interfaceC25000.mo4186(c1879, Math.min(8192L, i3));
                if (jMo4186 != -1) {
                    this.f62933 = (int) (((long) this.f62933) - jMo4186);
                    return jMo4186;
                }
            }
            return -1L;
        } while (i2 == i);
        C6180.m17815("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f62929.mo4181();
    }
}
