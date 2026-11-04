package l;

import java.io.Writer;

/* JADX INFO: renamed from: l.֡ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q2RQ */
/* JADX INFO: loaded from: classes2.dex */
public class C0560 extends Writer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18459 f2293;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public C0560() {
        this.f2293 = new C18459();
    }

    public C0560(int i) {
        this.f2293 = new C18459(i);
    }

    public C0560(C18459 c18459) {
        this.f2293 = c18459;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.f2293.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f2293.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.f2293.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.f2293.append((char) i);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f2293.m43007(cArr);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.f2293.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f2293.m43010(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f2293.m43008(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18459 m2566() {
        return this.f2293;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2567() {
        this.f2293.m43009(0);
    }

    public final String toString() {
        return this.f2293.toString();
    }
}
