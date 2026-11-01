package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.֫᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2RQ */
/* JADX INFO: loaded from: classes2.dex */
public class C2093 extends Writer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14795 f7729;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C2093() {
        this.f7729 = new C14795();
    }

    public C2093(int i) {
        this.f7729 = new C14795(i);
    }

    public C2093(C14795 c14795) {
        this.f7729 = c14795;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.f7729.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f7729.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.f7729.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.f7729.append((char) i);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f7729.m35463(cArr);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.f7729.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f7729.m35466(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f7729.m35464(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14795 m6635() {
        return this.f7729;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m6636() {
        this.f7729.m35465(0);
    }

    public final String toString() {
        return this.f7729.toString();
    }
}
