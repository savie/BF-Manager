package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18558 extends Writer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f59043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17852 f59044 = new C17852();

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C18558(StringBuilder sb) {
        this.f59043 = sb;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        C17852 c17852 = this.f59044;
        c17852.m41441(cArr);
        this.f59043.append((CharSequence) c17852, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.f59043.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        C13638.requireNonNull(str);
        this.f59043.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f59043.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f59043.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f59043.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f59043.append(charSequence, i, i2);
        return this;
    }
}
