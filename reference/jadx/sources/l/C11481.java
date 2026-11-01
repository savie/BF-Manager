package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9443 */
/* JADX INFO: loaded from: classes4.dex */
public class C11481 extends AbstractC1809 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f38649;

    /* JADX INFO: renamed from: ۙ */
    public void mo5331() {
        throw null;
    }

    @Override // l.AbstractC1809, l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) throws EOFException {
        if (this.f38649) {
            c6043.skip(j);
            return;
        }
        try {
            super.mo5901(c6043, j);
        } catch (IOException unused) {
            this.f38649 = true;
            mo5331();
        }
    }

    @Override // l.AbstractC1809, l.InterfaceC8597, java.io.Flushable
    public final void flush() {
        if (this.f38649) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f38649 = true;
            mo5331();
        }
    }

    @Override // l.AbstractC1809, l.InterfaceC8597, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38649) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f38649 = true;
            mo5331();
        }
    }
}
