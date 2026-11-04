package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9443 */
/* JADX INFO: loaded from: classes4.dex */
public class C12363 extends AbstractC17540 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f39714;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo30843() {
        throw null;
    }

    @Override // l.AbstractC17540, l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) throws EOFException {
        if (this.f39714) {
            c1879.skip(j);
            return;
        }
        try {
            super.mo6066(c1879, j);
        } catch (IOException unused) {
            this.f39714 = true;
            mo30843();
        }
    }

    @Override // l.AbstractC17540, l.InterfaceC7099, java.io.Flushable
    public final void flush() {
        if (this.f39714) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f39714 = true;
            mo30843();
        }
    }

    @Override // l.AbstractC17540, l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39714) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f39714 = true;
            mo30843();
        }
    }
}
