package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2309 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0817 f7470;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f7471;

    public C2309(InterfaceC0817 interfaceC0817) {
        this.f7470 = interfaceC0817;
        InputStream inputStreamMo3286 = interfaceC0817.mo3286();
        this.f7471 = inputStreamMo3286;
        inputStreamMo3286.mark(1048576);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m7798(boolean z) throws IOException {
        InputStream inputStream = this.f7471;
        if (inputStream != null) {
            try {
                inputStream.reset();
            } catch (IOException unused) {
                close();
            }
        }
        if (this.f7471 == null) {
            this.f7471 = this.f7470.mo3286();
        }
        this.f7471.mark(z ? 1048576 : 0);
        return this.f7471;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f7471;
        this.f7471 = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
