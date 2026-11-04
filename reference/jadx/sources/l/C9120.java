package l;

import java.io.IOException;
import java.io.PipedOutputStream;

/* JADX INFO: renamed from: l.ۡۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes4.dex */
public final class C9120 extends C0918 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PipedOutputStream f29614;

    @Override // java.io.PipedInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        PipedOutputStream pipedOutputStream = this.f29614;
        if (pipedOutputStream != null) {
            pipedOutputStream.close();
        }
        this.f29614 = null;
    }
}
