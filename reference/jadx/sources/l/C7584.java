package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۟ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6MY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7584 extends Reader {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18167 f25111;

    public C7584(InputStream inputStream, Charset charset, C10428 c10428) {
        this.f25111 = new C18167(C14165.m34239(inputStream, charset, c10428));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20103() {
        int iM42290 = this.f25111.m42290();
        if (iM42290 != 2) {
            return iM42290 != 3 ? "\n" : "\r\n";
        }
        return "\r";
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f25111.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f25111.close();
    }
}
