package l;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۧۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11426 extends Writer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f35933;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1732 f35934 = new C1732();

    public C11426(StringBuilder sb) {
        this.f35933 = sb;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        C1732 c1732 = this.f35934;
        c1732.m6137(cArr);
        this.f35933.append((CharSequence) c1732, i, i2 + i);
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        CharSequence charSequence = this.f35933;
        if (charSequence instanceof Flushable) {
            ((Flushable) charSequence).flush();
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        CharSequence charSequence = this.f35933;
        if (charSequence instanceof Closeable) {
            ((Closeable) charSequence).close();
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.f35933.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        C17359.requireNonNull(str);
        this.f35933.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f35933.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f35933.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f35933.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f35933.append(charSequence, i, i2);
        return this;
    }
}
