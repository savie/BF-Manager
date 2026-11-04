package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.ۨ᩷ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J76H */
/* JADX INFO: loaded from: classes4.dex */
public final class C12623 extends Writer {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C20828 f40483 = new C20828();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18459 f40484;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40485;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C12623(C18459 c18459) {
        this.f40484 = c18459;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        m31331((char) i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            m31331(cArr[i]);
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
            m31331(str.charAt(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31332() {
        if (this.f40485 != this.f40484.length()) {
            throw f40483;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31331(char c) {
        int i = this.f40485;
        C18459 c18459 = this.f40484;
        if (i < c18459.length()) {
            int i2 = this.f40485;
            this.f40485 = i2 + 1;
            if (c18459.charAt(i2) == c) {
                return;
            }
        }
        throw f40483;
    }
}
