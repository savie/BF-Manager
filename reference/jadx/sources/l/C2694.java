package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۖᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2694 extends Writer {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Writer f10385;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10386 = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f10384 = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f10383 = 0;

    public C2694(Writer writer) {
        this.f10385 = writer;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.f10385.write(i);
        this.f10383++;
        if (i == 10) {
            this.f10386++;
            this.f10384 = 1;
        } else {
            this.f10384++;
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        this.f10385.write(str, i, i2);
        this.f10383 += i2;
        for (int i3 = 0; i3 < i2; i3++) {
            if (str.charAt(i + i3) == '\n') {
                this.f10386++;
                this.f10384 = 1;
            } else {
                this.f10384++;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        this.f10385.write(cArr, i, i2);
        this.f10383 += i2;
        for (int i3 = 0; i3 < i2; i3++) {
            if (cArr[i + i3] == '\n') {
                this.f10386++;
                this.f10384 = 1;
            } else {
                this.f10384++;
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f10385.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10385.close();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m8227() {
        return this.f10386;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8226() {
        return this.f10384;
    }

    public final int getPosition() {
        return this.f10383;
    }
}
