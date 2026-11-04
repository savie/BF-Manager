package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18069 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f59148;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f59149;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0916 f59150;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18069(C18815 c18815, OutputStream outputStream, InterfaceC0916 interfaceC0916, OutputStream outputStream2) {
        super(outputStream);
        this.f59150 = interfaceC0916;
        this.f59149 = outputStream2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0059 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x005a  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IOException e;
        boolean z;
        OutputStream outputStream = this.f59149;
        InterfaceC0916 interfaceC0916 = this.f59150;
        if (this.f59148) {
            return;
        }
        try {
            super.close();
            e = null;
            if (!interfaceC0916.m3710()) {
                interfaceC0916.mo3698();
                throw null;
            }
            if (outputStream instanceof C10610) {
                try {
                    ((C10610) outputStream).m27094();
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                int i = C18815.f61138;
                C1507.m5361(interfaceC0916);
            }
            if (e == null) {
                throw e;
            }
        } catch (IOException e3) {
            if (outputStream instanceof C10610) {
                try {
                    ((C10610) outputStream).m27094();
                } catch (IOException e4) {
                    e3.addSuppressed(e4);
                }
            }
            e = e3;
        } finally {
            if (outputStream instanceof C10610) {
                try {
                    ((C10610) outputStream).m27094();
                } catch (IOException unused) {
                }
            }
            int i2 = C18815.f61138;
            C1507.m5360(interfaceC0916);
            this.f59148 = true;
        }
        int i3 = C18815.f61138;
        C1507.m5360(interfaceC0916);
        if (e == null) {
            throw e;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
