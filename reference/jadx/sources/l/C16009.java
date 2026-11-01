package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16009 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f51825;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17419 f51827;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16009(C16714 c16714, OutputStream outputStream, InterfaceC17419 interfaceC17419, OutputStream outputStream2) {
        super(outputStream);
        this.f51827 = interfaceC17419;
        this.f51825 = outputStream2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0059 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x005a  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IOException e;
        boolean z;
        OutputStream outputStream = this.f51825;
        InterfaceC17419 interfaceC17419 = this.f51827;
        if (this.f51826) {
            return;
        }
        try {
            super.close();
            e = null;
            if (!interfaceC17419.m40593()) {
                interfaceC17419.mo17113();
                throw null;
            }
            if (outputStream instanceof C13892) {
                try {
                    ((C13892) outputStream).m33730();
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                int i = C16714.f53507;
                C17648.m41122(interfaceC17419);
            }
            if (e == null) {
                throw e;
            }
        } catch (IOException e3) {
            if (outputStream instanceof C13892) {
                try {
                    ((C13892) outputStream).m33730();
                } catch (IOException e4) {
                    e3.addSuppressed(e4);
                }
            }
            e = e3;
        } finally {
            if (outputStream instanceof C13892) {
                try {
                    ((C13892) outputStream).m33730();
                } catch (IOException unused) {
                }
            }
            int i2 = C16714.f53507;
            C17648.m41120(interfaceC17419);
            this.f51826 = true;
        }
        int i3 = C16714.f53507;
        C17648.m41120(interfaceC17419);
        if (e == null) {
            throw e;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
