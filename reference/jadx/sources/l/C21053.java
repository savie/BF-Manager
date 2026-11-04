package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩶ۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21053 extends BufferedInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f67285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0916 f67286;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21053(C18815 c18815, InputStream inputStream, InterfaceC0916 interfaceC0916) {
        super(inputStream);
        this.f67286 = interfaceC0916;
        this.f67285 = new AtomicBoolean();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f67285.compareAndSet(false, true)) {
            super.close();
            ExecutorService executorService = C5261.f18540;
            final InterfaceC0916 interfaceC0916 = this.f67286;
            executorService.submit(new Runnable() { // from class: l.ܰۘ۫
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC0916 interfaceC0917 = interfaceC0916;
                    try {
                        int iM3692 = interfaceC0917.m3692();
                        if (iM3692 < 100 || iM3692 >= 300) {
                            interfaceC0917.mo3698();
                            throw null;
                        }
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        interfaceC0917.m3688(0L);
                        int i = C18815.f61138;
                        C1507.m5361(interfaceC0917);
                        throw th;
                    }
                    interfaceC0917.m3688(0L);
                    int i2 = C18815.f61138;
                    C1507.m5361(interfaceC0917);
                }
            });
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
