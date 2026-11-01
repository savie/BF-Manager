package l;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2921 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13598 f10981;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC2307 f10982 = new C5744(this);

    public C2921(File file) {
        this.f10981 = C13598.m33221(file, 201105, 2, 10485760L);
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f10981.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10981.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m8746(InterfaceC23683 interfaceC23683) throws IOException {
        try {
            long jMo16416 = interfaceC23683.mo16416();
            String strMo16426 = interfaceC23683.mo16426();
            if (jMo16416 >= 0 && jMo16416 <= 2147483647L && strMo16426.isEmpty()) {
                return (int) jMo16416;
            }
            throw new IOException("expected an int but was \"" + jMo16416 + strMo16426 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
