package l;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3611 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20568 f12370;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6398 f12371 = new C11814(this);

    public C3611(File file) {
        this.f12370 = C20568.m47148(file, 201105, 2, 10485760L);
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f12370.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12370.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m11716(InterfaceC25000 interfaceC25000) throws IOException {
        try {
            long jMo4173 = interfaceC25000.mo4173();
            String strMo4185 = interfaceC25000.mo4185();
            if (jMo4173 >= 0 && jMo4173 <= 2147483647L && strMo4185.isEmpty()) {
                return (int) jMo4173;
            }
            throw new IOException("expected an int but was \"" + jMo4173 + strMo4185 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
