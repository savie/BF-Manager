package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.ۗۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J76H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3199 extends Writer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C9551 f11982 = new C9551();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14795 f11983;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f11984;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C3199(C14795 c14795) {
        this.f11983 = c14795;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        m9613((char) i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            m9613(cArr[i]);
            i++;
        }
    }

    @Override // java.io.Writer
    public final void write(String str) {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            m9613(str.charAt(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9614() {
        if (this.f11984 != this.f11983.length()) {
            throw f11982;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9613(char c) {
        int i = this.f11984;
        C14795 c14795 = this.f11983;
        if (i < c14795.length()) {
            int i2 = this.f11984;
            this.f11984 = i2 + 1;
            if (c14795.charAt(i2) == c) {
                return;
            }
        }
        throw f11982;
    }
}
