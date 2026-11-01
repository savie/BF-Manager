package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩻᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes.dex */
public final class C23937 implements InterfaceC4076, AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13250 f77523;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f77524;

    @Override // l.InterfaceC4076
    /* JADX INFO: renamed from: ۙ */
    public final synchronized InputStream mo6416() {
        InputStream inputStream;
        inputStream = this.f77524;
        if (inputStream == null) {
            throw new IOException("Prepared text input is closed or already opened");
        }
        this.f77524 = null;
        return inputStream;
    }

    public C23937(C13250 c13250, InputStream inputStream) {
        this.f77523 = c13250;
        this.f77524 = inputStream;
    }

    @Override // l.InterfaceC4076
    public final C13250 identity() {
        return this.f77523;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f77524;
            this.f77524 = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
