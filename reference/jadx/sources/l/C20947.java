package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.᩷ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20947 extends BufferedInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f68273;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17419 f68274;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f68273) {
            return;
        }
        this.f68273 = true;
        super.close();
        ExecutorService executorService = C4716.f16636;
        final InterfaceC17419 interfaceC17419 = this.f68274;
        executorService.submit(new Runnable() { // from class: l.۟ܶ֨
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC17419 interfaceC174110 = interfaceC17419;
                try {
                    int iM40607 = interfaceC174110.m40607();
                    if (iM40607 < 100 || iM40607 >= 300) {
                        interfaceC174110.mo17113();
                        throw null;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    interfaceC174110.m40599(0L);
                    int i = C16714.f53507;
                    C17648.m41122(interfaceC174110);
                    throw th;
                }
                interfaceC174110.m40599(0L);
                int i2 = C16714.f53507;
                C17648.m41122(interfaceC174110);
            }
        });
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20947(C16714 c16714, InputStream inputStream, InterfaceC17419 interfaceC17419) {
        super(inputStream);
        this.f68274 = interfaceC17419;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
