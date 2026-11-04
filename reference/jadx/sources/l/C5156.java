package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۙ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5156 implements InterfaceC23473, AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16013 f17996;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f17997;

    @Override // l.InterfaceC23473
    /* JADX INFO: renamed from: ۙ */
    public final synchronized InputStream mo5931() {
        InputStream inputStream;
        inputStream = this.f17997;
        if (inputStream == null) {
            throw new IOException("Prepared text input is closed or already opened");
        }
        this.f17997 = null;
        return inputStream;
    }

    public C5156(C16013 c16013, InputStream inputStream) {
        this.f17996 = c16013;
        this.f17997 = inputStream;
    }

    @Override // l.InterfaceC23473
    public final C16013 identity() {
        return this.f17996;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f17997;
            this.f17997 = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
