package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.᩵ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5WC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19208 extends Writer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public StringBuilder f62032 = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m44126();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m44126();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m44126();
            } else {
                this.f62032.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44126() {
        StringBuilder sb = this.f62032;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }
}
