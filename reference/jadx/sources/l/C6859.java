package l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z728 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6859 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f23137;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f23137 = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        String str = C17983.f57504;
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18482(OutputStream outputStream) {
        C2023.m6510(this.f23137);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f23137 = false;
    }
}
