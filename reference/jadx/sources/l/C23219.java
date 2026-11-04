package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩹֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5WC */
/* JADX INFO: loaded from: classes.dex */
public final class C23219 extends Writer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public StringBuilder f75226 = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m52134();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m52134();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m52134();
            } else {
                this.f75226.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52134() {
        StringBuilder sb = this.f75226;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }
}
