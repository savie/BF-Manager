package l;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: renamed from: l.ܺۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2RQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16816 extends Writer implements Serializable {
    public static final long serialVersionUID = -146927496096066153L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f54257;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C16816() {
        this.f54257 = new StringBuilder();
    }

    public C16816(StringBuilder sb) {
        this.f54257 = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        this.f54257.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        this.f54257.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f54257.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f54257.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f54257.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f54257.append(charSequence, i, i2);
        return this;
    }

    public final String toString() {
        return this.f54257.toString();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            C5125.m15499(cArr, i, i2);
            this.f54257.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f54257.append(str);
        }
    }
}
