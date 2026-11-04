package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۖܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2797 extends Writer {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Writer f9203;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9206 = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f9204 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f9205 = 0;

    public C2797(Writer writer) {
        this.f9203 = writer;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.f9203.write(i);
        this.f9205++;
        if (i == 10) {
            this.f9206++;
            this.f9204 = 1;
        } else {
            this.f9204++;
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        this.f9203.write(str, i, i2);
        this.f9205 += i2;
        for (int i3 = 0; i3 < i2; i3++) {
            if (str.charAt(i + i3) == '\n') {
                this.f9206++;
                this.f9204 = 1;
            } else {
                this.f9204++;
            }
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        this.f9203.write(cArr, i, i2);
        this.f9205 += i2;
        for (int i3 = 0; i3 < i2; i3++) {
            if (cArr[i + i3] == '\n') {
                this.f9206++;
                this.f9204 = 1;
            } else {
                this.f9204++;
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f9203.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9203.close();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m9259() {
        return this.f9206;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9258() {
        return this.f9204;
    }

    public final int getPosition() {
        return this.f9205;
    }
}
