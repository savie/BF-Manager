package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۖܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2620 implements Closeable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13911 f10236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f10237;

    public C2620(InterfaceC13911 interfaceC13911) {
        this.f10236 = interfaceC13911;
        InputStream inputStreamMo10545 = interfaceC13911.mo10545();
        this.f10237 = inputStreamMo10545;
        inputStreamMo10545.mark(1048576);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m8091(boolean z) throws IOException {
        InputStream inputStream = this.f10237;
        if (inputStream != null) {
            try {
                inputStream.reset();
            } catch (IOException unused) {
                close();
            }
        }
        if (this.f10237 == null) {
            this.f10237 = this.f10236.mo10545();
        }
        this.f10237.mark(z ? 1048576 : 0);
        return this.f10237;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f10237;
        this.f10237 = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
