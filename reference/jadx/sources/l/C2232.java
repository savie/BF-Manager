package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.֫᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6EN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2232 extends Writer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f7319 = new StringBuilder();

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        StringBuilder sb = this.f7319;
        if (i2 > 16777216 - sb.length()) {
            throw new IOException("Snapshot exceeds XML size limit");
        }
        sb.append(cArr, i, i2);
    }

    public final String toString() {
        return this.f7319.toString();
    }
}
