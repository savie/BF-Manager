package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֡۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H6MY */
/* JADX INFO: loaded from: classes2.dex */
public final class C0287 extends Reader {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6254 f1597;

    public C0287(InputStream inputStream, Charset charset, C0352 c0352) {
        this.f1597 = new C6254(C21916.m49604(inputStream, charset, c0352));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m1853() {
        int iM17903 = this.f1597.m17903();
        if (iM17903 != 2) {
            return iM17903 != 3 ? "\n" : "\r\n";
        }
        return "\r";
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f1597.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1597.close();
    }
}
